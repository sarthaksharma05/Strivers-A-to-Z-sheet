package Learn_the_basics.Patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char start = (char)('A'+(n-1));
        for(int row = 1; row<=n; row++){
            for(int col = 0; col<row; col++){
                System.out.print((char)(start+col));
            }
            start -= 1;
            System.out.println();
        }
        sc.close();
    }
}
