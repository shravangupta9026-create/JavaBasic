
import java.util.ArrayList;


public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // dynamic array create
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        // duplicate are allow

        System.out.println(list); // complete list print krne k liye
        System.out.println(list.get(1)); // index 1 ka element print karne k liye

        list.set(1, 5);  // index 1 ko replace kr k 5 kr do

        list.remove(0);   // index 0 element remove

        System.out.println(list.size());  // total element count 
        System.out.println(list.contains(30));  // 30 prsent hai? -true

     
        System.out.println(list.isEmpty());  // list empty hai to? - false


    }    // <-- Ye closing bracket add karein
    
}