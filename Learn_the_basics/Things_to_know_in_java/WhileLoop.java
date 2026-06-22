package Learn_the_basics.Things_to_know_in_java;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int count = 1;
        int sum = 0;
        while(count <= 50){
            sum += d;
            d += 10;
            count ++;
        }
        System.out.println(sum);
        sc.close();
    }
}
