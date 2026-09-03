  
  /* 

 >> A function is a piece of code that we write once and use many times.
 >> Function ek reusable code ka block hai jo koi specific kaam karta hai.

  

static        // method ko class ke through directly call kar sakte hain
void          // method kuch return nahi karega
hello      // method ka naam
()            // koi parameter nahi hai
{             // method ka body start
    System.out.println("Hello");
}             // method ka body end

    
*/



package Function;
import java.util.*;


public class Function {

    // static void hello(){
    //     System.out.println("Hello Master");
    // }

    // static void helloShravanBoss() {
    //     System.out.println("HelloShravanBoss");
    // }

    static void printName(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        // hello();
        // helloShravanBoss();
        printName("Master Shravan");
        printName("Didi");
        printName("Rohit Bhaiya ");
    }
}

