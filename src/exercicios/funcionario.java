package exercicios;

import exercicios.entities.Employee;
import java.util.Locale;
import java.util.Scanner;
public class funcionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = scanner.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = scanner.nextDouble();
        System.out.print("Tax: ");
        employee.tax = scanner.nextDouble();

        System.out.printf("\nEmployee: %s, $%.2f%n", employee.name, employee.netSalary());

        System.out.print("\nWhich percentage to increase salary: ");
        employee.percentage = scanner.nextDouble();

        System.out.printf("\nUpdate data: %s, $%.2f%n", employee.name, employee.increaseSalary());
    }
}
