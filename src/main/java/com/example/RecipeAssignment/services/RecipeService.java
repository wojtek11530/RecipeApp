package com.example.RecipeAssignment.services;

import com.example.RecipeAssignment.commands.RecipeCommand;
import com.example.RecipeAssignment.domain.Recipe;

import java.util.List;
import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipeList();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long l);

    void deleteById(Long idToDelete);
}
