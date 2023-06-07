package ru.khitrov.javaprecs.prac14.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.khitrov.javaprecs.prac14.dao.UniversityDAO;
import ru.khitrov.javaprecs.prac14.models.University;

@Controller
@RequestMapping("/universities")
public class UniversityController {

    private final UniversityDAO dao;

    public UniversityController(UniversityDAO dao) {
        this.dao = dao;
    }

    @GetMapping()
    public String getUniversities(Model model) {
        model.addAttribute("universities", dao.findAll());
        return "index1";
    }

    @GetMapping("/new")
    public String addUniversities(@ModelAttribute("university") University university) {
        return "new1";
    }

    @PostMapping()
    public String create(@ModelAttribute("student") University university) {
        dao.save(university);
        return "redirect:/universities";
    }

    @GetMapping("/delete/{name}")
    public String delete(@PathVariable("name") String name) {
        dao.delete(name);
        return "redirect:/universities";
    }
}
