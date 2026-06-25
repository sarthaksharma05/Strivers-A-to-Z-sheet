package Learn_the_basics.Know_Basic_Maths;

import java.util.Scanner;

public class ReverseNum {
    static int ReverseNumber(int n){
        int rev = 0;
        while(n>0){
            rev = rev*10 + n%10;
            n = n/10;
        }
        return rev;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int rev = ReverseNumber(n);
        System.out.println("Reverse of the number is : "+rev);
        sc.close();
    }
}
