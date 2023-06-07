package ru.khitrov.javapracs.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import ru.khitrov.javapracs.models.Student;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    @PersistenceContext
    private EntityManager em;

    public List<Student> sortStudentByFirstName() {
        Session session = em.unwrap(Session.class);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Student> studentCriteriaQuery = builder.createQuery(Student.class);
        Root<Student> root = studentCriteriaQuery.from(Student.class);

        studentCriteriaQuery.select(root).orderBy(builder.asc(root.get("firstName")));
        return session.createQuery(studentCriteriaQuery).getResultList();
    }

    public List<Student> sortStudentByLastName() {
        Session session = em.unwrap(Session.class);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Student> studentCriteriaQuery = builder.createQuery(Student.class);
        Root<Student> root = studentCriteriaQuery.from(Student.class);

        studentCriteriaQuery.select(root).orderBy(builder.asc(root.get("lastName")));
        return session.createQuery(studentCriteriaQuery).getResultList();
    }

    public List<Student> sortStudentByMiddleName() {
        Session session = em.unwrap(Session.class);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Student> studentCriteriaQuery = builder.createQuery(Student.class);
        Root<Student> root = studentCriteriaQuery.from(Student.class);

        studentCriteriaQuery.select(root).orderBy(builder.asc(root.get("middleName")));
        return session.createQuery(studentCriteriaQuery).getResultList();
    }


}
