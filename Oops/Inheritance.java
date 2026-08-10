
// class Animal {

//     void eat() {
//         System.out.println("Eating");
//     }
// }

// class Dog extends Animal {

//     void bark() {
//         System.out.println("Barking");
//     }
// }


// class Gautam {
//     void salary() {
//         System.out.println("10000");
//     }

//     void city() {
//         System.out.println("Lucknow");
//     }

//     void college (){
//         System.out.println("Bbdu");
//     }
// }


public class Inheritance {

    public static void main(String[] args) {

        // Dog d = new Dog();

        // d.eat();
        // d.bark();
        
        // Gautam g = new Gautam();

        // g.city();
        // g.college();
        // g.salary();

        Shravan s = new Shravan();

        s.personality();
        s.income();
    }
}

class Shravan {
    String name = "Shravan Gupta";
    int age = 19; 
    String colour = "white";
    String character = "hero";

    void personality(){
        System.out.println( name);
           System.out.println(age);
           System.out.println(colour);
           System.out.println(character);



    }

    void income () {
        int salary2 = 100000;
           System.out.println(salary2);



    }
    
}

