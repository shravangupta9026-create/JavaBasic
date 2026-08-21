package Linkedlist;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList <Integer> numbers = new LinkedList <>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        // set method
        numbers.add(3, 40);
        numbers.add(4, 50);
        System.out.println(numbers);
        System.out.println(numbers.get(2));
        numbers.remove(3);
        System.out.println(numbers);
        System.out.println(numbers.contains(30));
        System.out.println(numbers.contains(40));


        // element ko first aur last me add krne k liye
        numbers.addFirst(5);
        numbers.addLast(60);
        System.out.println(numbers);
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println(numbers);
        System.out.println(numbers.size());  // elemnt ka size

    }
    
}
