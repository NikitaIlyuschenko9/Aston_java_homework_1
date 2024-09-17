import java.math.BigInteger;

public class CalcFactorial {
    public static int factorial(int n) {
        int fact = 1;
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
