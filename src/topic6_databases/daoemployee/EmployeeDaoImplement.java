package topic6_databases.daoemployee;

import albumBasicJDBC.Connexio;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImplement implements EmployeeDao {
    private static Connection connection = Connexio.getConnection();

    @Override
    public int create(Employee employee) {

        int nuevoIdEmployee = -1;
        String query = "INSERT INTO Employee(LastName, FirstName, Title, ReportsTo, BirthDate, HireDate, Address, City, State, Country, PostalCode, Phone, Fax, Email)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, employee.getLastName());
            ps.setString(2, employee.getFirstName());
            ps.setString(3, employee.getTitle());
            ps.setInt(4, employee.getReportsTo());
            ps.setString(5, employee.getBirthDate());
            ps.setString(6, employee.getHireDate());
            ps.setString(7, employee.getAddress());
            ps.setString(8, employee.getCity());
            ps.setString(9, employee.getState());
            ps.setString(10, employee.getCountry());
            ps.setString(11, employee.getPostalCode());
            ps.setString(12, employee.getPhone());
            ps.setString(13, employee.getFax());
            ps.setString(14, employee.getEmail());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            nuevoIdEmployee = rs.getInt(1);

            ps.close();
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getClass().getName() + " : " + e.getMessage());
        }
        return nuevoIdEmployee;
    }

    @Override
    public void delete(int idEmployee) {

        try {
            connection.setAutoCommit(false);
            String query = "DELETE * FROM EMPLOYEE WHERE EmployeeId = ?";

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, idEmployee);
            ps.executeUpdate();
            connection.commit();
            ps.close();

            System.out.println("eliminado correctamente con ID: " + idEmployee);
        } catch (SQLException s) {
            System.out.println(s.getClass().getName() + " : " + s.getMessage());
        }
    }

    @Override
    public Employee read(int idEmployee) {
        Employee employeeToRead = null;

        String query = "SELECT * FROM EMPLOYEE WHERE EmployeeId = ?";

        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, idEmployee);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String lastName = rs.getString("Lastname");
                String firstName = rs.getString("FirstName");
                String title = rs.getString("Title");
                int reportsTo = rs.getInt("ReportsTo");
                String birthDate = rs.getString("BirthDate");
                String hireDate = rs.getString("HireDate");
                String address = rs.getString("Address");
                String city = rs.getString("City");
                String state = rs.getString("State");
                String country = rs.getString("Country");
                String postalCode = rs.getString("PostalCode");
                String phone = rs.getString("Phone");
                String fax = rs.getString("Fax");
                String email = rs.getString("Email");

                employeeToRead = new Employee(lastName, firstName, title, reportsTo, birthDate, hireDate, address, city, state, country, postalCode, phone, fax, email);
            }
        } catch (SQLException s) {
            System.out.println(s.getClass().getName() + " : " + s.getMessage());
        }
        return employeeToRead;
    }

    @Override
    public void update(Employee employee) {
        String sql = "UPDATE Employee " +
                "SET LastName = ?, FirstName = ?, Title = ?, ReportsTo = ?, BirthDate = ?, HireDate = ?, Address = ?, City = ?, State = ?, Country = ?, PostalCode = ?, Phone = ?, Fax = ?, Email = ?" +
                "WHERE EmployeeId = ?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, employee.getLastName());
            ps.setString(2, employee.getFirstName());
            ps.setString(3, employee.getTitle());
            ps.setInt(4, employee.getReportsTo());
            ps.setString(5, employee.getBirthDate());
            ps.setString(6, employee.getHireDate());
            ps.setString(7, employee.getAddress());
            ps.setString(8, employee.getCity());
            ps.setString(9, employee.getState());
            ps.setString(10, employee.getCountry());
            ps.setString(11, employee.getPostalCode());
            ps.setString(12, employee.getPhone());
            ps.setString(13, employee.getFax());
            ps.setString(14, employee.getEmail());
            ps.setInt(15, employee.getEmployeeId());

            ps.executeUpdate();
            ps.close();
            connection.commit();
            System.out.println("Employee actualizado!");

        } catch (Exception e) {
            System.out.println(e.getClass().getName() + " : " + e.getMessage());
        }
    }

    @Override
    public List<Employee> getEmployees() throws SQLException {
        List<Employee> employeeList = new ArrayList<>();

        Statement statement;
        String sql = "SELECT * FROM EMPLOYEE";
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                int employeeId = rs.getInt("EmployeeId");
                String lastName = rs.getString("Lastname");
                String firstName = rs.getString("FirstName");
                String title = rs.getString("ReportsTo");
                int reportsTo = rs.getInt("reportsTo");
                String birthDate = rs.getString("BirthDate");
                String hireDate = rs.getString("HireDate");
                String address = rs.getString("Address");
                String city = rs.getString("City");
                String state = rs.getString("State");
                String country = rs.getString("Country");
                String postalCode = rs.getString("PostalCode");
                String phone = rs.getString("Phone");
                String fax = rs.getString("Fax");
                String email = rs.getString("Email");

                employeeList.add(new Employee(employeeId, lastName, firstName, title, reportsTo, birthDate, hireDate, address, city, state, country, postalCode, phone, fax, email));
            }
            rs.close();
            statement.close();

        } catch (Exception e) {
            throw new SQLException(e);
        }

        return employeeList;
    }
}
