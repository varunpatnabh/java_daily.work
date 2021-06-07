import java.util.*;
public class decimal_to_any_base {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInbase(n, b);
        System.out.println(dn);

    }
    public static int getValueInbase(int n, int b){

        int rv = 0;
        int p = 1;
        while(n>0){
            int num = n % b;
            n = n / b;
            rv += num * p;
            p = p * 10;
        }
        return rv;

    }

}
