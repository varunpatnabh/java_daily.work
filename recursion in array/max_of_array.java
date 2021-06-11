import java.io.*;
import java.util.*;

public class max_of_array {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i< arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int max = maxOfArray(arr,0);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }
        int max1 = maxOfArray(arr,idx+1);
        if(max1 > arr[idx]){
            return max1;
        }else{
            return arr[idx];
        }
        
    }
}
