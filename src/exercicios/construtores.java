package exercicios;

import exercicios.entities.Product;
import java.util.Scanner;
public class construtores {
    public static void main(String[] args) {
        //olhar a classe product
        //Executa no momento que instancia o objeto
        //Iniciar valores dos atributos | permitir ou obrigar que o objeto receba dados/ dependências no momento de sua instanciação(injeção de dependência)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        Double price = scanner.nextDouble();
        System.out.print("Quantity in stock: ");
        //Sobrecarga é a possibilidade de disponibilizar mais de uma versão da mesma operação
        int quantity = scanner.nextInt();
        Product product = new Product(name, price, quantity);

        System.out.println("\nProduct data: " + product);

        System.out.print("\n the number of products to be added in stock: ");
        quantity = scanner.nextInt();
        product.addProducts(quantity);

        System.out.println("\nUpdated data: " + product);

        System.out.print("\nEnter the number of products to be removed from stock: ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);

        System.out.println("\nUpdated data: " + product);

        scanner.close();
    }
}
