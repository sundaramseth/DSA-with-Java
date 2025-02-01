import java.util.*;
import java.util.Arrays.*;

public class BubbleSort{

    public static void main(String[] args){
        int[] arr = {2,8,4,-1,7,10,5,6};

        Arrays.sort(arr);

        for(int val:arr){
            System.out.println(val);
        }
    }


}