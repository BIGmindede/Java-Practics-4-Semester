package ru.khitrov.javaprecs.prac14.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.khitrov.javaprecs.prac14.models.University;

@Controller
@RequestMapping("/universities")
public class UniversityController {

    private final University university;

    public UniversityController(University university) {
        this.university = university;
    }

    @GetMapping()
    public String getUniversities(Model model) {
        university.fillArray();
        model.addAttribute("universities", university.getUniversities());
        return "index1";
    }

    @GetMapping("/new")
    public String addUniversities(@ModelAttribute("university") University university) {
        return "new1";
    }

    @PostMapping()
    public String create(@ModelAttribute("student") University university) {
        university.addUniversityInList(university);
        System.out.println(university.getUniversities());
        return "redirect:/universities";
    }

    @GetMapping("/delete/{name}")
    public String delete(@PathVariable("name") String name) {
        university.deleteUniversity(name);
        return "redirect:/universities";
    }
}
