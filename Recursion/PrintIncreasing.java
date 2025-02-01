import java.util.*;

public class PrintIncreasing{

  public static void main(String[] args){
    PrintIncreasingFunction(90);
  }

  public static void PrintIncreasingFunction(int N){
    if(N==0){
        return;
    }

    // System.out.println(N); // call before for decreasing order function work
    
     PrintIncreasingFunction(N-1);
   
     System.out.println(N); // call after for incresing order functon work
  }


}