import java.util.*;

public class KLargest{
   

   public static void main(String[] args){

    int[] arr = {1,2,6,8,4,90,50,20};

    int k = 3;

    k_largest_number(arr, k);

   }

   public static void k_largest_number(int[] arr, int k){

    PriorityQueue<Integer> pq = new PriorityQueue<>();

    int i=0;

    while(i<k){
        pq.add(arr[i]);
        i++;
    }

    while(i < arr.length){
        if(arr[i] > pq.peek()){
            pq.remove();
            pq.add(arr[i]);
        }else{
            
        }
        i++;
    }

  while(pq.size() > 0){
   System.out.println(pq.remove());
  }

   }

}