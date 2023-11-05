package dsa.maths.ArmstrongNumber;

/**
 * An Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits.
 * leetcode Url: <a href="https://leetcode.com/problems/armstrong-number/">...</a>
 */
public class Armstrong {

    /**
     * Time complexity: O(log10(n)) - since loop executes k times till dividend reduces to zero. i.e. dividend / 10^k = 1
     * Space complexity: O(1)
     */
    public static boolean determineArmstrongByModulus10(int number) {
        if (number == 0 || number == 1) return true;
        int dividend = number;
        int count;

        for (count = 0; dividend != 0; count++){
            dividend = dividend / 10;
        }
        int sum = 0;
        dividend = number;
        while (dividend != 0) {
            int remainder = dividend % 10;
            sum = (int) (sum + Math.pow(remainder, count));
            dividend = dividend / 10;
        }
        return sum == number;
    }

    /**
     * Time complexity: O(log10(n)) - due to second loop
     * Space complexity: O(1)
     */
    public static boolean determineArmstrongByLogarithm(int number) {
        if (number == 0 || number == 1){
            return true;
        }
        int count = (int) Math.floor(Math.log10(Math.abs(number))) + 1;
        int divident = number;
        int sum = 0;
        while (divident != 0){
            int remainder = divident % 10;
            sum = (int) (sum + Math.pow(remainder, count));
            divident = divident / 10;
        }
        return sum == number;
    }

    /**
     * Time complexity: O(log10(n)) = O(k) where k is digit count. k = log(n) + 1
     * Space complexity: O(n) since we are creating new string of same size as input.
     */
    public static boolean determineArmstrongByCharArray(int number) {
        if (number == 0 || number == 1) return true;
        String stringNumber = String.valueOf(Math.abs(number));
        int digitCount = stringNumber.length();
        int sum = 0;
        int i;
        for (i = 0; i < digitCount; i++){
            int digit = Character.getNumericValue(stringNumber.charAt(i));
            sum = (int) (sum + Math.pow(digit, digitCount));
        }

        return sum == Math.abs(number);
    }
}
