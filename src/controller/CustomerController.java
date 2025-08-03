package controller;

import dto.CustomerDTO;
import model.Customer;
import service.CustomerService;
import java.util.List;

public class CustomerController {
    private final CustomerService service = new CustomerService();

    public List<CustomerDTO> getCustomers() {
        return service.getAllCustomers();
    }

    public boolean addCustomer(Customer customer) {
        return service.addCustomer(customer);
    }
}
