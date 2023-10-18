package dsa.maths.pallindrome;

/**
 * leetcode Url: <a href="https://leetcode.com/problems/palindrome-number/">...</a>
 * PS: Negative integer is never a palindrome: since backward it is read as 121- [consider reading it as a string]
 */
public class PalindromeInteger {

    /**
     * Reverses entire number to determine if it is palindrome
     * Time complexity: O(n)  [beats 72.17% users]
     * Space complexity: O(1) [Beats 93.26% users]
     */
    public static boolean determinePalindromeByNumberReversal(int number) {
        int reversedNumber = 0;
        if (number == 0) {
            return true;
        }
        if (number % 10 == 0 || number < 0) {
            return false;
        }
        int quotient = number;
        while (quotient != 0) {
            int remainder = quotient % 10;
            quotient = quotient / 10;
            if (reversedNumber > (Integer.MAX_VALUE / 10) || (reversedNumber == Integer.MAX_VALUE / 10 && remainder > 7))
                return false;
            reversedNumber = (reversedNumber * 10) + remainder;
        }

        return number == reversedNumber;
    }

    /**
     * Converts given number to string and traverses it from opposite ends to determine palindrome
     * Time complexity: O(n/2)  [beats 39.82% users]
     * Space complexity: O(n) [Beats 40.01% users] [confirm this: since string internally stored as char array]
     */
    public static boolean determinePalindromeByStringTraversal(int number) {
        if (number == 0) return true;
        if (number < 0 || number % 10 == 0) return false;
        String str = String.valueOf(number);
        int inputSize = str.length();
        int i, j;
        for (i = 0, j = inputSize - 1; j >= i; i++, j--) {
            if (str.charAt(i) == str.charAt(j)) {
                continue;
            }
            return false;
        }
        return true;
    }

    /**
     * Converts given number to string and traverses it from opposite ends to determine palindrome.
     * This approach is slightly modified from plain string traversal. We determine element from opposite end of string by formula: [n-i-1]
     * Time complexity: O(n/2)  [beats 39.82% users]
     * Space complexity: O(n) [Beats 40.01% users] [confirm this: since string internally stored as char array]
     */
    public static boolean palindromeCheckByStringTraversalAndMemoryOptimisation(int number) {
        if (number == 0) return true;
        if (number < 0 || number % 10 == 0) return false;
        String str = String.valueOf(number);
        int inputSize = str.length();
        int i;
        for (i = 0; i < (inputSize - 1) / 2; i++) {
            if (str.charAt(i) != str.charAt(inputSize - i - 1)) return false;
        }
        return true;
    }

    /**
     * Converts given number to string and traverses it from opposite ends to determine palindrome
     * Time complexity: O(n/2)  [Beats 100.00% users]
     * Space complexity: O(1) [Beats 50.84% users]
     */
    public static boolean palindromeCheckByHalfDigitTraversal(int number) {
        int reversedNumber = 0;
        if (number == 0) return true;
        if (number % 10 == 0 || number < 0) return false;

        //number is updated and updated quotient can become equal or less than reverse number
        while (number > reversedNumber) {
            int remainder = number % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            number = number / 10;
        }

        return number == reversedNumber || (number == reversedNumber / 10);
    }
}
