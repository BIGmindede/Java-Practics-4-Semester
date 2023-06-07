package ru.khitrov.javapracs.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import ru.khitrov.javapracs.models.Dog;
import ru.khitrov.javapracs.models.Student;

@Service
@RequiredArgsConstructor
public class DogService {

    @PersistenceContext
    private EntityManager em;

    public Student getStudentByDog(int dogId) {
        Session session = em.unwrap(Session.class);
        return session.createQuery("From Dog where id =: dogId", Dog.class)
                .setParameter("dogId",dogId).getSingleResult().getStudent();
    }
}
