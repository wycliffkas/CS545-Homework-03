package org.example.cs545homework03.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Department {
    @Id
    private int departmentId;
    private String departmentName;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
}
