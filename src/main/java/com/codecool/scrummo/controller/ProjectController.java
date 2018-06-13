package com.codecool.scrummo.controller;


import com.codecool.scrummo.model.Project;
import com.codecool.scrummo.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;


    @RequestMapping(value = "/", method = GET)
    public String renderIndexPage(Model model) {
        //TODO
//      model.addAttribute("isLogged", session.getAttribute("name")); // ha ez true, van session, ha nem, akkor nincs -
        model.addAttribute("list", true);
        model.addAttribute("projectlist", projectService.getAll());
        return "index";
    }


    @RequestMapping(value = "/addnew", method = POST)
    @ResponseBody
    public RedirectView addNew(@RequestParam("description") String description) {
        projectService.addNewProject(description);
            return new RedirectView("list");
        }

    @RequestMapping(value = "/addnew", method = GET)
    public String renderAddNewPage(Model model) {
        model.addAttribute("projects", projectService.getAll());
        return "addnew";
    }

    @RequestMapping(value = "/list", method = GET)
    public String listAll(Model model) {
        model.addAttribute("projects", projectService.getAll());
        return "list";
    }

    @RequestMapping(value = "/{id}", method = GET)
    public String listOne(@PathVariable("id")Long id, Model model) {
        Project item = projectService.getOne(id);
        model.addAttribute("project", item);
        return "list";
    }
}

