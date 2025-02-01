import java.util.*;

class Solution {


   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

      System.out.println("Enter No of Element");

      int n = sc.nextInt();

      System.out.println("Enter nubers for reverse");

      int arr[] = new int[n];

      for(int i=0; i < n; i++ ){
          arr[i] = sc.nextInt();
      }

    convertToWave(n,arr);
   }

    public static void convertToWave(int n, int[] arr) {
        // code here

    //           //Main Logic 
    //   int i = 0;
    //   int j = 1;

    //   while(i < j){

    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    //     i+=2;
    //     j+=2;
    //   }

   


        for(int i=0; i <= n-1; i++ ){
            
            for(int j=1; j<= n-1; j++){
                
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                
                j+=2;
            }
            i+=2;
        }

             for(int k=0; k<n; k++){
           System.out.println(arr[k]);
      }


    }




}