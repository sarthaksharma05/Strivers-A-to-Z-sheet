package Learn_the_basics.Patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 1;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col<=row; col++){
                System.out.print(start+" ");
                start++;
            }System.out.println();
        }
        sc.close();
    }
}
