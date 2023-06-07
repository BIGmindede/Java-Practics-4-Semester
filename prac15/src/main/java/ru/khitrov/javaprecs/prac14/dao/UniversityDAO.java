package ru.khitrov.javaprecs.prac14.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.khitrov.javaprecs.prac14.models.University;

import java.util.List;

@NoArgsConstructor
@Component
public class UniversityDAO {

    @PersistenceContext
    private EntityManager em;

    public List<University> findAll() {
        Session session = em.unwrap(Session.class);
        return session
                .createQuery("SELECT u from University u", University.class).getResultList();
    }

    @Transactional
    public void save(University university) {
        Session session = em.unwrap(Session.class);
        session.persist(university);
        session.close();
    }

    @Transactional
    public void delete(String name) {
        Session session = em.unwrap(Session.class);

        String hql = ("From University where name =: name");

        Object student = session.createQuery(hql).setParameter("name", name).getSingleResult();
        session.remove(student);

        session.close();
    }





}
