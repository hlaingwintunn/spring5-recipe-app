package hwt.guru.spring5recipeapp.services;

import hwt.guru.spring5recipeapp.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
