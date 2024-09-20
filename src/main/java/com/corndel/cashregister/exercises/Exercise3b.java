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
    int count = 0;

    for(int i = 0; i < recipeBook.getRecipes().size(); i++) {
      List<Recipe> recipes = recipeBook.getRecipes();

        count += recipes.get(i).servings;

    }
    return count;
  }
}
