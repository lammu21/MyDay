package com.fitnotesmicroservices.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fitnotesmicroservices.backend.model.Workout;
import com.fitnotesmicroservices.backend.repository.WorkoutRepository;
import com.fitnotesmicroservices.backend.service.WorkoutService;

@RestController
@RequestMapping("/backend/workout/")
public class WorkoutController 
{
    @Autowired
    // private WorkoutRepository workoutRepository;
    private WorkoutService workoutService;

    @GetMapping("allWorkouts")
    public List<Workout> getAllWorkouts()
    {
        return workoutService.getAllWorkouts();
    }

    @GetMapping("/workoutbyid/{id}")
    public Optional<Workout> getWorkoutById(@PathVariable long id)
    {
        return workoutService.getWorkoutById(id);//.orElse(null);
    }

    
}
