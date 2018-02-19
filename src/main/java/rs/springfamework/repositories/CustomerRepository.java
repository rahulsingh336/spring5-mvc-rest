package rs.springfamework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.springfamework.domain.Customer;

/**
 * Created by rs 9/24/17.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
