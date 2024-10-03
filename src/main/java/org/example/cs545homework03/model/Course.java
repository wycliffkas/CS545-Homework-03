package org.example.cs545homework03.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Course {
    @Id
    private int id;
    private String name;
    private String description;

    @ManyToMany(mappedBy="courses")
    private List<Student> students;
}
