package exercicios;

import exercicios.entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;
public class retangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width: ");
        rectangle.width = scanner.nextDouble();
        System.out.println("Enter rectangle height: ");
        rectangle.height = scanner.nextDouble();

        System.out.printf("Área =  %.2f%n", rectangle.area());
        System.out.printf("Perimeter = %.2f%n", rectangle.perimeter());
        System.out.printf("Diagonal = %.2f%n", rectangle.diagonal());

        scanner.close();
    }
}
