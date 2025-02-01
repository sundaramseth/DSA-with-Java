import java.util.*;

public class BubbleSort{

    public static void main(String[] args){
        int[] arr = {2,8,4,-1,7,10,5,6};

        bubbleSort(arr); 
    }

    public static void bubbleSort(int[] arr){


      // first pointer
        for(int i=1; i< arr.length; i++){

            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;

        }

       for(int val : arr){
        System.out.println(val);
       }

    }

}