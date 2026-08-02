public class javaforLoop {
    public static void main(String[] args) {
        int n = 112004;

        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit + " "); // space k sath horizontal print hoga
            n = n / 10;
        }
    }
}
    