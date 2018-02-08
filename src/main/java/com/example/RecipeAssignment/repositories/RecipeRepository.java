package com.example.RecipeAssignment.repositories;

import com.example.RecipeAssignment.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
