import java.util.*;

public class RemoveVowel{

 public static void main(String[] args){
    String st = "Remove vowels from me";
    removeVowels(st);
 }
 
 public static void removeVowels(String st){
    
    for(int i=0; i < st.length(); i++){
        char ch = st.charAt(i);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
          continue;
        }
        
        System.out.print(ch);
    }
 }

}