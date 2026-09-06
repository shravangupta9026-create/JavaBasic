// Parameter + Argument + Return


package Function;
import java.util.*;

class ParameterWithReturn {

    static int add(int a, int b) {
        return a+b;
       
    }
    static int multiply(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        int add = add(9000, 1000);
         System.out.println(add);

         int multi = multiply(9, 1000);
         System.out.println(multi);
        
        
    }

    
}