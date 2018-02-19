package rs.springfamework.services;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import rs.springfamework.api.v1.mapper.CategoryMapper;
import rs.springfamework.api.v1.model.CategoryDTO;
import rs.springfamework.domain.Category;
import rs.springfamework.repositories.CategoryRepository;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

/**
 * Created by e076103 on 2/9/2018.
 */
public class CategoryServiceTest {

    public static final Long ID = 2L;
    public static final String NAME = "Jimmy";
    CategoryService categoryService;

    @Mock
    CategoryRepository categoryRepository;

   @Before
   public void setup(){
       MockitoAnnotations.initMocks(this);
       categoryService = new CategoryServiceImpl(categoryRepository, CategoryMapper.INSTANCE);
   }


   @Test
   public void getAllCategoriesTest(){

       //given
       List<Category> categoryList = Arrays.asList(new Category(), new Category(), new Category());

       when(categoryRepository.findAll()).thenReturn(categoryList);

       //when
       List<CategoryDTO> categories = categoryService.getAllCategories();

       //then
       assertEquals(3, categories.size());

   }

    @Test
    public void getCategoryByName() throws Exception {

        //given
        Category category = new Category();
        category.setId(ID);
        category.setName(NAME);

        when(categoryRepository.findByName(anyString())).thenReturn(category);

        //when
        CategoryDTO categoryDTO = categoryService.getCategoryByName(NAME);

        //then
        assertEquals(ID, categoryDTO.getId());
        assertEquals(NAME, categoryDTO.getName());

    }


}
