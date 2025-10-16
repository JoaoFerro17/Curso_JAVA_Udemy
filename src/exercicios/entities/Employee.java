package exercicios.entities;
public class Employee {

    public String name;
    public double grossSalary;
    public double tax;
    public double percentage;

    public double netSalary(){
        return grossSalary - tax;
    }
    public double increaseSalary(){
        percentage = (percentage / 100) * grossSalary;
        return netSalary() + percentage;
    }
}
