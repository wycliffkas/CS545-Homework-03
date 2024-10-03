package org.example.cs545homework03.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    @ManyToMany
    @JoinTable(
            name="student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;

    @OneToOne
    private Major major;
}
