package rs.springfamework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
/**
 * Created by rs on 2/19/2018.
 */

@Data
@AllArgsConstructor
public class CatorgoryListDTO {

    List<CategoryDTO> categories;

}