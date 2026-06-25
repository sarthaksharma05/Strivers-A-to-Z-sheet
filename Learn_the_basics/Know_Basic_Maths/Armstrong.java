package Learn_the_basics.Know_Basic_Maths;

import java.util.Scanner;

public class Armstrong {
    static boolean isArmstrong(int x){
        int original = x;
        int a = 0;
        while(x>0){
            a += (int) Math.pow(x % 10, 3);
            x = x/10;
        }
        return a==original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
        sc.close();
    }
}
