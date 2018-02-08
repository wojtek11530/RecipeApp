package com.example.RecipeAssignment.repositories;

import com.example.RecipeAssignment.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Long> {
    Optional<Category> findByDescription(String desription);
}
