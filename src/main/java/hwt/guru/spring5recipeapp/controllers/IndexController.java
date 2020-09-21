package hwt.guru.spring5recipeapp.controllers;

import hwt.guru.spring5recipeapp.model.Category;
import hwt.guru.spring5recipeapp.model.UnitOfMeasure;
import hwt.guru.spring5recipeapp.repositories.CategoryRepository;
import hwt.guru.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        Optional<Category> category = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> uom = unitOfMeasureRepository.findByUom("Tablespoon");

        System.out.println("Category Id is : " + category.get().getId());
        System.out.println("UOM Id is : " + uom.get().getId());

        return "index";
    }
}
