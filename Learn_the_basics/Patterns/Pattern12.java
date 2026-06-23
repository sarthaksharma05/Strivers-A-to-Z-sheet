package Learn_the_basics.Patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 0; row<n; row++){
            for(int i = 1; i<=row+1; i++)
                System.out.print(i);
            for(int space = 1; space<=n-(row+1); space++)
                System.out.print(" ");
            for(int space = 1; space<=n-(row+1); space++)
                System.out.print(" ");
            for(int i = row+1; i>0; i--)
                System.out.print(i);
            System.out.println();
        }
        sc.close();
    }
}
