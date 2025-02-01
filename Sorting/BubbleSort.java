import java.util.*;

public class BubbleSort{

    public static void main(String[] args){
        int[] arr = {2,8,4,-1,7,10,5,6};

        bubbleSort(arr); 
    }

    public static void bubbleSort(int[] arr){


      // first pointer
        for(int i=0; i< arr.length -1; i++){
            // Second pointer
            for(int j=0; j < arr.length - 1 - i; j++){

               if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
               } 
            }
        }

       for(int val : arr){
        System.out.println(val);
       }

    }

}