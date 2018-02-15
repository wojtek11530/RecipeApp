package com.example.RecipeAssignment.services;

import com.example.RecipeAssignment.commands.UnitOfMeasureCommand;


import java.util.Set;

/**
 * Created by jt on 6/28/17.
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
