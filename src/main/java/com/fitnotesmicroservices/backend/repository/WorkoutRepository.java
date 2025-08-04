package com.fitnotesmicroservices.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fitnotesmicroservices.backend.model.Workout;

@Repository
public interface WorkoutRepository extends JpaRepository <Workout,Long>{

    
} 
