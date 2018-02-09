package com.example.RecipeAssignment.services;

import com.example.RecipeAssignment.domain.Recipe;
import com.example.RecipeAssignment.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Slf4j
@Service
public class RecipesServiceImpl implements RecipesService {

    private final RecipeRepository recipeRepository;

    public RecipesServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipeList(){
        log.debug("I'm in the service");
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);

        return recipeSet;

    }
}
