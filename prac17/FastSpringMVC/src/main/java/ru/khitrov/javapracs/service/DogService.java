package ru.khitrov.javapracs.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import ru.khitrov.javapracs.models.Dog;
import ru.khitrov.javapracs.models.Student;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DogService {

    @PersistenceContext
    private EntityManager em;

    public Student getStudentByDog(int dogId) {

        Session session = em.unwrap(Session.class);


        return session.createQuery("from Dog where id =: dogId", Dog.class)
                .setParameter("dogId",dogId).getSingleResult().getStudent();
    }

    public List<Dog> sortDogsByBreed() {
        Session session = em.unwrap(Session.class);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Dog> dogCriteriaQuery = builder.createQuery(Dog.class);
        Root<Dog> root = dogCriteriaQuery.from(Dog.class);

        dogCriteriaQuery.select(root).orderBy(builder.asc(root.get("breed")));
        return session.createQuery(dogCriteriaQuery).getResultList();
    }

    public List<Dog> sortDogsByName() {
        Session session = em.unwrap(Session.class);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Dog> dogCriteriaQuery = builder.createQuery(Dog.class);
        Root<Dog> root = dogCriteriaQuery.from(Dog.class);

        dogCriteriaQuery.select(root).orderBy(builder.asc(root.get("name")));
        return session.createQuery(dogCriteriaQuery).getResultList();
    }


}
