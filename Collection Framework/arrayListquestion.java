import java.util.*;
public class arrayListquestion {
    public static void main(String[] args) {
     
        /* 
        ArrayList<String> names = new ArrayList();
        names.add("Kalash");
        names.add("Rohit");
        names.add("Kittu");
        names.add("Shravan");
        names.add(4, "Chandni");

        System.out.println(names);
        // System.out.println(names.get(0));

        // names.remove(0);
        // System.out.println(names);
        // System.out.println(names.size());

        */
       ArrayList<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);

    //    list.add(1,6);
    //    System.out.println(list);
       
    //    list.remove(1);
    //    System.out.println(list);

       int element = list.get(1);
       System.out.println(element);

    //    System.out.println(list.size());

    System.out.println(list.contains(4));
    System.out.println(list.contains(11));

    }
    
}
