package Learn_the_basics.Patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1; row <= n; row++){
            int start;
            if(row%2==0)
                start = 0;
            else
                start = 1;
            for(int col = 1; col<=row; col++){
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
        sc.close();
    }
}
