import java.util.LinkedList;

public class QueueLL{

 public static void main(String[] args){
  
   LinkedList<Integer> queue = new LinkedList<>();

   //add last
   queue.addLast(10);

   queue.addLast(40);

   queue.addLast(50);

   // remove first
   System.out.println(queue.removeFirst());

   
   // remove first
   System.out.println(queue.removeFirst());

 }


}