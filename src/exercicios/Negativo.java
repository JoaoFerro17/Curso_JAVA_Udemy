package exercicios;

import exercicios.entities.Negative;
import java.util.Scanner;
public class Negativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você deseja digitar?");
        int numeroInteiro = scanner.nextInt();
        Negative [] vetor = new Negative[numeroInteiro];
        System.out.println("------------------------------------");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º número: ");
            int numeroDigitado = scanner.nextInt();
            vetor[i] = new Negative(numeroDigitado);
        }
        System.out.println("\nNÚMEROS NEGATIVOS:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].numeroDigitado < 0) {
                System.out.println(vetor[i]);
            }
        }
        scanner.close();
    }
}
