import java.io.*;
import java.util.*;

public class max_min {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i< arr.length; i++){
            
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }System.out.println(max +" ," + min);
        
            int f = max - min;
            System.out.println(f);
        
        
        }
    
}
