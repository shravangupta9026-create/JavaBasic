class Animal {

    void sound() { // Parent method
        System.out.println("Animal makes sound");
    }
}


class Dog extends Animal {

    @Override
    void sound() { // Method override
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    void sound() { // Method override
        System.out.println("Cat meows");
    }
}

public class mthodOverriding {
        public static void main(String[] args) {

        Animal a1 = new Dog(); // Parent reference, Dog object
        Animal a2 = new Cat(); // Parent reference, Cat object

        a1.sound(); // Dog method
        a2.sound(); // Cat method

    }
    
}
