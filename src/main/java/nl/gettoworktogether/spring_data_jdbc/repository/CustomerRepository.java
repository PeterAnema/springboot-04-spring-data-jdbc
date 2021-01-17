package nl.gettoworktogether.spring_data_jdbc.repository;

import nl.gettoworktogether.spring_data_jdbc.model.Customer;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface CustomerRepository {

    int count();
    int save(Customer customer);
    int update(Customer customer);
    int deleteById(Long id);
    List<Customer> findAll();
    List<Customer> findByLastName(String name);
    Optional<Customer> findById(Long id);
    Boolean existsById(Long id);
    String getNameById(Long id);

}