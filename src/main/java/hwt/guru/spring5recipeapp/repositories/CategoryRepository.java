package hwt.guru.spring5recipeapp.repositories;

import hwt.guru.spring5recipeapp.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
