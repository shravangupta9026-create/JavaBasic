import java.util.ArrayList;

public class Arraylistquestion2 {
   
    public static void main(String[] args) {
     /* 
        ArrayList <String> names = new ArrayList<>();
        names.add("shravan");
        names.add("Rohit");
        names.add("Manu");
        names.add("Chandni");
        names.add("Kittu bhai");
        System.out.println(names);
        // System.out.println(names.get(2));
        names.remove(2);
        System.out.println(names);

        names.set(1, "Rohit bhaiya");
        System.out.println(names);

     */
    ArrayList <String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Mango");
    fruits.add("Banana");
    fruits.add(1, "Orange");
    System.out.println(fruits);

    fruits.remove(1);
    System.out.println(fruits);
    System.out.println(fruits.get(1));
    System.out.println(fruits.size());

    System.out.println(fruits.contains("Apple"));
    System.out.println(fruits.contains("Kivi"));

    }
}
