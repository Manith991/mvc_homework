package repository;


import model.Customer;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private Connection connect() throws SQLException {
        String URL = "jdbc:postgresql://localhost:5432/mvc_db";
        String USER = "postgres";
        String PASSWORD = "db22056#";
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public boolean insertCustomer(Customer customer) {
        String sql = "INSERT INTO customers (id, address, city_or_province, company_name, country, dob, email, employment_type, full_name, gender, monthly_income_range, phone_number, position, remark, zip_code, customer_segment_id)\n" +
                "VALUES (?, ?, ?, ?, ?, ?::date, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try (Connection conn = connect();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, customer.getId());
            ps.setString(2, customer.getAddress());
            ps.setString(3, customer.getCityOrProvince());
            ps.setString(4, customer.getCompanyName());
            ps.setString(5, customer.getCountry());
            ps.setString(6, customer.getDob());
            ps.setString(7, customer.getEmail());
            ps.setString(8,customer.getEmploymentType());
            ps.setString(9, customer.getFullName());
            ps.setString(10, customer.getGender());
            ps.setString(11, customer.getMonthlyIncomeRange());
            ps.setString(12, customer.getPhoneNumber());
            ps.setString(13, customer.getPosition());
            ps.setString(14, customer.getRemark());
            ps.setString(15,customer.getZipCode());
            ps.setInt(16,customer.getCustomerSegmentId());


            int affectedRows = ps.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.out.println("Error inserting customer: " + e.getMessage());
            return false;
        }
    }

    public List<Customer> findAll() {
        List<Customer> list = new ArrayList<>();
//        String sql = "SELECT id, full_name, email FROM customers WHERE is_deleted = false";
        String sql = "SELECT * FROM customers";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Customer c = new Customer();
                c.setId(rs.getInt("id"));
                c.setAddress(rs.getString("address"));
                c.setCityOrProvince(rs.getString("city_or_province"));
                c.setCompanyName(rs.getString("company_name"));
                c.setCountry(rs.getString("country"));
                c.setDob(rs.getString("dob"));
                c.setEmail(rs.getString("email"));
                c.setEmploymentType(rs.getString("employment_type"));
                c.setFullName(rs.getString("full_name"));
                c.setGender(rs.getString("gender"));
                c.setDeleted(rs.getBoolean("is_deleted"));
                c.setMainSourceOfIncome(rs.getString("main_source_of_income"));
                c.setMonthlyIncomeRange(rs.getString("monthly_income_range"));
                c.setPhoneNumber(rs.getString("phone_number"));
                c.setPosition(rs.getString("position"));
                c.setRemark(rs.getString("remark"));
                c.setZipCode(rs.getString("zip_code"));
                c.setCustomerSegmentId(rs.getInt("customer_segment_id"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println("Error");
        }
        return list;
    }
}
