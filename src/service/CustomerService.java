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
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public CustomerDTO getCustomerById(int id) {
        Customer customer = repo.findById(id);
        return customer != null ? convertToDTO(customer) : null;
    }

    public boolean addCustomer(Customer customer) {
        return repo.insertCustomer(customer);
    }

    public boolean updateCustomer(Customer customer) {
        return repo.updateCustomer(customer);
    }

    public boolean deleteCustomer(int id) {
        return repo.deleteCustomer(id);
    }

    private CustomerDTO convertToDTO(Customer c) {
        return new CustomerDTO(
                c.getId(),
                c.getAddress(),
                c.getCityOrProvince(),
                c.getCompanyName(),
                c.getCountry(),
                c.getDob(),
                c.getEmail(),
                c.getEmploymentType(),
                c.getFullName(),
                c.getGender(),
                c.getIsDeleted(),
                c.getMainSourceOfIncome(),
                c.getMonthlyIncomeRange(),
                c.getPhoneNumber(),
                c.getPosition(),
                c.getRemark(),
                c.getZipCode(),
                c.getCustomerSegmentId()
        );
    }
}