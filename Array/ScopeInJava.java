// public class ScopeInJava {

//     public static void main(String[] args) {
        
//         int a = 10; // scope start here

//         System.out.println(a);
//         // scope end here
//     }
    
// }

//Ex .1 : Local Scope 

// public class ScopeInJava {

//     public static void main(String[] args) {
        
//         for (int i = 1; i <= 3; i++) {

//             System.out.println(i);

//         }

//     }
// }
   
    

public class ScopeInJava {

    public static void main(String[] args) {

        int a = 5;
        if (true) {
            int b = 10;

        System.out.println(a);
        }

        System.out.println(a);
        // System.out.println(b);
    }

}