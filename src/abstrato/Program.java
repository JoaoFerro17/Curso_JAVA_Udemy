package abstrato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the nummber of tax payers: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++){
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company(i/c)? ");
            char op = sc.next().toLowerCase().charAt(0);
            if (op == 'i'){
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc. nextLine();
                System.out.print("Anual income: ");
                Double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                taxPayers.add(new IndividualPayer(name, anualIncome, healthExpenditures));
            }else if (op == 'c'){
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc. nextLine();
                System.out.print("Anual income: ");
                Double anualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int numberOfEmployees =  sc.nextInt();
                taxPayers.add(new CompanyPayer(name, anualIncome, numberOfEmployees));
            }else{
                System.out.println("Character invalid!");
                i--;
            }

        }
        System.out.println("\nTAXES PAID:");
        for (TaxPayer paid : taxPayers){
            System.out.printf("\n%s: $%.2f",paid.getName(), paid.taxesPaid());
        }
        double sum = 0;
        for (TaxPayer total : taxPayers){
            sum += total.taxesPaid();
        }
        System.out.println("TOTAL TAXES: R$" + sum);

    }
}
