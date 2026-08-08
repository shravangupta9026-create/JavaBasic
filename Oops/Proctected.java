public class Proctected {
    protected void hack () {
        System.out.println("Hacker is hack");
    }
    public static void main(String[] args) {
        Hacker h = new Hacker();
        h.hack();
    }
}
class Hacker extends Proctected {   
}
