package dsa.arrays.uncompress;

public class Uncompress {

    /**
     * Time complexity: O(n * m): n = no. of groups in string [100p100q...], m = max. number out of all groups
     * Space complexity: O(n * m): n = no. of groups in string [100p100q...], m = max. number out of all groups
     */
    public static String uncompress(String input) {
        char[] inputCharArray = input.toCharArray();
        int length = input.length();
        StringBuilder frequency = new StringBuilder();
        StringBuilder outputBuffer = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(inputCharArray[i])) {
                frequency.append(inputCharArray[i]);
            } else {
                int repetitions = Integer.parseInt(frequency.toString());
                String letter = String.valueOf(inputCharArray[i]);
                outputBuffer.append(letter.repeat(repetitions));
                frequency = new StringBuilder();
            }
        }
        return outputBuffer.toString();
    }

    /**
     * Approach: Approach similar to uncompress method. Only difference: Using two pointers to determine start & end index
     * of integer in pattern and then get substring with this start and end index.
     * Time complexity: O(n * m): n = no. of groups in string [100p100q...], m = max. number out of all groups
     * Space complexity: O(n * m + size): n = no. of groups in string [100p100q...], m = max. number out of all groups,
     * size: size of input string since we are creating new character array
     */
    public static String uncompressByTwoPointers(String input) {
        char[] inputCharArray = input.toCharArray();
        StringBuilder uncompressed = new StringBuilder();
        int i = 0, j = 0;
        while (j < input.length()){
            if (Character.isDigit(inputCharArray[j])){
                j++;
            }
            else {
                String substringFrequency = input.substring(i, j);
                int repetitions = Integer.parseInt(substringFrequency);
                String letter = String.valueOf(inputCharArray[j]);
                uncompressed.append(letter.repeat(repetitions));
                j++;
                i = j;
            }
        }
        return uncompressed.toString();
    }

    /**
     * Approach: Approach similar to 2-pointer approach. Only difference: not creating new character array.
     * Using inbuilt string functions like: .contains(), .subString(), etc.
     * Time complexity: O(n * m): n = no. of groups in string [100p100q...], m = max. number out of all groups
     * Space complexity: O(n * m): n = no. of groups in string [100p100q...], m = max. number out of all groups
     */
    public static String uncompressWith2PointersWithoutCharArray(String input) {
        String digits = "0123456789";
        int i = 0, j = 0;
        StringBuilder output = new StringBuilder();
        while (j < input.length()){
            String character = String.valueOf(input.charAt(j));
            if (digits.contains(character)){
                j++;
            }
            else {
                int frequency = Integer.parseInt(input.substring(i, j));
                output.append(character.repeat(frequency));
                j++;
                i = j;
            }
        }
        return output.toString();
    }
}
