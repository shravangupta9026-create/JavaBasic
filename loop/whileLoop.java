/* 

public class whileLoop {
    public static void main(String[] args) {
        int counter = 0;
        while(counter < 10) {
            System.out.println("Hello World");
            counter++;
        }

        System.out.println("printer HW 10x");
    }
    
}
*/


// question: print no. from 0 to 5
/* 
public class whileLoop {
    public static void main (String[] args){
        int i=0;
        while (i<5) {
            System.err.println(i);
            i++;
        }
    }
}
   
*/
// question: print no. from 1 to 10


/* 
public class whileLoop {
    public static void main(String[] args) {
        int counter=1;
        while (counter<=10){
            System.err.println(counter);
            counter++;
        }
    }
}

*/


// question : Print number from 1 to  n

/* 

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int range = SC.nextInt();
        int counter = 1;


        while (counter <= range ) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
    }
}

*/

// question : Print sum of first n natural number 



import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int sum = 0;

        int i =1;
        while (i <= n){
            
            sum += i;
            i++;

            System.out.println("sum is:" +sum);
            

        }
    }
}
