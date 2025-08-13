package com.fitnotesmicroservices.backend.repository;

import com.fitnotesmicroservices.backend.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
	
}
