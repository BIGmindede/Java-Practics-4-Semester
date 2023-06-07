package ru.khitrov.javapracs.controllers;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.khitrov.javapracs.util.LogExecutionTime;
import ru.khitrov.javapracs.models.Dog;
import ru.khitrov.javapracs.models.Student;
import ru.khitrov.javapracs.service.DogService;
import ru.khitrov.javapracs.service.EmailService;
import ru.khitrov.javapracs.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {


    private final EmailService emailService;
    private final DogService dogService;
    private final StudentService studentService;

    public StudentController(EmailService emailService, DogService dogService, StudentService studentService) {
        this.emailService = emailService;
        this.dogService = dogService;
        this.studentService = studentService;
    }

    @GetMapping()
    @LogExecutionTime
    public List<Student> getStudents(Model model) {
        return studentService.findAll();
    }

    @PostMapping()
    @LogExecutionTime
    public ResponseEntity<HttpEntity> addStudent(@RequestBody Student student) {

        emailService.sendAddStudentEmail(student);
        studentService.create(student);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    @LogExecutionTime
    public HttpStatus delete(@PathVariable("id") int id) {
        studentService.delete(id);
        return HttpStatus.OK;
    }

    @GetMapping("/dog/{dogId}/student")
    public Student getDogStudent(@PathVariable("dogId") int dogId) {
        return dogService.getStudentByDog(dogId);
    }

    @GetMapping("/dog/sort_by_breed")
    public List<Dog> getSortedByBreedDogs() {
        return dogService.sortDogsByBreed();
    }

    @GetMapping("/dog/sort_by_name")
    public List<Dog> getSortedByNameDogs() {
        return dogService.sortDogsByName();
    }

    @GetMapping("/sort_by_middle_name")
    public List<Student> getSortedStudentsByMiddleName() {
        return studentService.sortStudentByMiddleName();
    }

    @GetMapping("/sort_by_first_name")
    public List<Student> getSortedStudentsByFirstName() {
        return studentService.sortStudentByFirstName();
    }

    @GetMapping("/sort_by_last_name")
    public List<Student> getSortedStudentsByLastName() {
        return studentService.sortStudentByLastName();
    }

}
