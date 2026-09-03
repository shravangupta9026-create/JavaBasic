package Function;

public class ReturnType {


    // static int getNumber() {
    //     return 10;  // method 10 wapas de raha hai

    // }

    static int add(){
        return 10+30;
    }

    static int multiply(){
        return 90*10;
    }

    public static void main(String[] args) {

        // int number = getNumber(); // method se 10 mila
        // System.out.println(number);

        int result = add();

        System.out.println(result);

        int multi = multiply();
        System.out.println(multi); 
    }
    
}
