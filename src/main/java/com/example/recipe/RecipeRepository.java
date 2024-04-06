// Write your code here
package com.example.recipe;

import java.util.*;

public interface RecipeRepository {
    ArrayList<Recipe> getAllRecipes();

    Recipe getRecipeById(int recipeId);

    Recipe addRecipe(Recipe recipe);

    Recipe updateRecipe(int recipe, Recipe recipe);

    void deleteRecipe(int recipeId);
}