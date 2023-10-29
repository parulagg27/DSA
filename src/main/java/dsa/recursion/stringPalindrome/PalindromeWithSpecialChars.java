package dsa.recursion.stringPalindrome;

/**
 * Problem statement Url: <a href="https://leetcode.com/problems/valid-palindrome">...</a>
 */
public class PalindromeWithSpecialChars {

    /**
     * Approach: Replace all special chars & whitespaces, and then half traverse string
     * Time complexity: O(n) - Beats 39% users. Traversing entire string to replace special chars + half-traversing again to check palindrome
     * Space complexity: O(n) - Beats 19.23% users. Since replaceAll function internally using stringBuilder to create new string and assign it.
     */
    public static boolean determinePalindromeByReplacingSpecialChars(String sequence) {
        sequence = sequence.trim();
        String regexToReplace = "[^A-Za-z0-9]";
        sequence = sequence.replaceAll(regexToReplace, "");
        return PalindromicString.determinePalindromeByHalfTraversal(sequence);
    }

    /**
     * Approach: Matching the given regex. Not creating new string with replaced chars. Instead, traverse string via
     * 2-pointers, move pointer left or right if char at that index is special char.
     * Time complexity: O(n) - Beats 13.74% users. Half traversing string + doing string conversion, regex match
     * Space complexity: O(1) - Beats 14.27% users. Since not replacing string chars & traversing in place.
     * String.valueOf returns references to existing string objects for each character & thus takes constant space.
     */
    public static boolean isPalindromeByRegexMatchAndTwoPointerTraversal(String sequence) {
        int start = 0;
        int end = sequence.length() - 1;
        String regex = "[^A-Za-z0-9]";
        while (start < end) {
            char startChar = sequence.charAt(start);
            char endChar = sequence.charAt(end);
            if (String.valueOf(startChar).matches(regex)) {
                start++;
                continue;
            }
            if (String.valueOf(endChar).matches(regex)) {
                end--;
                continue;
            }
            if (!String.valueOf(startChar).equalsIgnoreCase(String.valueOf(endChar))) return false;
            start++;
            end--;
        }
        return true;
    }

    /**
     * Approach: Instead of using regex, using Character.isLetterOrDigit inbuilt method to check if letter or digit.
     * Thus, it reduces number of String.valueOf conversions & regex matches.
     * Time complexity: O(n) - Beats 99.39% users. n/2 time since traversing half of string
     * Space complexity: O(1) - Beats 81.87% users. Taking constant memory space for traversal.
     */
    public static boolean isPalindromeByHalfTraversalAndNoRegex(String sequence) {
        int start = 0;
        int end = sequence.length() - 1;
        while (start < end) {
            char startChar = sequence.charAt(start);
            char endChar = sequence.charAt(end);
            if (!Character.isLetterOrDigit(startChar)) start++;
            else if (!Character.isLetterOrDigit(endChar)) end--;
            else {
                if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) return false;
                start++;
                end--;
            }
        }
        return true;
    }
}
