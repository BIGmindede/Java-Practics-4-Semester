package ru.khitrov.javapracs.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.khitrov.javapracs.models.Student;

import java.util.List;

@NoArgsConstructor
@Component
public class StudentDAO {

    @PersistenceContext
    private EntityManager em;

    public List<Student> findAll() {
        Session session = em.unwrap(Session.class);
        return session
                .createQuery("SELECT s from Student s", Student.class).getResultList();
    }

    @Transactional
    public void save(Student student) {
        Session session = em.unwrap(Session.class);
        session.persist(student);
        session.close();
    }

    @Transactional
    public void delete(String name) {
        Session session = em.unwrap(Session.class);

        Object student = session
                .createQuery("From Student where firstName =: name").setParameter("name", name).getSingleResult();
        session.remove(student);

        session.close();
    }





}
