package Learn_the_basics.Patterns;
import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=0; row<n; row++){
            if(row == 0 || row == n-1){
                for(int col = 0; col<n; col++)
                    System.out.print("*");
            }
            else{
                for(int col = 0; col<1; col++)
                    System.out.print("*");
                for(int space = 0; space<n-2; space++)
                    System.out.print(" ");
                for(int col = 0; col<1; col++)
                    System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
