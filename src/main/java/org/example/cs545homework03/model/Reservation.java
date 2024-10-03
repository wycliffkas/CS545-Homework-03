package org.example.cs545homework03.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Reservation {
    @Id
    private int reservationId;
}
