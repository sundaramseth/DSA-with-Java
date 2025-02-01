

import java.util.Scanner;  // Import the Scanner class

public class SumOfArray{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Array");
        int n = sc.nextInt();
        System.out.println("Enter Value for findind Max");
        int arr[] = new int[n];

        for(int i =0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Sum the array value
        int max = Integer.MIN_VALUE;

        for(int i =0; i < arr.length; i++){
           if(arr[i] > max){
            max = arr[i];
           }
        }

        System.out.println(max);

    }
}