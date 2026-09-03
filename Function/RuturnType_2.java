package Function;

public class RuturnType_2 {

    static int square(int number){
        return number*number; // square karke result wapas
    }

    static void printName(String name){
        System.out.println(name);
    }

    static int divide(){
        return 50/5;
    }
    
    public static void main(String[] args) {
        int sqr = square(5);
        System.out.println(sqr);
        
        printName("Shravan");

       System.out.println(divide());


    }
}
