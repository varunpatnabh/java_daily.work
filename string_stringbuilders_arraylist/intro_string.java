import java.util.*;

public class intro_string {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        // String s1 = "hello";
        // String s1 = scn.nextLine();
        // String s2 = scn.nextLine();
        // System.out.println(s1);
        // System.out.println(s2);
        
        // String s = scn.nextLine();
        // System.out.println(s);
        // System.out.println(s.length());

        // for(int i = 0; i<s.length(); i++){
        //     char ch = s.charAt(i);
        //     System.out.println(ch);
        // }
        // s.charAt = 'z' // we cant change the character from string
        
        // String s = "abcd";
        // // System.out.println(s.substring(0,2));
        // for(int i = 0; i< s.length();i++){
        //     for(int j = i+1; j<=s.length();j++){
        //         System.out.println(s.substring(i,j));
        //     }System.out.println();
        // }
        
        // String s1 = "hello";
        // String s2 = "World";
        // String s3 = s1 + " " + s2;
        // // also we can add string or integers like this
        // s1 += " ";
        // s1 += "w";
        // s1 += "o";
        // System.out.println(s3);
        // System.out.println(s1);
        
        // System.out.println("hello" + 10 + 20);// hello 10 20
        // System.out.println(10 + 20 + "hello" );// 30hello
        // b/c operation happens left to right and once hello 10 became string 20 cant be added to string
        // but 10+20 operation happened first before adding to string
        
        String s = "abc def ghijkl";
        String[] parts = s.split(" ");// if there was separation by , then i/p will be abc,cde like that
        for(int i = 0; i <parts.length; i++){
            System.out.println(parts[i]);
        }
    }
}
