public class ArrayRecap {


    public static void main(String[] args) {

        //Array with initial value 
        int[] arr = {4,7,65,5,5};

        //Get The Array Value 
        System.out.println(arr[1]);

        //Set The Array value
        arr[1] = 100;
        System.out.println(arr[1]);

        //Length of Array 
        System.out.println(arr.length);

        //Traverse the Array
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }


}