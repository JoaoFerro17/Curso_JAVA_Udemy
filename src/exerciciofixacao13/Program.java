package exerciciofixacao13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        // Formatos de data
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat birth = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // --- Dados do Cliente ---
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = birth.parse(sc.next());

        // Cria o cliente
        Client client = new Client(name, email, birthDate);

        // --- Dados do Pedido ---
        System.out.println("\nEnter order data: ");

        // CORREÇÃO (Scanner): Consome o "\n" pendente do sc.next() anterior
        sc.nextLine();

        System.out.print("Status: ");
        String status = sc.nextLine();

        // CORREÇÃO (Lógica): Cria o objeto Order AQUI, usando o status
        // Usando new Date() para pegar o momento ATUAL do pedido.
        Order order = new Order(new Date(), OrderStatus.valueOf(status.toUpperCase()), client);

        // --- Itens do Pedido ---
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Enter #" + (i + 1) + " item data: ");
            sc.nextLine();
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            // Cria o Produto e o OrderItem
            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, product);

            // CORREÇÃO (Lógica): Adiciona o item ao pedido principal
            order.addOrderItem(orderItem);
        }

        System.out.println("\n--------------------");
        // Imprime o pedido final com todos os dados e itens
        System.out.println(order);

        sc.close();
    }
}