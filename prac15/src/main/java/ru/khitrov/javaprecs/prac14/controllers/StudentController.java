package ru.khitrov.javaprecs.prac14.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.khitrov.javaprecs.prac14.dao.StudentDAO;
import ru.khitrov.javaprecs.prac14.models.Student;

@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentDAO dao;

    public StudentController(StudentDAO dao) {
        this.dao = dao;
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
}
