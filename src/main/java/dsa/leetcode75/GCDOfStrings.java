package dsa.leetcode75;

/**
 * Leetcode Problem statement: <a href="https://leetcode.com/problems/greatest-common-divisor-of-strings/">...</a>
 */
public class GCDOfStrings {

    /**
     * @Time_complexity O(log(min(n1, n2))) + time complexity for .repeat[multiplied] and .substring function [linear]
     * @Space_complexity O(n1 + n2) - as repeating gcd substring till the time it is equals substring1 & substring2
     */
    public static String gcdOfStringsViaGCD(String str1, String str2) {
        if (str1.equals(str2)) return str1;
        int str1Len = str1.length();
        int str2Len = str2.length();

        int gcd = gcd(str1Len, str2Len);
        String substring = str1.substring(0, gcd); //O(gcd length)
        //O(n1 * m1), O(n2 * m2)
        if ((substring.repeat(str1Len/gcd).equals(str1)) && (substring.repeat(str2Len/gcd).equals(str2))){
            return substring;
        }
        return "";
    }

    /**
     * TODO: Revisit: Editorial solution by leetcode.
     * New concept learnt: Concatenation of 2 strings that are repetition of a commoan substring = will be equal when combined in any order
     * @Time_complexity O(n + m) [for concatenation of 2 strings] + O(log(mn(m,n))) ~= O(n + m)
     * @Space_complexity O(n + m) [since 2 concatenated strings are created from both inputs]
     */
    public static String gcdOfStringsByConcatenationAndGCD(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";
        if (str1.isEmpty() || str2.isEmpty()) return "";
        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    /**
     * @Time_complexity O(log(min(n1, n2)))
     * @Space_complexity O(1)
     */
    private static int gcd(int l1, int l2) {
        while (true){
            int remainder = l1 % l2;
            if (remainder == 0) break;
            else {
                l1 = l2;
                l2 = remainder;
            }
        }
        return l2;
    }

    //TODO: implement brute force solution mentioned on editorial
}
