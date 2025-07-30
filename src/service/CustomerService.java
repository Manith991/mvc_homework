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
                .map(c -> new CustomerDTO(c.getId(),c.getAddress(),c.getCityOrProvince(),c.getCompanyName(),c.getCountry(),c.getDob(),c.getEmail(),c.getEmploymentType(),c.getFullName(),c.getGender(),c.getIsDeleted(),c.getMainSourceOfIncome(),c.getMonthlyIncomeRange(),c.getPhoneNumber(),c.getPosition(),c.getRemark(),c.getZipCode(),c.getCustomerSegmentId()))
                .collect(Collectors.toList());
    }
}
