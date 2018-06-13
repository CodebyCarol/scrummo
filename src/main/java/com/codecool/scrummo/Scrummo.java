package com.codecool.scrummo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codecool.scrummo.services.ProjectService;
import com.codecool.scrummo.controller.ProjectController;


@SpringBootApplication
public class Scrummo {


    public static void main(String[] args) {


        // setting up instances
        ProjectService projectService = new ProjectService();
        ProjectController projectController = new ProjectController();


        SpringApplication.run(Scrummo.class, args);
        // PopDB populated = new PopDB();


    }
}

