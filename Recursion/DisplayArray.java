import java.util.*;

public class DisplayArray{

  public static void main(String[] args){

    int[] arr = {1,2,3,4,5};
    DisplayArrayElement(arr, 0);
  }

  public static void DisplayArrayElement(int[] arr, int idx){
   
   if(idx == arr.length){
    return;
   }
    System.out.println(arr[idx]);
    DisplayArrayElement(arr, idx+1);

  }


}