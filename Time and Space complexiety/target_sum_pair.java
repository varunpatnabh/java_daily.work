import java.io.*;
import java.util.*;

public class target_sum_pair {
    public static void targetSumPair(int[] arr, int target){
        //write your code here
        Arrays.sort(arr);
        int le = 0,ri = arr.length - 1;// left,right
        while(le < ri){
            if(arr[le] + arr[ri] < target){
                le++;
            }else if(arr[le] + arr[ri] > target){
                ri--;
            }else{
                System.out.println(arr[le] + ", " + arr[ri]);
                le++;
                ri--;
            }
        }
       
    
      }
     
      
      public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i < n; i++){
          arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        targetSumPair(arr,target);
      }
}
