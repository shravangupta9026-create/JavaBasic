
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

        list.set(1, 5);

        list.remove(0);

        System.out.println(list.size());
        System.out.println(list.contains(30));

        System.out.println(list.isEmpty());
    } // <-- Ye closing bracket add karein
}