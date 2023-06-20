package topic6_databases.daoemployee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {
    int create(Employee employee) throws SQLException;

    void delete(int idEmployee);

    Employee read(int idEmployee);

    void update(Employee employee);

    List<Employee> getEmployees() throws SQLException;
}