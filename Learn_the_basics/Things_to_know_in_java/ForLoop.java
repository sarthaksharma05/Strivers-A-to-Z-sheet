package Learn_the_basics.Things_to_know_in_java;

import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int sum = 0;
        for(int i=low; i<=high; i++){
            sum += i;
        }
        System.out.println(sum);
        sc.close();
    }
}
