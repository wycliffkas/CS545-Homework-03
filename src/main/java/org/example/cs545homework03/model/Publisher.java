package org.example.cs545homework03.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Publisher {
    @Id
    private int id;
    private String name;
    private String address;
}
