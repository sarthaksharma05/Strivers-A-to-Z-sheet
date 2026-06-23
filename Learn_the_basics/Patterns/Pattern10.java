package Learn_the_basics.Patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 0 ; row < n; row++){
            for(int star = 0 ; star < row+1; star++)
                System.out.print("*");
            System.out.println();
        }
        for(int row = n-2; row >= 0 ; row--){
            for(int star = 1 ; star < row+1; star++)
                System.out.print("*");
            System.out.println("*");
        }
        sc.close();
    }
}
