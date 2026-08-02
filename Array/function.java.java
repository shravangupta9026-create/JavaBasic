// public class function {
//     public static void printHelloWorld () {
//         System.out.println("mummy");
//         System.out.println("papa");
//         System.out.println("badi didi");
//         System.out.println("chadni didi");
//         System.out.println("rohit bhaiya");
//         System.out.println("shravan gupta");
//     }
//     public static void main(String[] args) {
//         printHelloWorld();
        
//     }
    
// }


// import java.util.*;
// public class function {

//     public static void printHelloWorld() {
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//     }
     
//     public static int calculateSum (int num1, int num2) { // paramters or formal parameters
//         int sum = num1 + num2;
//         return sum;
//     }


//     public static void calculateSum() {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculateSum(a,b); // arguments or actual parameters
//         System.out.println("sum is:" + sum);
//     }

 
// }  





// import java.util.*;
// public class function {

//     public static void printHelloWorld() {
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//     }
     
//     public static int calculateSum (int num1, int num2) { // paramters or formal parameters
//         int sum = num1 + num2;
//         return sum;
//     }
    



    
//     public static void main(String[] args) {
//         // swap - values exchange
//         int a = 5;
//         int b = 10;

//         // swap

//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println("a = " +a);
        
//         System.out.println("a = " +b);
         
         
//     }
 
// }  





// question : find product of a & b
 
// public class function {

//     // method to find product 
//     static int product (int a, int b){
//         return a*b;
//     }

//     public static void main(String[] args) {
//         int result = product(5, 4);
//         System.out.println("Product = " + result);
//     }
// }


// question : find factorial ?

// public class function {

//     public static void main(String[] args) {
        

//         int num = 5;
//         int factorial = 1;
        

//         for (int i = 1;  i <= num; i++) {
//             factorial = factorial * i;
//         }

//         System.out.println("Factorial = " + factorial);
//     }
// }



// question : find binomial coefficient

// public class function {

//     // method to ccalculate factorial
//     static int factorial (int num) {

//         int fact = 1;

//         for (int i = 1; i <= num; i++) {
//             fact = fact * i;
//         }
//         return fact;

        
//     }
//     public static void main(String[] args) {
        
//         int n = 5;
//         int r = 2;


//         int result = factorial(n) / (factorial(r)) * factorial(n- r);

//         System.out.println("binomial coefficient = " + result);

//     }
// }





// fun to calculate sum of 2 num 

// public class function {

//     static int sum(int a, int b){
//         return a + b;
//     }
//   // fun calculate sum of 3 num
//     static int sum(int a, int b, int c){
//         return a + b + c;
//     }

//     public static void main(String[] args) {
//         System.out.println(sum(5, 10));
//         System.out.println(sum(5, 10, 15));
//     }
// }



// different data type ?

// public class function {

//     static void show(int a) {
//         System.out.println("Integer : " + a);
//     }

//     static void show(double a) {
//         System.out.println("Double : " + a);

//     }

//     public static void main(String[] args) {
//         show (10);

//         show (20);
//     }
// }





// public class Main {

//     static void show(int a) {
//         System.out.println("Integer : " + a);
//     }

//     static void show(double a) {
//         System.out.println("Double : " + a);
//     }

//     public static void main(String[] args) {

//         show(10);

//         show(10.5);

//     }
// }


// example arae program

// public class function {
//     static int area(int side) {
//         return side * side;


//     }

//     static int area(int length, int width){
//         return length * width;
//     }

//     public static void main(String[] args) {
        
//         System.out.println(area(5));

//         System.out.println(area (4,6));
//     }


// }



// public class Main {

//     public static void main(String[] args) {
        
//         int num = 7;
//         boolean isPrime = true;

//     if (num <= 1) {
//         isPrime = false;
//     } else {

//         for (int i=2; i < num; i++) {
//             if (num % i == 0){
//                 isPrime = false;
//                 break;
//             }
//         }
//     }
//     if (isPrime) {
//         System.out.println("Prime Number");

//     } else {
//         System.out.println("Not Prime Number");
//     }

//     }
// }



// print all prime number in range 

// public class Main {

//     public static void main(String[] args) {

//         int start = 10;
//         int end = 30;

//         for (int num = start; num <= end; num++) {

//             if (num <= 1) {
//                 continue;
//             }

//             boolean isPrime = true;

//             // Prime check
//             for (int i = 2; i * i <= num; i++) {

//                 if (num % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }

//             // Print after checking
//             if (isPrime) {
//                 System.out.print(num + " ");
//             }
//         }
//     }
// }


