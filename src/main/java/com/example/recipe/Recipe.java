package com.example.recipe;

import java.util.List;

public class Recipe {
    private int recipeId;
    private String recipeName;
    private String description;
    private String recipeType; // Define recipeType if needed
    private List<String> ingredients;

    public Recipe(int recipeId, String recipeName, String description, String recipeType, List<String> ingredients) {
        this.recipeId = recipeId;
        this.recipeName = recipeName;
        this.description = description;
        this.recipeType = recipeType; // Initialize recipeType if needed
        this.ingredients = ingredients;
    }

    // Getters and setters for recipeId, recipeName, description, recipeType,
    // ingredients

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

    public void setRecipeType(String recipeType) {
        this.recipeType = recipeType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}
