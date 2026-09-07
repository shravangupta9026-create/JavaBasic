package JavaClass.GetterSetter;

class MyEmployee{
    private int id;
    private String name;


    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }

    public void setID(int i){
        this.id = i;
    }

    public int getId(){
        return id;
    }
}


public class AccessoModifier {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        // harry.id = 45;
        // harry.name = "CodeWithShravan";   --> Throws an error due to private access modifier
        harry.setName("CodewithShravan");
       System.out.println(harry.getName());

    }
    
}
