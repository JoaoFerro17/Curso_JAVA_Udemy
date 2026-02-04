package composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter department's name: ");
        String deparmentName = scanner.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = scanner.nextLine();
        System.out.print("Level: ");
        String workerLevel = scanner.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = scanner.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(deparmentName));

        System.out.println("How many contracts to this worker? ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("Enter contract #" + i + " data: ");
            System.out.print("DAte (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(scanner.next());
            System.out.print("Value per hour: ");
            double valeuPerHour = scanner.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = scanner.nextInt();
            HourContract contract = new HourContract(contractDate, valeuPerHour, hours);
            worker.addContract(contract);
        }

        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String monthAndYear =  scanner.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year,month)));
    }
}
