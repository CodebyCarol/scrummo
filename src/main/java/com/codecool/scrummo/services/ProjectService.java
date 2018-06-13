package com.codecool.scrummo.services;

import com.codecool.scrummo.model.Project;
import com.codecool.scrummo.repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class ProjectService {

    @Autowired
    private ProjectRepo projectRepo;

    public List<Project> getAll() {

        return projectRepo.findAll();
    }

    public void addNewProject(String title, String descr) {

        Project project = new Project(title, descr);
        projectRepo.save(project);
    }

    public Project getOne(Long id){
        return projectRepo.findFirstById(id);
    }


}
