package com.corndel.cashregister.exercises;

import com.corndel.cashregister.exercises.models.Recipe;
import com.corndel.cashregister.exercises.models.RecipeBook;

import java.util.List;

public class Exercise3b {
  /**
   * Given a recipeBook containing recipes, returns the total number of servings
   * in the book
   */
  public static int countServings(RecipeBook recipeBook) {
    return recipeBook.getRecipes().stream()
            .mapToInt(recipe -> recipe.getServings()) // Assuming you have a getServings() method
            .sum();
  }
}
