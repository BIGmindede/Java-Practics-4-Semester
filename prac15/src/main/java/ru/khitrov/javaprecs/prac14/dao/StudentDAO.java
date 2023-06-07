package ru.khitrov.javaprecs.prac14.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.khitrov.javaprecs.prac14.models.Student;

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

        String hql = ("From Student where firstName =: name");

        Object student = session.createQuery(hql).setParameter("name", name).getSingleResult();
        session.remove(student);

        session.close();
    }





}
