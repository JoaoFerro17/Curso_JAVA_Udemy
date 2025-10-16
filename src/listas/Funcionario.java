package listas;
public class Funcionario {
    private int id;
    private String name;
    private double salary;

    public Funcionario(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return name;
    }

    public double getSalario() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        salary = salary + (salary * (percentage / 100.0));
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}