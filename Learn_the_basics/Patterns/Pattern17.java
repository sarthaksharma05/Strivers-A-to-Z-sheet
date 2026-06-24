package Learn_the_basics.Patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (char ch = 'A'; ch < 'A' + row; ch++) {
                System.out.print(ch);
            }
            for (char ch = (char)('A' + row - 2); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
        sc.close();
    }
}
