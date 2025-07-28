package controller;

import dto.CustomerDTO;
import service.CustomerService;

import java.util.List;

public class CustomerController {
    private final CustomerService service = new CustomerService();

    public List<CustomerDTO> getCustomers() {
        return service.getAllCustomers();
    }
}
