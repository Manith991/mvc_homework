package view;

import controller.CustomerController;
import dto.CustomerDTO;

import java.util.List;

public class CustomerView {
    private final CustomerController controller = new CustomerController();

    public void displayAllCustomers() {
        List<CustomerDTO> customers = controller.getCustomers();

        if (customers.isEmpty()) {
            System.out.println("No customers found.");
        } else {
            System.out.println("Customer List:");
            for (CustomerDTO c : customers) {
                System.out.println(c);
            }
        }
    }
}
