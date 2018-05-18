package Assignment2;

public class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {

        // 6
        // (6 % 1) = 0
        // (6 % 2) = 0
        // (6 % 3) = 0
        // (6 % 6) = 0

        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (n <= 1000 && n % i == 0) {
                result += i;
            }
        }
        return result;
    }
}
