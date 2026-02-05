package excecoes;

import java.util.Scanner;

public class ProgramAccount {
    public static void main(String[] args) throws DomainException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        Double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, initialBalance, withdrawLimit);

        try {
            System.out.print("Enter amount for withdraw: ");
            Double amount = sc.nextDouble();
            account.withdraw(amount);
        }catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }finally {
            System.out.println("Finish program...");
        }
    }
}
