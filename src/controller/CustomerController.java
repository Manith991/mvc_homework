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

    public CustomerDTO getCustomerById(int id) {
        return service.getCustomerById(id);
    }

    public boolean addCustomer(Customer customer) {
        return service.addCustomer(customer);
    }

    public boolean updateCustomer(Customer customer) {
        return service.updateCustomer(customer);
    }

    public boolean deleteCustomer(int id) {
        return service.deleteCustomer(id);
    }
}