package exercicios;

import java.util.Scanner;
public class operadores_bitwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mask = 0b100000;     //"0b" prefixo usado para declarar numero binario  //mask é usado para validar
        int n = scanner.nextByte();

        if ((n & mask) != 0){                                 // somente um &, | ou ^ é para fazer contagem bit a bit --- o ^ é uma Xor
            System.out.println("6th bit is true!");
        }else {
            System.out.println("6th bit is false!");
        }

        scanner.close();
    }
}
