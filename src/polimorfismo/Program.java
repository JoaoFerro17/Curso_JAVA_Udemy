package polimorfismo;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int quantity = sc.nextInt();

        for (int i = 1; i <= quantity; i++){
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char op = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (op == 'c'){
                products.add(new Product(name, price));
            } else if (op == 'u') {
                System.out.println("Manufacture date: ");
                //Date manufactureDate = dc;
                //products.add(new UsedProduct(name, price, manufactureDate));
            }else {
                System.out.println("Customs fee: ");
                Double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            }
        }
        for( Product p : products){
            System.out.println(p.priceTag());
        }
    }
}
