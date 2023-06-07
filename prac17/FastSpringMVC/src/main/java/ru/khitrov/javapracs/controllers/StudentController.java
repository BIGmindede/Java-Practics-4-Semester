package ru.khitrov.javapracs.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.khitrov.javapracs.dao.StudentDAO;
import ru.khitrov.javapracs.models.Dog;
import ru.khitrov.javapracs.models.Student;
import ru.khitrov.javapracs.service.DogService;
import ru.khitrov.javapracs.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentDAO dao;
    private final DogService dogService;
    private final StudentService studentService;

    public StudentController(StudentDAO dao, DogService dogService, StudentService studentService) {
        this.dao = dao;
        this.dogService = dogService;
        this.studentService = studentService;
    }

    @GetMapping()
    public String getStudents(Model model) {
        model.addAttribute("students", dao.findAll());
        return "index";
    }

    @GetMapping("/new")
    public String addStudent(@ModelAttribute("student") Student student) {
        return "new";
    }

    @PostMapping()
    public String create(@ModelAttribute("student") Student student) {
        dao.save(student);
        return "redirect:/students";
    }

    @GetMapping("/delete/{firstName}")
    public String delete(@PathVariable("firstName") String firstName) {
        dao.delete(firstName);
        return "redirect:/students";
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
