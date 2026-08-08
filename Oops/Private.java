public class Private {
    private int age = 20;

    void show () {
        System.out.println(age);

    }

    public static void main(String[] args) {
        Private s = new Private ();
        s.show();
    }
}
