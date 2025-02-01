import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListClass{

public static void main(String[] args){

   Scanner sc = new Scanner(System.in);

   ArrayList<Integer> list1 = new ArrayList<>();

   //Add 
   list1.add(20);
   list1.add(10);
   list1.add(30);

   System.out.println(list1);

   //add at index
   list1.add(0,55);

   System.out.println(list1);

   //Get 
   System.out.println(list1.get(3));

   //Set
   list1.set(2,70);

   System.out.println(list1);

   //Remove
   list1.remove(3);
   
   System.out.println(list1);

   //Size

   System.out.println(list1.size());



}

}