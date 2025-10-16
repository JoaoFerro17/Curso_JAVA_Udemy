package exercicios;

public class matematica {
    public static void main(String[] args) {
        //A = Matg.sqrt(x); --> Raiz quadrada
        //A = Math.pow(x, y); --> Potência - x elevado a y
        //A = Math.abs(x); --> Valor absoluto

        double raio1 = 2, raio2 = 100.64, raio3= 150;
        double r1 = (Math.pow(raio1, 2));
        double r2 = (Math.pow(raio2, 2));
        double r3 = (Math.pow(raio2, 2));

        System.out.printf("Saida do primeiro raio: %.4f%n", r1);
        System.out.printf("Saida do segundo raio: %.4f%n", r2);
        System.out.printf("Saida do terceiro raio: %.4f%n", r3);
    }
}
