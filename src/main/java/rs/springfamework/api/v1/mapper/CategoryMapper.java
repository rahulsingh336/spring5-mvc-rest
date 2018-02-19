package rs.springfamework.api.v1.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import rs.springfamework.api.v1.model.CategoryDTO;
import rs.springfamework.domain.Category;

/**
 * Created by rs on 2/9/2018.
 */
@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);
}