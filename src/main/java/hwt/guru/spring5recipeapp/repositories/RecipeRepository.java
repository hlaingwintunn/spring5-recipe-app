package hwt.guru.spring5recipeapp.repositories;

import hwt.guru.spring5recipeapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
