package com.fitnotesmicroservices.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="workout_subcategory")
public class WorkoutSubcategory 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subcategoryName;

    @ManyToOne
    @JoinColumn(name="work_id",nullable = false)
    private Workout workout;
}
