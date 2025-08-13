package com.fitnotesmicroservices.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitnotesmicroservices.backend.repository.WorkoutRepository;
import com.fitnotesmicroservices.backend.model.Workout;

@Service
public class WorkoutService 
{
   @Autowired
   private WorkoutRepository workoutRepository;

   public List<Workout> getAllWorkouts()
   {
      return workoutRepository.findAll();
      
   }

   public Optional<Workout> getWorkoutById(Long id)
   {
      return workoutRepository.findById(id);
   }


    
}
