package hwt.guru.spring5recipeapp.services;

import hwt.guru.spring5recipeapp.commands.IngredientCommand;
import hwt.guru.spring5recipeapp.model.Ingredient;

public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
