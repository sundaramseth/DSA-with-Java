import java.util.*;

public class NFactorial{

  public static void main(String[] args){
    int N = 5;
    System.out.println(NFactorialFn(N));

  }

  public static int NFactorialFn(int N){

    if(N == 0){
        return 1;
    }

    int nminusone = NFactorialFn(N-1);
    return N * nminusone;


  }


}