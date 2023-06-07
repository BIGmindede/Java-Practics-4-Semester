package ru.khitrov.javaprecs.prac14.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.khitrov.javaprecs.prac14.models.Student;

@Controller
@RequestMapping("/students")
public class StudentController {

    private final Student student;

    public StudentController(Student student) {
        this.student = student;
    }

    @GetMapping()
    public String getStudents(Model model) {
        student.fillArray();
        model.addAttribute("students", student.getPeople());
        return "index";
    }

    @GetMapping("/new")
    public String addStudent(@ModelAttribute("student") Student student) {
        return "new";
    }

    @PostMapping()
    public String create(@ModelAttribute("student") Student student) {
        student.addStudentinlist(student);
        System.out.println(student.getPeople());
        return "redirect:/students";
    }

    @GetMapping("/delete/{firstName}")
    public String delete(@PathVariable("firstName") String firstName) {
        student.deleteStudent(firstName);
        return "redirect:/students";
    }
}
