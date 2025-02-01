import java.util.*;

public class SelectionSort{

    public static void main(String[] args){
        int[] arr = {2,8,4,-1,7,10,5,6};

        selectionSort(arr); 
    }

    public static void selectionSort(int[] arr){


      // first pointer
        for(int i=0; i< arr.length -1; i++){
            int minVal = arr[i];
            int minInx = i;

            // Second pointer
            for(int j=i+1; j < arr.length; j++){

                // Find the min value

                if(arr[j] < minVal){
                    minVal = arr[j];
                    minInx = j;
                } 
            }

            //Swap the min value

            int temp = arr[i];
            arr[i] =  arr[minInx];
            arr[minInx] = temp;

        }

       for(int val : arr){
        System.out.println(val);
       }

    }

}