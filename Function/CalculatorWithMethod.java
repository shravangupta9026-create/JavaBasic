package Function;

public class CalculatorWithMethod {
    
    static int add (int a, int b){
        return a+b;
    }

    static int substraction  (int a, int b){
        return a-b;
    }

    static int multiplication (int a, int b){
        return a*b;
    }

    static int divide (int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        int a =20;
        int b = 5;

        System.out.println(add(a, b));
        System.out.println(substraction(a, b));
        System.out.println(multiplication(a, b));
        System.out.println(divide(a, b));
    }
    
}
