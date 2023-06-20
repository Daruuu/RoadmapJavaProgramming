package topic6_databases.newdb.test;

import examenDB.daoimplement.PersonDAOImpl;
import examenDB.modelo.Person;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        PersonDAOImpl personDAO = new PersonDAOImpl();
        System.out.print("introudce id Persona:");
        int idPerson = sc.nextInt();
        Person p = personDAO.read(idPerson);
        System.out.println(p);

    }
}
