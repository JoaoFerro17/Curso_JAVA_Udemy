package exercicios;

import exercicios.entities.Encapsulu;
import java.util.Scanner;
public class encapsulamento {
    private static String name;

    public static void main(String[] args) {
        /*
        É um príncipio que consiste em esconder detalhes de implementação de uma classe,
        expondo apenas operações seguras e que  mantenham os objetos em um estado consistente.

        REGRA DE OURO: o objeto deve sempre estar em um estado consistente, e a própria classe deve garantir isso.

        Um objeto NÃO deve expor nenhum atributo (modificador de acesso private)
        Os atributos devem ser acessados por meio de métodos get e set.
        get = obter o atributo;
        set = alterar o valor do atributo;
        exemplos:
        private String name;
        private double price;
        public String getName() {
        return name;
        }
        public void setName(String name) {
        this.name = name;
        }
        public double getPrice() {
        return price;
        }
        public void setPrice(double price) {
        this.price = price;
        }
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        Double price = scanner.nextDouble();
        System.out.print("Quantity in stock: ");
        Encapsulu product = new Encapsulu(name, price);

        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());

        product.setPrice(1000);
        System.out.println("Updated price: " + product.getPrice());

        System.out.println("\nProduct data: " + product);

        System.out.print("\n the number of products to be added in stock: ");
        int quantity = scanner.nextInt();
        product.addProducts(quantity);
        System.out.println("\nUpdated data: " + product);
        System.out.print("\nEnter the number of products to be removed from stock: ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);
        System.out.println("\nUpdated data: " + product);

                scanner.close();
            }
        }