import java.util.*;

public class MaxFrequecyChar{
    public static void main(String[] args){
        String str = "aaddddbbbbsssccmmmmmzzzzzzzzzzzzzzzzzrlrlrlknlnvcrljknjkfkjfcdjsnjksdfnvkdlsnbvclsdkbcljdsbjcbdsljbszzzzzzkkkssjjfdhf";
        maxFreq(str);
    }

    public static void maxFreq(String st){
        HashMap<Character, Integer> fmap = new HashMap<>();

        for(int i=0; i < st.length(); i++){
            char ch = st.charAt(i);
            if(fmap.containsKey(ch)){
                int cfreq = fmap.get(ch);
                fmap.put(ch, cfreq + 1);
            } else {
                fmap.put(ch, 1);
            }
        }

        char maxChar = ' ';
        int maxFreq = 0;

        for(char c: fmap.keySet()){
            if(fmap.get(c) > maxFreq){
                maxFreq = fmap.get(c);
                maxChar = c;
            }
        }

        System.out.println("Max Freq Char: " + maxChar);
        System.out.println("Max Freq: " + maxFreq);


    }
}