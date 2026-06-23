package Learn_the_basics.Patterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 0; row < n; row++){
            for(int space = 0; space < row; space++){
                System.out.print(" ");
            }
            for(int star = 0; star < (2 * n - (2 * row + 1)); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
