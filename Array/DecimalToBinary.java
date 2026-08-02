// public class DecimalToBinary {
//   public static void main(String[] args) {
//     int decimal = 13;
//      // decimal no. jise convert karna hai 

//     int binary = 0; 
//      // final binary no. store karega 

//     int power = 0;
//      // 10 ki power (1,10,100,1000....)
     
//     while (decimal > 0) {
//      // jab tak decimal 0 na ho jaye 


//         int remainder = decimal % 2;
//         // 2 se divide karke remainder nikalo
//         // remainder hamesha o ya 1 hoga 

//         binary = binary + (remainder * (int)Math.pow(10,power));
//           //binary no bnao
//           // Example:
//           // remainder =1
//           // power = 2
//           // 1*100 = 100
//           power++; 
//           // agli binary digit k liye power badhao

//           decimal = decimal / 2;
//           // decimal ko 2 se divide kro
//           // Next iteration k liye ready 

//     }

//     System.out.println("Binary =" + binary);

//   }
    
// }




// question : decimal to binary (method version)

public class DecimalToBinary {

    public static void decToBin(int decNum) {
        int myNum = decNum; 
        // original no ko save kiya

        int binNum = 0;
        //final bonary no

        int pow = 0;
        // 10 ki power (1,10,100,1000.....)

        while(decNum > 0) {
            // jab tak no. 0 na ho

            int rem = decNum % 2;
            // remainder nikalo (0 ya 1)
            // remainder ko correct place pr add kro

            binNum = binNum + (rem * (int)Math.pow(10, pow));

            pow++; // next binay position

            decNum = decNum / 2;
            // no. ko 2 se divide kro

        }

        System.out.println("Binary of " + myNum + " = " + binNum);

    }

    public static void main(String[] args) {
        
        decToBin(13);
        // method ko call
    }
        
    
}
