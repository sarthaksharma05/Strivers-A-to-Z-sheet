package Learn_the_basics.Know_Basic_Maths;

import java.util.Scanner;

public class GCD {
    static int gcd(int x, int y){
        while(y !=0){
            int temp = y;
            y = x%y;
            x = temp;
        }
        return x;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = gcd(n, m);
        System.out.println(ans);
        sc.close();
    }
}
