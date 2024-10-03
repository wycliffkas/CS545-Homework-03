package org.example.cs545homework03.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Major {
    @Id
    private int id;
    private String name;

    @OneToOne
    private Student student;

}
