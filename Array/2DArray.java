public class TwoDArray{
    public static void main(String[] args){

        int[][] arr = new int[5][6];

        //Set
        arr[1][3] = 10;

        //Get
        System.out.println(arr[1][3]);
        System.out.println(arr[2][5]);

        //Row Count
        System.out.println(arr.length);

        // Col Count
        System.out.println(arr[0].length);

        //Traversal
        for(int i=0; i<arr.length; i++){ //i -> row no
          
          for(int j=0; j<arr[0].length; j++){ //j -> col no
            
            //Processing
            System.out.print(arr[i][j]);

          }

        }


    }
}