import java.util.Stack;

public class Stacks{

 public static void main(String[] args){
  
  // Assign Stack
  Stack <Integer> st = new Stack<>();

  // Add Elemnt to stack
  st.push(10);
  st.push(20);
  st.push(30);
  st.push(40);
  st.push(50);

  // Print top most elemtn
  System.out.println(st.peek());

  // Remove elemnt from stack
  System.out.println(st.pop());

  //Print top most elemtn
  System.out.println(st.peek());

  // Size
  System.out.println(st.size());



 }


}