public class ReverseArray {

    // Method to reverse array
    public static void reverse(int arr[]) {

        int start = 0;                 // // First index
        int end = arr.length - 1;      // // Last index

        while (start < end) {          // // Continue until pointers meet

            int temp = arr[start];     // // Store first element
            arr[start] = arr[end];     // // Put last element at first
            arr[end] = temp;           // // Put stored value at last

            start++;                   // // Move forward
            end--;                     // // Move backward
        }
    }

    public static void main(String args[]) {

        int arr[] = {10, 20, 30, 40, 50};

        reverse(arr);

        System.out.print("Reversed Array : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}