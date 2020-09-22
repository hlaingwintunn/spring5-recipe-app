package hwt.guru.spring5recipeapp.controllers;

import hwt.guru.spring5recipeapp.model.Category;
import hwt.guru.spring5recipeapp.model.UnitOfMeasure;
import hwt.guru.spring5recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Index Page Controller");
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
