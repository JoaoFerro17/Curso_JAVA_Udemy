package exercicios.entities;
public class Student {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double media(){
        return (nota1 + nota2 + nota3);
    }
    public void verdificacao(double media){
        if (media() > 60){
            System.out.printf("FINAL GRADE = %.2f", media());
            System.out.println("\nPASS");
        }else {
            System.out.printf("FINAL GRADE = %.2f", media());
            System.out.println("\nFAILED");
        }
    }
    public double failed(){
        return 60 - media();
    }
}
