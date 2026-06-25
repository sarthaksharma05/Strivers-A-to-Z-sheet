package Learn_the_basics.Know_Basic_Maths;

import java.util.Scanner;

public class CountAllDigitsOfANumber {

    static int countDigits(int n) {

        if (n == 0) {
            return 1;
        }

        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = countDigits(n);

        System.out.println("Number of digits = " + result);

        sc.close();
    }
}