package service;

import dto.CustomerDTO;
import model.Customer;
import repository.CustomerRepository;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerService {
    private final CustomerRepository repo = new CustomerRepository();

    public List<CustomerDTO> getAllCustomers() {
        List<Customer> customers = repo.findAll();

        return customers.stream()
                .map(c -> new CustomerDTO(c.getFullName(), c.getEmail()))
                .collect(Collectors.toList());
    }
}
