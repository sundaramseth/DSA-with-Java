import java.util.*;

public class GetCommonElement{
    public static void main(String[] args){
        int[] arr1 = {1,2,344,55,6,7,5};
        int[] arr2 = {1,2,333,55,4,86,4};

        getCommonElement(arr1, arr2);

    }

    public static void getCommonElement(int[]arr1, int[]arr2){
        HashMap<Integer, Boolean> cmap = new HashMap<>();

        for(int i= 0; i< arr1.length; i++){
            cmap.put(arr1[i], true);
        
        }

        for(int i= 0; i< arr2.length; i++){
            if(cmap.containsKey(arr2[i])){
             System.out.println(arr2[i]);
            }
        }

        
    }
}
