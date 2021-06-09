import java.io.*;
import java.util.*;

public class print_dec_inc {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
        
        printDecreasing(n);
        
        printIncreasing(n);
        
    }
    public static void printIncreasing(int n){
        if(n==0){
            return;
        }
        
        printIncreasing(n-1); // this line works for all then below line work one by one when n = 0 came.
        System.out.println(n);
    }
    public static void printDecreasing(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        
        
        printDecreasing(n-1);
    }
    // public static void main(String[] args) throws Exception {
//     Scanner scn = new Scanner(System.in);
//     int n = scn.nextInt();
//     pdi(n);
// }

// public static void pdi(int n){
//     if(n==0){
//         return;
//     }
//     System.out.println(n);
//     pdi(n-1);
//     System.out.println(n);
// }
}
