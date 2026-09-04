package Function;
import java.util.*;

public class FunctionReturn {

    static int square(int number){
        int result = number*number;
        return result;

    }

    // static int test(){
    //     System.out.println("A");
    //     return 10;
    // }
    public static void main(String[] args) {
        // int result = test();
        // System.out.println(result);

        int answer = square(9);
        System.out.println(answer);


        
    }
    

}

/* 
Flow

test()
  ↓
"A" print
  ↓
return 10
  ↓
method STOP
  ↓
result = 10
  ↓
10 print

static int test() {

    return 10;

    System.out.println("Hello"); // ERROR dega
    Kyunki return 10 ke baad method khatam ho chuka hai.
}

*/
