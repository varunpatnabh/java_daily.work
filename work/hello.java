/**
 * hello
 */
import java.util.*;

public class hello {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

         int n = scn.nextInt();
         int sp = 1;
         for(int i = 51;i<=n;i++){
             for(int j = 1;j<=sp-1;j++){
                 System.out.print("\t");
                //  System.out.print(sp);
             }sp++;
                 System.out.print("*\t");
                 System.out.println();
             
             
         }
         

    }
}