package Constructors;

   public class Demo_1 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Shravan";
        s1.age = 2;
        s1.rollnumber = 101;
        s1.college = "BBD";
        

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollnumber);
        System.out.println(s1.college);

        // int x; // local variable
        // System.out.println(x);
    
    }
}

  /* Default values */
  /*
  Integer --> 0
  floating --> 0.0
  Boolean --> false
  String --> null (nothing)
 */



class Student{
    String name; // information/Data/characteristics ---> instance variable 
    int age;
    int rollnumber;
    String college;


   void markAttendance(){  // behaviours --> function ---> instance method

    System.out.println("Attendence marked for student " + name);
 
   }
}

