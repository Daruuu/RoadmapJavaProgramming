package topic6_databases.daoemployee;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class EmployeeDaoTest {
    private EmployeeDaoImplement employeeDaoImplement = new EmployeeDaoImplement();
    private List<Employee> employeeList;

    public EmployeeDaoImplement getEmployeeDaoImplement() {
        return employeeDaoImplement;
    }

    public void setEmployeeDaoImplement(EmployeeDaoImplement employeeDaoImplement) {
        this.employeeDaoImplement = employeeDaoImplement;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public static void main(String[] args) throws SQLException {
        EmployeeDaoTest edt = new EmployeeDaoTest();
        edt.menuPrograma();

    }

    void menuOpciones() {
        System.out.print("Menu:\n" +
                "[1]- Create Employee\n" +
                "[2]- Remove Employee by ID\n" +
                "[3]- Read Employee by ID\n" +
                "[4]- Update Employee\n" +
                "[5]- Listar Employees\n" +
                "opcion: ");
    }

    void menuPrograma() throws SQLException {
        Scanner sc = new Scanner(System.in);

        menuOpciones();
        int opcion = sc.nextInt();
        sc.nextLine();

        while (opcion != 6) {

            switch (opcion) {
                case 1:
                    //CREATE EMPLOYEE
                    Employee employee = createEmployee();
                    System.out.println(employee);

                    int nuevoEmployeeId = employeeDaoImplement.create(employee);
                    System.out.println("Employee con id: " + nuevoEmployeeId + " creado correctamente!");
                    break;
                case 2:
                    // DELETE EMPLOYEE
                    System.out.print("id employee a eliminar: ");
                    int idEmployee = sc.nextInt();
                    employeeDaoImplement.delete(idEmployee);
                    break;
                case 3:
                    // READ BY ID
                    System.out.print("introduce id de employee: ");
                    int idEmployeeRead = sc.nextInt();
                    Employee readE = employeeDaoImplement.read(idEmployeeRead);
                    System.out.println(readE);
                    break;
                case 4:
                    // UPDATE EMPLOYEE
                    Employee updaEmployee;
                    updaEmployee = updtEmployee();
                    employeeDaoImplement.update(updaEmployee);
                    break;
                case 5:
                    // LISTAR TABLE
                    employeeList = employeeDaoImplement.getEmployees();
                    for (Employee e : employeeList) {
                        System.out.print(e + "\n");
                    }
                    break;
                default:
                    System.err.println("Introduce una opcion entre 1 -5");
            }
//            opcion = Integer.parseInt(sc.nextLine());
            opcion = sc.nextInt();
        }
    }

    Employee createEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce lastName:");
        String lastName = sc.nextLine();

        System.out.println("introduce firstName:");
        String firstName = sc.nextLine();

        System.out.println("introduce title:");
        String title = sc.nextLine();

        System.out.println("introduce reportTo:");
        int reportsTo = sc.nextInt();
        sc.nextLine();

        System.out.println("introduce birth Date:");
        String birthDate = sc.nextLine();

        System.out.println("introduce hire Date:");
        String hireDate = sc.nextLine();

        System.out.println("introduce  address:");
        String address = sc.nextLine();

        System.out.println("introduce city:");
        String city = sc.nextLine();

        System.out.println("introduce state:");
        String state = sc.nextLine();

        System.out.println("introduce country:");
        String country = sc.nextLine();

        System.out.println("introduce postaCode:");
        String postalCode = sc.nextLine();

        System.out.println("introduce phone:");
        String phone = sc.nextLine();

        System.out.println("introduce fax:");
        String fax = sc.nextLine();

        System.out.println("introduce email:");
        String email = sc.nextLine();
//        sc.close();

        Employee employee = new Employee(lastName, firstName, title, reportsTo, birthDate, hireDate, address, city, state, country, postalCode, phone, fax, email);

        return employee;
    }

    Employee updtEmployee() {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce lastName:");
        String lastName = sc.nextLine();

        System.out.println("introduce firstName:");
        String firstName = sc.nextLine();

        System.out.println("introduce title:");
        String title = sc.nextLine();

        System.out.println("introduce reportTo:");
        int reportsTo = sc.nextInt();

        System.out.println("introduce birth Date:");
        String birthDate = sc.nextLine();

        System.out.println("introduce hire Date:");
        String hireDate = sc.nextLine();

        System.out.println("introduce  address:");
        String address = sc.nextLine();

        System.out.println("introduce city:");
        String city = sc.nextLine();

        System.out.println("introduce state:");
        String state = sc.nextLine();

        System.out.println("introduce country:");
        String country = sc.nextLine();

        System.out.println("introduce postaCode:");
        String postalCode = sc.nextLine();

        System.out.println("introduce phone:");
        String phone = sc.nextLine();

        System.out.println("introduce fax:");
        String fax = sc.nextLine();

        System.out.println("introduce email:");
        String email = sc.nextLine();

        System.out.println("introduce idEmployee:");
        int idEmployee = sc.nextInt();

        Employee employee = new Employee(lastName, firstName, title, reportsTo, birthDate, hireDate, address, city, state, country, postalCode, phone, fax, email, idEmployee);
        return employee;
    }
}
