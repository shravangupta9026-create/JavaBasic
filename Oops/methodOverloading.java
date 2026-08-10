class Calculator {

    int add(int a, int b) { // 2 values
        return a + b;
    }

    int add(int a, int b, int c) { // 3 values
        return a + b + c;
    }
}


public class methodOverloading {
     public static void main(String[] args) {

        Calculator c = new Calculator(); // Object

        System.out.println(c.add(10, 20)); // 2 params

        System.out.println(c.add(10, 20, 30)); // 3 params
     
    
    }
}
