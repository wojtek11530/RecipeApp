package com.example.RecipeAssignment.controllers;

import com.example.RecipeAssignment.domain.Category;
import com.example.RecipeAssignment.domain.UnitOfMeasure;
import com.example.RecipeAssignment.repositories.CategoryRepository;
import com.example.RecipeAssignment.repositories.RecipeRepository;
import com.example.RecipeAssignment.repositories.UnitOfMeasureRepository;
import com.example.RecipeAssignment.services.RecipesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private final RecipesService recipesService;

    public IndexController(RecipesService recipesService) {
        this.recipesService = recipesService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
        log.debug("Getting Index Page");
        model.addAttribute("recipes", recipesService.getRecipeList());

        return "index";
    }
}
