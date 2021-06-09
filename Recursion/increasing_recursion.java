import java.io.*;
import java.util.*;
public class increasing_recursion {
    


    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n){
        if(n==0){
            return;
        }
        
        printIncreasing(n-1); // this line works for all then below line work one by one when n = 0 came.
        System.out.println(n);
    }


}
