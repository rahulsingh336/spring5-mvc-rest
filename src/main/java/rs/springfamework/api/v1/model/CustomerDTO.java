package rs.springfamework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * Created by E076103 on 2/19/2018.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    private String firstname;
    private String lastname;
    private String customerUrl;
}