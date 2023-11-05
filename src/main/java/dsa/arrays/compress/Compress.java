package dsa.arrays.compress;

public class Compress {

    /**
     * Time complexity: O(n)
     * Space complexity: O(n): n: size of input, i.e., worst case scenario if string contains single non-repeating subsequent characters.
     */
    public static String compress(String input) {
        String output = "";
        int frequency = 1;
        if (input.length() <= 1) return input;

        char letter = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == letter) {
                frequency++;
            } else {
                output += patternBuilder(frequency, letter);
                frequency = 1;
                letter = input.charAt(i);
            }
            if (i == input.length() - 1) {
                output += patternBuilder(frequency, letter);
            }

        }
        return output;
    }


    /**
     * Time complexity: O(n)
     * Space complexity: O(n): n: size of input, i.e., worst case scenario if string contains single non-repeating subsequent characters.
     */
    public static String compressByTwoPointers(String input) {
        int start = 0, end = 1;
        String output = "";
        if (input.length() <= 1) return input;
        input += "!";

        while (end < input.length()) {
            if (input.charAt(start) == input.charAt(end)) {
                end++;
            } else {
                output += patternBuilder(end - start, input.charAt(start));
                start = end;
                end++;
            }
        }
        return output;
    }

    private static String patternBuilder(int frequency, char letter) {
        if (frequency == 1) return String.valueOf(letter);
        else return frequency + String.valueOf(letter);
    }
}
