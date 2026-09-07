package GetterSetter;


class Student{
    private int marks =85;
    private String name = "CodeWithShaan";

    void showMarks(){
        System.out.println("Marks :"+marks);
    }

    void showName(){
        System.out.println("Name :"+name);
    }
}


public class PrivateModifier {
    public static void main(String[] args) {
        Student s = new Student();

        s.showMarks();
        s.showName();

    }
    
}
