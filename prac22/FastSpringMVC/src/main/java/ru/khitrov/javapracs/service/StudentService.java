package ru.khitrov.javapracs.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.mapping.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.khitrov.javapracs.models.Student;
import ru.khitrov.javapracs.repositories.StudentRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class StudentService {

    private final StudentRepository studentRepository;

    @PersistenceContext
    private EntityManager em;

    public Student create(Student student) {
        return studentRepository.save(student);
    }


    public List<Student> findAll() {
        log.info("Find all students");
        return studentRepository.findAll();
    }

    public void delete(int id) {
        studentRepository.deleteById(id);
    }

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
