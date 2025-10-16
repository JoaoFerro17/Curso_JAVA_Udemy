package exercicios;

import exercicios.entities.ProgramC;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Informe a quantidade de produtos:  ");
        int numeroProdutos = sc.nextInt();
        ProgramC[] vetor = new ProgramC[numeroProdutos];
        double soma = 0;

        for (int i = 0;  i < vetor.length; i++){
            System.out.print("Informe o nome do exercicios.produto: ");
            String name = sc.next();
            System.out.print("Informe o valor: ");
            double price = sc.nextDouble();
            vetor[i] = new ProgramC(name, price);
            soma += vetor[i].getPrice();
        }

        double avaragePrice = soma /3;
        System.out.printf("Average price: %.2f", avaragePrice);
        sc.close();
    }
}
