import java.util.*;
public class pat13 {
    public static void main(String[] args){
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        int icj = 1;
        for(int i = 0; i<n;i++){
            for(int j = 0; j<=n;j++){
               System.out.print(icj+"\t");
               int icjp1 = icj * (i-j)/(j+1);
               icj = icjp1;  
            }
            System.out.println();
        }


    }
    
}
