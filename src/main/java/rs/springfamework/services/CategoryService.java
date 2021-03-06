package rs.springfamework.services;

import rs.springfamework.api.v1.model.CategoryDTO;

import java.util.List;

/**
 * Created by rs on 2/9/2018.
 */
public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
