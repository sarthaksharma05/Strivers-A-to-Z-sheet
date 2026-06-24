package Learn_the_basics.Patterns;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1; row<=n; row++){
            for(int i=0; i<row; i++)
                System.out.print("*");
            for(int space = 2*(n-1); space>2*(row-1); space-- )
                System.out.print(" ");
            for(int j=0; j<row; j++)
                System.out.print("*");
            System.out.println();
        }
        for(int row = 1; row<n; row++){
            for(int i=n; i>row; i--)
                System.out.print("*");
            for(int space = 1; space <= (row*2); space++)
                System.out.print(" ");
            for(int j=n; j>row; j--)
                System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}
