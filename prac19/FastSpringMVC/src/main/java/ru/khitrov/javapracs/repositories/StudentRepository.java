package ru.khitrov.javapracs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.khitrov.javapracs.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
