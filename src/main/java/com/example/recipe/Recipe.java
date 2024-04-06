// Write your code here
package com.example.recipe;

import java.util.List;

public class recipe {

    private int recipeId;
    private String recipeName;
    private String recipeType;
    private List<String> ingredients;

    public recipe(int recipeId, String recipeName, List<String> ingredients) {
        this.recipeId = recipeId;
        this.recipeName = recipeName;
        this.recipeType = recipeType;
        this.ingredients = ingredients;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeType() {
        return recipeType;
    }

    public void setRecipeDetails(String recipeType) {
        this.recipeType = recipeType;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

}