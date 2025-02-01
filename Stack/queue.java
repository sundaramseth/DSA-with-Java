import java.util.Queue;
import java.util.ArrayDeque;

public class Queues{

 public static void main(String[] args){
  
  // Assign Stack
  Queue<Integer> qu = new ArrayDeque<>();

  // Add Elemnt to Queue
  qu.offer(10);
  qu.offer(20);
  qu.offer(30);
  qu.offer(40);
  qu.offer(50);

  // Get the front elemnt 
  System.out.println(qu.peek());

  //Remove element
  System.out.println(qu.remove());

    // Get the front elemnt 
  System.out.println(qu.peek());

     // Get the Size of queue 
  System.out.println(qu.size());


 }


}