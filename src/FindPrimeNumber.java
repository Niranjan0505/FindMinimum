public class FindPrimeNumber {
    public static void main(String[] args) {
        isPrime(10);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
        return false;
    }
}

