import java.io.*;
import java.util.*;

public class subsequence {
    public static void main(String[] args) throws Exception {
        //     String str  = "hello";
        //     System.out.println(str);
        //   // char ch = str.charAt(0);
        //     for(int i = 0; i< str.length();i++){
        //         char ch = str.charAt(i);
        //         System.out.println(ch);
        //     }
        //     String ss = str.substring(2,4);
        //     System.out.println(ss);
        
            // ArrayList<Integer> list = new ArrayList<>();
            // list.add(10);
            // list.add(20);
            // list.add(30);
            
            // for(int val: list){
            //     System.out.println(val);
            // }
            // for(int i = 0; i< list.size(); i++){
            //     int v = list.get(i);
            //     System.out.println(v);
            // list.set(2,2000);
            // System.out.println(list + " -> " + list.size());
            // list.add(2,3000);
            // System.out.println(list + " -> " + list.size());
            
            
            Scanner scn = new Scanner(System.in);
            String str = scn.next();
            ArrayList<String> res = gss(str);
            System.out.println(res);
        }
    
        public static ArrayList<String> gss(String str) {
           if(str.length() == 0){
               ArrayList<String> bres = new ArrayList<>();
               bres.add("");
               return bres;
           }
           
            char ch = str.charAt(0); // a
            String ros = str.substring(1); // bc
            ArrayList<String> rres = gss(ros); 
            
            ArrayList<String> mres = new ArrayList<>();
            for(String rstr : rres){
                mres.add("" + rstr);
                
            }
            for(String rstr : rres){
                
                mres.add(ch + rstr);
            }
            return mres;
        }
}
