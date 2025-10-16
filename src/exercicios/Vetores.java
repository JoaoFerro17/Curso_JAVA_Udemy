package exercicios;

import java.util.Locale;
import java.util.Scanner;
public class Vetores {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        double [] vect = new double[n];
        double somaAltura = 0;
        for (int i = 0; i < n; i++){
            vect [i] = sc.nextDouble();
            somaAltura += vect [i];
        }
        System.out.println(somaAltura / 3);
        sc.close();
    }
}
