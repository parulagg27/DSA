package dsa.recursion.stringPalindrome;

public class PalindromicString {

    /**
     * Time complexity: O(n) - since traversing entire string and reversing it. Performed better than 15.05%
     * Space complexity: O(n) - since creating a new reversedString with same input size. Performed better than 37.02%
     */
    public static boolean determinePalindromeByReversingString(String sequence) {
        int i;
        sequence = sequence.toLowerCase();
        StringBuilder reverseSequenceBuilder = new StringBuilder();
        int length = sequence.length();
        for (i = 0; i < length; i++) {
            reverseSequenceBuilder.append(sequence.charAt(length - 1 - i));
        }
        String reversedSequence = reverseSequenceBuilder.toString();
        return sequence.equals(reversedSequence);
    }

    /**
     * Time complexity: O(n) - actual n/2 since traversing half string. Performed better than 24.57%
     * Space complexity: O(1) - since not creating a new string, only comparing chars on opposite ends. Performed better than 37.04%
     */
    public static boolean determinePalindromeByHalfTraversal(String sequence) {
        sequence = sequence.toLowerCase();
        int length = sequence.length();
        if (length == 0 || length == 1) return true;
        int index;
        for (index = 0; index < length / 2; index++) {
            if (sequence.charAt(index) != sequence.charAt(length - 1 - index)) return false;
        }
        return true;
    }

    /**
     * Time complexity: O(n) - actual n/2 since traversing half string. Performed better than 30.55%
     * Space complexity: O(n) - since creating a new char array to compare opposite ends. Performed better than 43.03%
     */
    public static boolean determinePalindromeByCharArrayAndHalfTraversal(String sequence) {
        var length = sequence.length();
        if (length == 0 || length == 1) return true;
        var charArraySequence = sequence.toLowerCase().toCharArray();
        int index;
        for (index = 0; index < length; index++){
            if (charArraySequence[index] != charArraySequence[length - 1 - index]) return false;
        }
        return true;
    }

    /**
     * Time complexity: O(n) - actual n/2 since traversing half string. Performed better than 30.55%
     * Space complexity: O(1) - as returning next recursive call, so it won't stack up on the call stack. Better than 23.32%
     */
    public static boolean determinePalindromeByRecursion(String sequence) {
        var length = sequence.length();
        if (length == 0 || length == 1) return true;
        return determinePalindromeByRecursion(sequence.toLowerCase(), 0, length - 1);
    }

    private static boolean determinePalindromeByRecursion(String sequence, int start, int end){
        if (start >= end) return true;
        if (sequence.charAt(start) != sequence.charAt(end)) return false;
        return determinePalindromeByRecursion(sequence, start + 1, end - 1);
    }
}
