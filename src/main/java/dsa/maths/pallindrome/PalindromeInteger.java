package dsa.maths.pallindrome;

public class PalindromeInteger {

    /**
     * Reverses entire number to determine if it is palindrome
     * leetcode Url: <a href="https://leetcode.com/problems/palindrome-number/">...</a>
     * Time complexity: O(n)  [beats 72.17% users]
     * Space complexity: O(1) [Beats 93.26% users]
     */
    public static boolean determinePalindromeByNumberReversal(int number) {
        int reversedNumber = 0;
        if (number == 0) {
            return true;
        }
        if (number % 10 == 0 || number < 0){
            return false;
        }
        int quotient = number;
        while(quotient != 0) {
            int remainder = quotient % 10;
            quotient = quotient / 10;
            if (reversedNumber > (Integer.MAX_VALUE/10) || (reversedNumber == Integer.MAX_VALUE/10 && remainder > 7)) return false;
            reversedNumber = (reversedNumber * 10) + remainder;
        }

        return number == reversedNumber;
    }
}
