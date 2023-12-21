package com.example.recipeappv2;

public class Recipe {
    private String mTitle;

    private String mDescription;

    public Recipe(String title, String description) {
        mTitle = title;
        mDescription = description;
    }

    public Recipe() {
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
