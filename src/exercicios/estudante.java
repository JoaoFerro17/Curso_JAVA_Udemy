package exercicios;

import exercicios.entities.Student;
import java.util.Locale;
import java.util.Scanner;
public class estudante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Student student = new Student();

        student.name = scanner.nextLine();
        student.nota1 = scanner.nextDouble();
        student.nota2 = scanner.nextDouble();
        student.nota3 = scanner.nextDouble();

        student.verdificacao(student.media());

        if (student.media() < 60){
            System.out.printf("Missing %.2f%n points", student.failed());
        }
        scanner.close();
    }
}
