package com.codecool.scrummo.model;

import javax.persistence.*;


@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String title;
    private String description;


    public Project(String title, String description) {
        this.description = description;
        this.title = title;

    }

    public Project() {};

    public Long getId() {
        return id;
    }

    public String getDescription() { return description; }

    public String getTitle() { return title; }


}
