package Learn_the_basics.Patterns;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = 2 * n - 1;

        for (int row = 0; row < size; row++) {

            for (int col = 0; col < size; col++) {

                int top = row;
                int left = col;
                int bottom = size - 1 - row;
                int right = size - 1 - col;

                int distance = Math.min(
                        Math.min(top, bottom),
                        Math.min(left, right));

                System.out.print((n - distance) + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
