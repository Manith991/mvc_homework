package view;

import controller.CustomerController;
import dto.CustomerDTO;
import model.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private final CustomerController controller = new CustomerController();
    private final Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        while (true) {
            System.out.println("\nCustomer Management System");
            System.out.println("1. View All Customers");
            System.out.println("2. Add New Customer");
            System.out.println("3. Update Customer");
            System.out.println("4. Delete Customer");
            System.out.println("5. Search Customer by ID");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    displayAllCustomers();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    updateCustomer();
                    break;
                case 4:
                    deleteCustomer();
                    break;
                case 5:
                    searchCustomerById();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void displayAllCustomers() {
        List<CustomerDTO> customers = controller.getCustomers();

        if (customers.isEmpty()) {
            System.out.println("No customers found.");
        } else {
            // Table header
            String headerFormat = "%-5s | %-25s | %-15s | %-30s | %-15s | %-10s | %-25s | %-15s | %-20s | %-20s | %-20s | %-25s | %-15s | %-20s | %-10s | %-15s | %-10s%n";
            String divider = "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";

            System.out.println("\nCustomer List:");
            System.out.println(divider);
            System.out.printf(headerFormat,
                    "ID", "Full Name", "Phone", "Email", "DOB", "Gender", "Address", "City/Province",
                    "Country", "Zip Code", "Company", "Position", "Employment", "Income Source", "Income Range", "Segment ID", "Deleted");
            System.out.println(divider);

            // Table rows
            String rowFormat = "%-5d | %-25s | %-15s | %-30s | %-15s | %-10s | %-25s | %-15s | %-20s | %-20s | %-20s | %-25s | %-15s | %-20s | %-20s | %-15d | %-10b%n";

            for (CustomerDTO c : customers) {
                System.out.printf(rowFormat,
                        c.id(),
                        c.fullName(),
                        c.phoneNumber(),
                        c.email(),
                        c.dob(),
                        c.gender(),
                        c.address(),
                        c.cityOrProvince(),
                        c.country(),
                        c.zipCode(),
                        c.companyName(),
                        c.position(),
                        c.employmentType(),
                        c.mainSourceOfIncome(),
                        c.monthlyIncomeRange(),
                        c.customerSegmentId(),
                        c.isDeleted());
            }
            System.out.println(divider);
        }
    }

    public void addCustomer() {
        System.out.println("\nAdd New Customer");

        Customer customer = new Customer();

        System.out.print("Enter ID: ");
        customer.setId(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Enter Address: ");
        customer.setAddress(scanner.nextLine());

        System.out.print("Enter City/Province: ");
        customer.setCityOrProvince(scanner.nextLine());

        System.out.print("Enter Company Name: ");
        customer.setCompanyName(scanner.nextLine());

        System.out.print("Enter Country: ");
        customer.setCountry(scanner.nextLine());

        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        customer.setDob(scanner.nextLine());

        System.out.print("Enter Email: ");
        customer.setEmail(scanner.nextLine());

        System.out.print("Enter Employment Type: ");
        customer.setEmploymentType(scanner.nextLine());

        System.out.print("Enter Full Name: ");
        customer.setFullName(scanner.nextLine());

        System.out.print("Enter Gender: ");
        customer.setGender(scanner.nextLine());

        System.out.print("Enter Monthly Income Range: ");
        customer.setMonthlyIncomeRange(scanner.nextLine());

        System.out.print("Enter Phone Number: ");
        customer.setPhoneNumber(scanner.nextLine());

        System.out.print("Enter Position: ");
        customer.setPosition(scanner.nextLine());

        System.out.print("Enter Remark: ");
        customer.setRemark(scanner.nextLine());

        System.out.print("Enter Zip Code: ");
        customer.setZipCode(scanner.nextLine());

        System.out.print("Enter Customer Segment ID: ");
        customer.setCustomerSegmentId(scanner.nextInt());
        scanner.nextLine();
        boolean success = controller.addCustomer(customer);
        if (success) {
            System.out.println("Customer added successfully!");
        } else {
            System.out.println("Failed to add customer.");
        }
    }
    private void updateCustomer() {
        System.out.println("\nUpdate Customer");
        System.out.print("Enter customer ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        CustomerDTO existingCustomer = controller.getCustomerById(id);
        if (existingCustomer == null) {
            System.out.println("Customer not found with ID: " + id);
            return;
        }

        Customer customer = new Customer();
        customer.setId(id);

        System.out.print("Enter Address (" + existingCustomer.address() + "): ");
        customer.setAddress(scanner.nextLine());

        System.out.print("Enter City/Province (" + existingCustomer.cityOrProvince() + "): ");
        customer.setCityOrProvince(scanner.nextLine());

        // Add all other fields similarly...

        boolean success = controller.updateCustomer(customer);
        if (success) {
            System.out.println("Customer updated successfully!");
        } else {
            System.out.println("Failed to update customer.");
        }
    }

    private void deleteCustomer() {
        System.out.println("\nDelete Customer");
        System.out.print("Enter customer ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean success = controller.deleteCustomer(id);
        if (success) {
            System.out.println("Customer deleted successfully!");
        } else {
            System.out.println("Failed to delete customer or customer not found.");
        }
    }

    private void searchCustomerById() {
        System.out.println("\nSearch Customer by ID");
        System.out.print("Enter customer ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        CustomerDTO customer = controller.getCustomerById(id);
        if (customer != null) {
            displayCustomerDetails(customer);
        } else {
            System.out.println("Customer not found with ID: " + id);
        }
    }

    private void displayCustomerDetails(CustomerDTO customer) {
        System.out.println("\nCustomer Details:");
        System.out.println("ID: " + customer.id());
        System.out.println("Full Name: " + customer.fullName());
        System.out.println("Phone: " + customer.phoneNumber());
        System.out.println("Email: " + customer.email());
        System.out.println("DOB: " + customer.dob());
        System.out.println("Gender: " + customer.gender());
        System.out.println("Address: " + customer.address());
        System.out.println("City/Province: " + customer.cityOrProvince());
        System.out.println("Country: " + customer.country());
        System.out.println("Zip Code: " + customer.zipCode());
        System.out.println("Company: " + customer.companyName());
        System.out.println("Position: " + customer.position());
        System.out.println("Employment Type: " + customer.employmentType());
        System.out.println("Income Source: " + customer.mainSourceOfIncome());
        System.out.println("Income Range: " + customer.monthlyIncomeRange());
        System.out.println("Segment ID: " + customer.customerSegmentId());
        System.out.println("Deleted: " + customer.isDeleted());
    }
}
