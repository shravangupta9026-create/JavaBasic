// public class LinearSearch {

//     // Linear Search Method 
//     public static int linearSearch(int arr[], int key) {


//     // Loop through every element
//     for (int i = 0; i < arr.length; i++) {

//         //compare current element with key
//         if (arr[i] == key) {

//             return i; // ELement found - return index
//         }
//     }
        
//     return -1; // Element not found

//     }

//     public static void main(String[] args) {
        
//         int number[] = {10, 20, 30, 40, 50}; // Array

//         int key = 40; // Element to Search

//         int index = linearSearch(number, key);

//         if (index == -1){

//             System.out.println("Element Not Found");

        
//         } else {
//             System.out.println("Element Found at Index : " + index);
//         }
//     }
// }



// // question : Find roll number 104 ?

// public class LinearSearch {

//     public static int searchRoll(int roll[], int key) {

//         // check every roll number 
//         for (int i = 0; i < roll.length; i++) {

//             if (roll[i] == key) {

//                 return i; // roll no. found

//             }
//         }

//         return -1; // roll number not found 

//     }

//     public static void main(String[] args) {

//         int roll[] = {101, 102, 103, 104, 105};

//         int index = searchRoll(roll, 104);

//         if (index == -1)

//             System.out.println("Roll Number Not Found");

//             else
//                 System.out.println("Roll Number Found at Index : " + index);

         

//     }
// }




// // question : Search a Name 

// public class LinearSearch {

//     public static int searchName(String names[], String key) {

//         // check every name
//         for (int i = 0; i < names.length; i++) {

//             if (names[i].equals(key)) {

//                 return i; // name found

//             }

//         }

//             return -1;  // Name found 
//     }

//     public static void main(String[] args) {
        
//         String names [] = {"Aman", "Rahul", "Rohit", "Neha"};

//         int index = searchName(names, "Rohit") ;

//         if (index == -1)
//             System.out.println("Name Not Found");
//         else
//             System.out.println("Name Found at Index : " + index);
//     }
// }




// question : find lrgest no. 


public class LinearSearch {

// laregest no. find method 
public static int getLargest(int arr[]) {

    int largest = arr[0];  // first ko largest maan lo

    // second element se check kro
    for (int i = 1; i < arr.length; i++) {

        //ager current bada hai
        if (arr[i] > largest) {

            largest = arr[i]; // largest update kro

        }
    }

    return largest; // largest return kro

}
    

public static void main(String[] args) {
    
    int number [] = {10, 20, 50, 30, 40};  // array

    int ans = getLargest(number);  // method call

    System.out.println("Largest = " + ans); // answer print
}


    
}