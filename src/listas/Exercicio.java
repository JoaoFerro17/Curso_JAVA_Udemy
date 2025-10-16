package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;
public class Exercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
/*
        List<Funcionario> list = new ArrayList<>();

        list.add(new Funcionario(333, "Maria Brown", 4000.00));
        list.add(new Funcionario(536, "Alex Grey", 3000.00));
        list.add(new Funcionario(772, "Bob Green", 5000.00));

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = scanner.nextInt();

        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = scanner.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println("\nList of employees:");
        for (Funcionario obj : list) {
            System.out.println(obj);
        }
 */
        List<Funcionario> list = new ArrayList<>();

        System.out.println("How many employees will be registered?");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("Id: ");
            int id = scanner.nextInt();
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            Funcionario emp = new Funcionario(id, name, salary);
            list.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idsalary = scanner.nextInt();
        Funcionario emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
        //Integer pos = position(list, idsalary);

        if (emp == null){
            System.out.println("This id does not exist!");
        }else {
            System.out.print("Enter the percentage: ");
            double percentage = scanner.nextDouble();
            emp.increaseSalary(percentage);
            //list.get(pos).increaseSalary(percentage);
        }

        System.out.println("\nList of employees: ");
        for (Funcionario func : list){
            System.out.println(func);
        }
        scanner.close();
    }
    public static Integer position(List<Funcionario> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            } else {
                return null;
            }
        }
        return 0;
    }
}
