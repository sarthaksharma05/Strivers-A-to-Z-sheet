package Learn_the_basics.Patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 0; row<n; row++){
            for(int i = n; i>row ; i--)
                System.out.print("*");
            for(int space =0; space<2*row; space++)
                System.out.print(" ");
            for(int j = n; j>row; j--)
                System.out.print("*");
            System.out.println();
        }
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=row; col++)
                System.out.print("*");
            for (int space = 1; space <= 2 * (n - row); space++) 
                System.out.print(" ");
            for (int star = 1; star <= row; star++) 
                System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}

