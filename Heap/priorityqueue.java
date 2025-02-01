import java.util.*;

public class PQueue{

  
  public static void main(String[] args){

    //Lower order number is higher priority

      PriorityQueue<Integer> pq = new PriorityQueue<>();

    // If you want to change priority for higerorder number you can pass Collection.reverse in priority queue when assigning.
    // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
  


    // Put -  complexity O(logn)
    pq.add(10);
    pq.add(30);
    pq.add(60);
    pq.add(20);
    pq.add(40);
    pq.add(10);

    // Remove complexity O(logn)
    System.out.println(pq.remove());

    System.out.println(pq.remove());

    System.out.println(pq.remove());

    // Get - complexity O(1)
    System.out.println(pq.peek());
    System.out.println(pq.peek());

    // Size -  complexity O(1)
    System.out.println(pq.size());

  }
   


}