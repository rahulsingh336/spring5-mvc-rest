package rs.springfamework.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import rs.springfamework.api.v1.model.CategoryDTO;
import rs.springfamework.api.v1.model.CatorgoryListDTO;
import rs.springfamework.services.CategoryService;

/**
 * Created by E076103 on 2/19/2018.
 */
@Controller
@RequestMapping("api/v1/categories/")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<CatorgoryListDTO> getAllCategories(){
        return new ResponseEntity<CatorgoryListDTO>(new CatorgoryListDTO(categoryService.getAllCategories()), HttpStatus.OK);
    }

    @GetMapping("{name}")
    public ResponseEntity<CategoryDTO> getCategoryByName(@PathVariable String name){
        return new ResponseEntity<CategoryDTO>(
                categoryService.getCategoryByName(name), HttpStatus.OK
        );
    }

}
