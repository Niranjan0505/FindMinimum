public class FactorialNumber {
    public static void main(String[] args) {
        int n = 5;
        int fact = factorial(n);
        factorial(n);
        System.out.println("Factorial of " + n + " is " + fact);
    }

public static int factorial(int n) {
    int Fact = 1;
        for (int i = 1; i <= n; i++) {
            Fact = Fact * i;
        }
        return Fact;
    }
}
