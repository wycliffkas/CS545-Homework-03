package org.example.cs545homework03.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {
    @Id
    private int id;
    private String firstName;
    private String lastName;

    @ManyToOne
    private Department department;
}
