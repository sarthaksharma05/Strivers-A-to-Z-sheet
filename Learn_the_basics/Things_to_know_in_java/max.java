package Learn_the_basics.Things_to_know_in_java;
import java.util.Scanner;
public class max {
    static int max_of_four_numbers(int a, int b, int c, int d){
        int[] arr = new int[]{a,b,c,d};
        int l = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>l)
                l = arr[i];
        }
        return l;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int d = sc.nextInt();
       System.out.println(max_of_four_numbers(a, b, c, d));
       sc.close();
    }
}
