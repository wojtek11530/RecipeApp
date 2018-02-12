package com.example.RecipeAssignment.services;

import com.example.RecipeAssignment.domain.Recipe;

import java.util.List;
import java.util.Set;

public interface RecipesService {
    Set<Recipe> getRecipeList();

    Recipe findById(Long l);
}
