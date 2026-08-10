abstract class Animal {

    abstract void sound(); // Child implement karega

    void eat() {           // Common method

        System.out.println("Eating");

    }
}

class Dog extends Animal {

    @Override
    void sound() {

        System.out.println("Bark");

    }
}



public class AbstractClass {
       public static void main(String[] args) {

        Dog d = new Dog();

        d.sound(); // Dog ka method
        d.eat();   // Parent ka method

    }
    
}
