package exercicios;

public class formatacao_numeros {
    public static void main(String[] args) {
        double x = 10.4578;

        //System.out.printf(); o 'f' vem de formatação
        //para controlar a quantidade de casas  decimais é preciso usar: "%.fNumeroDeCasas%n"; obs: %n é quebra de linha;
        System.out.printf("%.2f%n", x);

        //Locale.setDefault(Locale.US); System.out.printf("%.2f%n", x); - para usar o separador '.' ao invés de virgula;

        //System.out.printf("Resultado = %.2f%n", x); - concatenar com o texto; colocar a variavel em ordem; o .f vai ser substituido pela variavel;

        //Regra geral para printf:
        //"TEXTO1 %f TEXTO2 %f TEXTO3", variavel1, variavel2
        //%f = ponto flutuante
        //%d = inteiro
        //%s = texto
        //%n = quebra de linha

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
