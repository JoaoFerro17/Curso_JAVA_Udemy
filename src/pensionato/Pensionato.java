package pensionato;

import java.util.Scanner;
public class Pensionato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many rooms will be retend?");
        int n = scanner.nextInt();
        scanner.nextLine();

        Rooms [] vect = new Rooms[10];

        for (int i = 0; i < n; i++){
            System.out.println("Rent #" + (i+1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("E-mail: ");
            String email = scanner.nextLine();
            System.out.print("Room: ");
            int room = scanner.nextInt();
            scanner.nextLine();
            vect [room] = new Rooms(name, email);
        }

        System.out.println("Busy  rooms: ");
        for (int i = 0; i < vect.length; i++){
            if (vect[i] != null){
                System.out.println(i + " : " + vect[i].getName() + ", " + vect[i].getEmail());
            }
        }
        scanner.close();
    }
}
