import java.util.*;

public class FirstRepeatingCharacter {

    public static void main(String[] args){
        String st = "sundaramseth";
        firstrepeatingchar(st);
    }

    public static void firstrepeatingchar(String st){

        HashSet<Character> set = new HashSet<>();

        for (int i=0; i<st.length(); i++){
            char ch = st.charAt(i);
            if (set.contains(ch)){
                System.out.println("First repeating character is: " + ch);
                return;
            } else {
                set.add(ch);
            }
        }

        System.out.println("No repeating character found");
    }

}