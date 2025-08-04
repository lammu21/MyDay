package com.fitnotesmicroservices.backend.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity // entity means model 
@Data // Lombok annotation to generate getters and setters 
@Table(name="workout")
public class Workout 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private int set;
    private int reps;
    private int supportreps;
    private int halfreps;
    private double weight;
    private String notes;
    // git testing
}
