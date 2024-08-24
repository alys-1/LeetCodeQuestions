class Solution {
    public double myPow(double x, int n) {
        // Handle base case when n is 0
        if (n == 0) {
            return 1.0;  // x^0 is always 1
        }

        // Handle negative powers
        long N = n;  // Convert to long to avoid overflow with Integer.MIN_VALUE
        if (N < 0) {
            x = 1 / x;   // Convert to positive power by inverting x
            N = -N;      // Negate N to make it positive
        }

        return fastPow(x, N);
    }

    private double fastPow(double x, long n) {
        // Base case: x^0 is always 1
        if (n == 0) {
            return 1.0;
        }

        // Recursively compute half of the power
        double half = fastPow(x, n / 2);

        // If n is even, result is half * half
        // If n is odd, result is half * half * x
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}