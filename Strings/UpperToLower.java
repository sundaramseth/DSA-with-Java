import java.util.*;

public class UpperCaseToLowerCase{

public static void main(String[] args){

    String st = "WElcoME to ScAleR";

    UpperToLower(st);
}

public static void UpperToLower(String st){

   char[] a = st.toCharArray();

   for(int i=0; i<a.length; i++){
     
     char ch = a[i];

     if(ch >= 'A' && ch <='Z'){

       char charch = (char)(ch - 'A' + 'a');

       a[i] = charch;
       
     }
 
    System.out.print(a[i]);
   }




}

}