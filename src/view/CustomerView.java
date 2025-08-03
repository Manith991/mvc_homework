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
            System.out.println("3. Exit");
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
}