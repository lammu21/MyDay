package com.fitnotesmicroservices.backend.model;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
@Table(name = "exercise")
public class Exercise
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String exerciseName;

    @ManyToOne
    @JoinColumn(name="subcategory_id",nullable = false)
    private WorkoutSubcategory workoutSubcategory;

    @OneToMany(mappedBy = "exercise", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<ExerciseSet> sets;

}
