package rs.springfamework.api.v1.mapper;

import org.junit.Test;
import rs.springfamework.api.v1.model.CategoryDTO;
import rs.springfamework.domain.Category;

import static org.junit.Assert.assertEquals;

/**
 * Created by e076103 on 2/9/2018.
 */
public class CategoryMapperTest {

    public static final String NAME = "test";
    public static final long ID = 1L;

    CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    @Test
    public void categoryToCategoryDTO() throws Exception {

        //given
        Category category = new Category();
        category.setName(NAME);
        category.setId(ID);

        //when
        CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDTO(category);

        //then
        assertEquals(Long.valueOf(ID), categoryDTO.getId());
        assertEquals(NAME, categoryDTO.getName());
    }

}