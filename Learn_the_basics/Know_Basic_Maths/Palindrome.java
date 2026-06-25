package Learn_the_basics.Know_Basic_Maths;

import java.util.Scanner;

public class Palindrome {
    static void solution(int x){
        int original = x;
        int rev = 0;
        while(x != 0){
            rev = rev*10 + x%10;
            x = x/10;
        }
        if(rev == original)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
        sc.close();
    }
}
