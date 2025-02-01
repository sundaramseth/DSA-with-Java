import java.util.Scanner;

public class ReverseOfArray{

    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter No of Element");

      int n = sc.nextInt();

      System.out.println("Enter nubers for reverse");

      int arr[] = new int[n];

      for(int i=0; i < n; i++ ){
          arr[i] = sc.nextInt();
      }

      //Main Logic 
      int i = 0;
      int j = n-1;

      while(i < j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }

      for(int k=0; k<n ; k++){
        System.out.println(arr[k]+"");
      }

    }


}