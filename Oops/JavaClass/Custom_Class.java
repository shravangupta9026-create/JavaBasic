package JavaClass;

class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("and my name is "+ name);
    }
    public int getsalary(){
        return salary;
    }
}

public class Custom_Class {
    public static void main(String[] args) {
        System.out.println("This is our first custom class");
        Employee harry = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object


        // Setting properties
        harry.id=12;
        harry.salary= 34;
        harry.name = "CodeWithHarry";

        john.id = 17;
        john.salary=12;
        john.name = "John khandelwal";

        // Printing the Attribute
        harry.printDetails();
        john.printDetails();
        int salary = john.getsalary();
        System.out.println(salary);


        // System.out.println(harry.id);
        // System.out.println(harry.name);
    }
    
}
