import java.util.ArrayList;
import java.util.Scanner;

public class RemoveEvenNumber{

   public static void main(String[] args){

     
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the size of elemnts");

     int n = sc.nextInt();
     
     ArrayList<Integer> list = new ArrayList<>();

       System.out.println("Enter the elemnts");

     for(int i=0; i<=n; i++){
        int no = sc.nextInt();
        list.add(no);
     }

     RemoveEven(list);
     
    System.out.println(list);

   }
   
   public static void RemoveEven(ArrayList<Integer> list){

    for(int i= list.size() -1; i>=0; i--){
        if(list.get(i) % 2 == 0){
            list.remove(i);
        }
    }

   }

}