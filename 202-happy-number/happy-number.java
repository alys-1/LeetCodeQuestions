class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = getSumOfSquares(slow);   // Move slow pointer one step
            fast = getSumOfSquares(getSumOfSquares(fast)); // Move fast pointer two steps
        } while (slow != fast); // Loop until they meet

        return slow == 1;  // If they meet at 1, it's a happy number
    }

    // Helper function to calculate the sum of squares of digits of a number
    private int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
