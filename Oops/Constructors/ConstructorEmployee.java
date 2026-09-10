package Constructors;

public class ConstructorEmployee {
    public static void main(String[] args) {
        Emplyoee e1 = new Emplyoee("Shravan" , 25, 500000, "IT");

        System.out.println(e1.name);
        System.out.println(e1.age);
        System.out.println(e1.salary);
        System.out.println(e1.department);
    }
    
}

class Emplyoee {
    String name;
    int age;
    int salary;
    String department;

    // Default constructor
    Emplyoee(){
}

// Parametrized constructor
Emplyoee (String n, int a, int s, String d) {
    name = n;
    age = a;
    salary = s;
    department = d;
}
}
