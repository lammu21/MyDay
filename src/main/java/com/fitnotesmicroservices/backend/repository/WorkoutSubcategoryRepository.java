package com.fitnotesmicroservices.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fitnotesmicroservices.backend.model.WorkoutSubcategory;

public interface WorkoutSubcategoryRepository extends JpaRepository<WorkoutSubcategory, Long> {
	
}
