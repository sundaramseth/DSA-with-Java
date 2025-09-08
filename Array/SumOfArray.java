

import java.util.Scanner;  // Import the Scanner class

public class SumOfArray{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Array");
        int n = sc.nextInt();
        System.out.println("Enter Value for sum");
        int arr[] = new int[n];

        for(int i =0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Sum the array value
        int sum = 0;

        for(int i =0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        System.out.println(sum);

    }
}