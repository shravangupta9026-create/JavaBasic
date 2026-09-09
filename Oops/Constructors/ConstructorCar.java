package Constructors;

public class ConstructorCar {
    public static void main(String[] args) {
        Car c1 = new Car("Defender", "Black ", "kmp " + 112 , 10000000, 90.5  );
        System.out.println(c1.carname);
        System.out.println(c1.colour);
        System.out.println(c1.speed);
        System.out.println(c1.carprice);
        System.out.println(c1.capacity);
       
    }
    
}

class Car {
    String carname;
    String colour;
    String  speed;
    int carprice;
    double capacity;

  void Car (){
    System.out.println("One day I will own this Car "+ carname);


}

Car (String cn, String cl, String sp, int cp, double cap){
carname = cn;
colour = cl;
speed = sp;
carprice = cp;
capacity = cap;

}
}