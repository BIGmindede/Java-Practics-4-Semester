package ru.khitrov.javapracs.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.khitrov.javapracs.dao.StudentDAO;
import ru.khitrov.javapracs.models.Student;
import ru.khitrov.javapracs.service.DogService;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentDAO dao;
    private final DogService dogService;

    public StudentController(StudentDAO dao, DogService dogService) {
        this.dao = dao;
        this.dogService = dogService;
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

//////////////////////////////////////////////////////////////////////////
    @GetMapping("/dog/{dogId}/student")
    public Student getDogStudent(@PathVariable("dogId") int dogId) {
        return dogService.getStudentByDog(dogId);
    }


}
