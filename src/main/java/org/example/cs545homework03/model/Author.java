package org.example.cs545homework03.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Author {
    @Id
    private int id;
    private String firstName;
    private String lastName;

}
