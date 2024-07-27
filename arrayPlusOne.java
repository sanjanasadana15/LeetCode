import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Iterate from the end of the array
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // Set the current digit to 0 and continue the loop to handle the carry
            digits[i] = 0;
        }

        // If all digits are 9, we need an additional digit at the beginning
       int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] digits = {1,9};
        System.out.println("Original: " + Arrays.toString(digits));
        int[] result = sol.plusOne(digits);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
