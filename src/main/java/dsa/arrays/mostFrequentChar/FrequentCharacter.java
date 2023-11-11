package dsa.arrays.mostFrequentChar;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Returns the most frequent character in a string. In case of ties, returns the character that appears earlier in  string.
 */
public class FrequentCharacter {

    /**
     * Approach: Use linked HashMap to keep the order for elements intact in which they were inserted. [linkedList + Hashtable]
     * @Time_complexity O(n): as 2 for-loops, iterating over input size, and again over each key of LinkedHashMap
     * @Space_complexity O(n): since LinkedHashMap takes: O(n) [internally O(3n): LinkedList; Hashtable; Key, value set] space in memory
     */
    public static char mostFrequentChar(String input) {
        if (input.length() == 1) return input.charAt(0);
        Map<Character, Integer> charFrequency = getCountOfChars(input);
        int maxValue = 1;
        char frequentChar = input.charAt(0);
        for (char character : charFrequency.keySet()) {
            int i = charFrequency.get(character);
            if (i > maxValue) {
                maxValue = i;
                frequentChar = character;
            }
        }

        return frequentChar;
    }

    /**
     * Approach: similar to mostFrequentChar method. Only 3 differences:
     * 1. Using .getOrDefault() method of Map instead of checking for existence of key and then incrementing/ assigning
     * 2. Instead of using LinkedHashMap, using HashMap. Order of char insertion matters to break the tie of elements with same frequency
     * 3. So challenge in 2nd point tackled via iterating over original string again. This keeps time complexity same,
     * but space complexity is reduced since LinkedHashMap takes more space than HashMap due to extra linked list space to maintain order
     * @Time_complexity O(n) [O(2n) due to 2 iterations]
     * @Space_complexity O(n) : due to HashMap. Internally, less than LinkedHashMap as mentioned in 2nd difference
     */
    public static char mostFrequentCharSimplified(String input) {
        if (input.length() == 1) return input.charAt(0);
        Map<Character, Integer> charFrequency = new HashMap<>();
        char character = '\0';
        int maxCount = 1;
        for (char s : input.toCharArray()) {
            charFrequency.put(s, charFrequency.getOrDefault(s, 0) + 1);
        }
        for (char s : input.toCharArray()) {
            if (charFrequency.get(s) > maxCount) {
                character = s;
                maxCount = charFrequency.get(character);
            }
        }
        return character;
    }

    /**
     * Approach: Assumption that all input chars are lower case alphabets, create a arr[] of size 26 and assign frequencies as per ASCII value order.
     * @Time_complexity O(n) [O(2n) due to 2 iterations]
     * @Space_complexity O(1) since auxiliary space does not increase with increase in input size.
     */
    public static char mostFrequentCharInConstantSpace(String input) {
        char[] frequencies = new char[26];
        for (char ch : input.toCharArray()) {
            frequencies[ch - 'a']++;
        }
        char mostFrequentChar = '\0';
        int max = 1;
        for (char ch : input.toCharArray()) {
            if (frequencies[ch - 'a'] > max) {
                max = frequencies[ch - 'a'];
                mostFrequentChar = ch;
            }
        }
        return mostFrequentChar;
    }

    private static Map<Character, Integer> getCountOfChars(String input) {
        Map<Character, Integer> charFrequency = new LinkedHashMap<>();
        for (char ch : input.toCharArray()) {
            if (charFrequency.containsKey(ch)) charFrequency.put(ch, charFrequency.get(ch) + 1);
            else charFrequency.put(ch, 1);
        }
        return charFrequency;
    }
}
