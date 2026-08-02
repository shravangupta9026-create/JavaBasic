public class prime_number {

    public static void main(String[] args) {

        int start = 10;
        int end = 30;

        for (int num = start; num <= end; num++) {

            if (num <= 1) {
                continue;
            }

            boolean isPrime = true;

            // Prime check
            for (int i = 2; i * i <= num; i++) {

                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Print after checking
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}


    

