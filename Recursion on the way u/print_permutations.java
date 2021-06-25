import java.io.*;
import java.util.*;

public class print_permutations {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printPermutations(str, "");
    }

    public static void printPermutations(String str, String asf) {
        
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        
        for(int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            String stlpart = str.substring(0,i);
            String strpart = str.substring(i+1);
            String roq = stlpart + strpart;
            printPermutations(roq, asf + ch);
        }
        
    }
}
