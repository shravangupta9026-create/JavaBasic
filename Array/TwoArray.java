public class TwoArray {
    public static void main(String [] args) {
        int arr [] [] = {  // 2d array create aur initialize kiya 
            {10, 20, 30},  // 1st row 
            {40, 50, 60},  // 2nd row 
            {70, 80, 90},  // 3rd row
        };

    for (int i=0; i < arr.length; i++) { 
         // i row ko control karta hai

       for (int j=0; j < arr.length; j++) {
         // j row ko control karta h

        System.out.print(arr[i][j]+ " ");
        // row aur column ko wala element print kro
       }


         System.out.println();
        // agli row print kro

        
    }
  
    }  
}
