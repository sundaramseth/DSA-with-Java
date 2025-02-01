import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Stack;

import java.util.LinkedList;

public class RQueues{

 public static void main(String[] args){

    Queue<Integer> queue = new ArrayDeque<>();

       queue.offer(10);
       queue.offer(20);
       queue.offer(30);
       queue.offer(40);
       queue.offer(50);

       reverse(queue, 3);

 }

     public static void reverse(Queue<Integer> queue, int k){

        Stack<Integer> st = new Stack<>();


       // Remove first 3 element from queue Then add in stack 
        for(int i=0; i < k; i++ ){
            st.push(queue.remove());
        }
       
       // Pop element from stack and add in queue
        for(int i=0; i < k; i++ ){
            queue.offer(st.pop());
        }

        // Now add reverse eleemnt to first

        int count = queue.size() - k;

        for(int i=0; i<count; i++){
            queue.offer(queue.remove());
        }

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
         System.out.println(queue.remove());
        System.out.println(queue.peek());
         System.out.println(queue.remove());

    }


}