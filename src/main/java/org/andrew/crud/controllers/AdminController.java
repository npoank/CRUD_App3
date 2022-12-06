package org.andrew.crud.controllers;


import org.andrew.crud.dao.PersonDAO;
import org.andrew.crud.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private PersonDAO personDAO;

    @Autowired
    public AdminController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GetMapping()
    public String adminDage (Model model, @ModelAttribute("person") Person person){
        model.addAttribute("people", personDAO.index());
        return "adminPage";
    }

    @PatchMapping()
    public String makeAdmin(@ModelAttribute("person") Person person){
        System.out.println(person.getId());

        return "redirect:/people";
    }
}
