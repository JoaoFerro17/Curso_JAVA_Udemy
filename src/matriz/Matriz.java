package matriz;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int [][] mat = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Main diagonal: ");
        for (int i = 0; i < n; i++){
            System.out.print(mat[i][i]+ "\t");
        }

        int count = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (mat[i][j] < 0){
                    count++;
                }
            }
        }
        System.out.print("\nNegative numbers: " + count);
        scanner.close();
    }
}
