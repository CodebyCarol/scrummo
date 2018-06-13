package com.codecool.scrummo.repository;

import com.codecool.scrummo.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project, Long> {

    Project findFirstById(long id);





}
