// add element : element add krne k liye
// get operation : kon sa element kis index pr store hai ye pata krne k liye
// delete operation : element ko delete krne k liye
// set operation  : element ko update aur add krne k liye
// contains operation : kon sa element present hai ki nhi

import java.util.*;
public class arraylistconcept {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList <>();
        ArrayList<String>list2 = new ArrayList<>();
        ArrayList<Boolean>list3 = new ArrayList<>();

        // add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(2, 9);
        System.out.println(list);

        // // Get operation  -0(1)
        // int element = list.get(2);
        // System.out.println(element);

        // //delete or remove operation
        // list.remove(2);
        // System.out.println(list); 

        // // set operation 
        // list.set(2, 10);
        // System.out.println(list);

        // contais operation
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));





        
    }
}
