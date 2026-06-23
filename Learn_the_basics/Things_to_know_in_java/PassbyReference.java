package Learn_the_basics.Things_to_know_in_java;
import java.util.Scanner;

public class PassbyReference{
    public void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();

        PassbyReference obj = new PassbyReference();
        obj.reverse(arr);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

