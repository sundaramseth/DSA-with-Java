import java.util.*;

public class PrintFirstIndex{

  public static void main(String[] args){
    int[] arr = {2,3,6,9,8,3,2,6,3,4};
    int x = 10;
    System.out.println(PrintFirstIndexFn(arr, x, 0 ));

  }

  public static int PrintFirstIndexFn(int[] arr,int x, int i){

    if(i == arr.length){
        return -1;
    }

    if(arr[i] == x){
        return i;
    }
    else{
        int idx = PrintFirstIndexFn(arr,x, i+1);
        return idx;
    }

  }


}