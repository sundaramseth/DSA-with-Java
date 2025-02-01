import java.util.LinkedList;

public class StackLL{

 public static void main(String[] args){
  
   LinkedList<Integer> stack = new LinkedList<>();

   stack.addFirst(10);

   stack.addFirst(40);

   stack.addFirst(50);

   System.out.println(stack.removeFirst());

   System.out.println(stack.removeFirst());

 }


}