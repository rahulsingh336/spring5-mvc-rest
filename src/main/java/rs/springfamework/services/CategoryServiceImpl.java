package rs.springfamework.services;

import rs.springfamework.api.v1.mapper.CategoryMapper;
import rs.springfamework.api.v1.model.CategoryDTO;
import rs.springfamework.repositories.CategoryRepository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by rs on 2/9/2018.
 */
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    public CategoryServiceImpl(CategoryRepository categoryRepository, CategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        return categoryRepository.findAll().stream().map(categoryMapper::categoryToCategoryDTO).collect(Collectors.toList());
    }

    @Override
    public CategoryDTO getCategoryByName(String name) {
        return categoryMapper.categoryToCategoryDTO(categoryRepository.findByName(name));
    }
}
