package repository;

import model.Customer;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    private Connection connect() throws SQLException {
        String URL = "jdbc:postgresql://localhost:5432/dbname";
        String USER = "postgres";
        String PASSWORD = "";
        return DriverManager.getConnection(URL, USER, PASSWORD);
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
                c.setFullName(rs.getString("full_name"));
                c.setEmail(rs.getString("email"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println("Error");
        }
        return list;
    }
}
