public class RotateNineDegreeMatrix{

public static void main(String[] args){
    //Static value used
    int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

    nineteenDegrre(arr);

}

public static void nineteenDegrre(int[][]arr){
    
    // Step 1 -> Take Transpose of Matrix (Convert row to col)

    for(int i=0; i<arr.length; i++){ // row
        for(int j=0; j<i; j++){ //col
        
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;         

        }
    }

    // for(int i=0; i<arr.length; i++){
    //     for(int j=0; j<arr[0].length; j++){
    //         System.out.print(arr[i][j]+ " ");
    //     }
    //     System.out.println();

    // }


    // Step 2 -> Row wise reverse 
    int j = 0;
    int i = 0;
    int n = 0;
    int k = arr[0].length -1;
  
while(n < arr.length){
    
        while(i <= n){
            while(j < k){
            int temp = arr[i][j];  // 
            arr[i][j] = arr[i][k];   //
            arr[i][k] = temp;  // 
            k--;
            j++;
            }
        i++;
        j=0;
        k=arr[0].length -1;
        }

        n++;
    }

    
      for(int l=0; l<arr.length; l++){
        for(int m=0; m<arr[0].length; m++){
            System.out.print(arr[l][m]+ " ");
        }
        System.out.println();

    }

  


}

}