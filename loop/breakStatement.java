// public class breakStatement {
//     public static void main(String[] args) {
//         for (int i=1; i<=5; i++){
//             if(i == 3) {
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("i am out of the loop");
//     }
    
// }

// question : keep enetering numbers till user enters a multiple of 10 ?

// import java.util.Scanner;
// public class breakStatement {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         do {
//             System.out.println("enter your number : ");
//             int n = sc.nextInt();
            
//             if(n % 10 == 0){
//                 break;

//             }
//             System.out.println(n);
//         }while(true);
    
//     }
// }

//question : disply all numbers entred by user except multiple of 10

 import java.util.Scanner;
public class breakStatement {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      do {
        System.out.println("enter your number");
        int n = sc.nextInt();

        if(n % 10 == 0){
            continue; 
        }

        System.out.println("number was : " + n);

      } while(true);
      
        
    
     
    }
}