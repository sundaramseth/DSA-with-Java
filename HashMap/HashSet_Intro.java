import java.util.*;

public class HashSet_Intro{
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();

        set.add(5);
        set.add(3);
        set.add(8);
        set.add(5); // Duplicate, will not be added

        System.out.println("HashSet: " + set);

        // Check if an element exists
        if(set.contains(3)){
            System.out.println("Set contains 3");
        }

        // Remove an element
        set.remove(8);
        System.out.println("After removing 8: " + set);

        // Iterate through the HashSet
        System.out.println("Iterating through HashSet:");
        for(int num : set){
            System.out.println(num);
        }

        // Size of the HashSet
        System.out.println("Size of HashSet: " + set.size());

        // Clear the HashSet
        set.clear();

        System.out.println("After clearing, size of HashSet: " + set.size());
    }
}