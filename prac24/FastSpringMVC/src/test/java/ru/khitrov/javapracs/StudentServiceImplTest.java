package ru.khitrov.javapracs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.khitrov.javapracs.models.Student;
import ru.khitrov.javapracs.repositories.StudentRepository;
import ru.khitrov.javapracs.service.StudentService;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class StudentServiceImplTest {

    @Mock
    private StudentRepository studentRepository;

    @Captor
    ArgumentCaptor<Student> captor;

    @Test
    void getStudents() {

        Student student = new Student();
        student.setFirstName("Nikita");

        Student student2 = new Student();
        student2.setFirstName("Egor");

        Mockito.when(studentRepository.findAll()).thenReturn(List.of(student, student2));

        StudentService studentService = new StudentService(studentRepository);
        Assertions.assertEquals(2, studentService.findAll().size());
        Assertions.assertEquals("Nikita", studentService.findAll().get(0).getFirstName());

    }


    @Test
    void create() {

        Student student = new Student();
        student.setFirstName("Sanya");

        StudentService studentService = new StudentService(studentRepository);

        studentService.create(student);


        Mockito.verify(studentRepository).save(captor.capture());
        Student captured = captor.getValue();

        Assertions.assertEquals("Sanya", captured.getFirstName());
    }
}