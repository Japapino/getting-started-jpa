package hello;

import java.util.Collection;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Collection<Customer> findByLastName(String lastName);
    
    @Override
    Set<Customer> findAll(); 
}