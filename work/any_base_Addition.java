import java.util.*;
public class any_base_Addition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
        int d = getvalue(n, sourceBase, destBase);
        System.out.println(d);
     }
     
    public static int getvalue(int n, int sourceBase,int destBase){
         
         int dec = getValueIndecimal(n,sourceBase);
         int dn = getValueInbase(dec,destBase); 
        return dn;
     }
     
    public static int getValueInbase(int n, int sourceBase){
  
          int rv = 0;
          int p = 1;
          while(n>0){
              int num = n % sourceBase;
              n = n / sourceBase;
              rv += num * p;
              p = p * 10;
          }
          return rv;
  
    }
    public static int getValueIndecimal(int n, int destBase){
        // write your code here
        int rv = 0;
        int p = 1;
        
        
        
        while(n > 0 ){
              int dig = n% 10;
              n = n/10;
              rv += dig * p;
              p = p * destBase;
            
            
        }
      return rv;  
     }
}
