package dsa.arrays.anagrams;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Two strings are anagrams if they contain same characters with same number of occurrence, only the order of characters is different
 */
public class Anagrams {

    /**
     * Time complexity: O(n + m). n = length of s1, m = length of s2
     * Space complexity: O(n + m), since creating 2 hashmaps for given strings
     */
    public static boolean isAnagramVia2HashMaps(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() != s2.length()) return false;
        HashMap<Character, Integer> uniqueCharsFromS1 = getCharactersWithFrequency(s1);
        HashMap<Character, Integer> uniqueCharsFromS2 = getCharactersWithFrequency(s2);

        return  (uniqueCharsFromS1.equals(uniqueCharsFromS2));
    }

    /**
     * Time complexity: O(n + m). n = length of s1, m = length of s2
     * Space complexity: O(n), since only creating one hashmap for given two strings
     */
    public static boolean isAnagramVia1HashMap(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.length() != s2.length()) return false;
        HashMap<Character, Integer> uniqueChars = new HashMap<>();
        for (char letter: s1.toCharArray()) {
            if (uniqueChars.get(letter) == null) {
                uniqueChars.put(letter, 1);
            }
            else uniqueChars.put(letter, uniqueChars.get(letter) + 1);
        }

        for (char letter: s2.toCharArray()) {
            if (uniqueChars.get(letter) == null) return false;
            else uniqueChars.put(letter, uniqueChars.get(letter) - 1);
        }
        for(int count: uniqueChars.values()){
            if (count != 0) return false;
        }
        return true;
    }

    /**
     * Time complexity: O(n*logn). logn due to sorting + n due to iteration of entire string.
     * Space complexity: O(n + n), since 2 new charArrays are created. If input type: charArray, then space complexity: O(1)
     */
    public static boolean isAnagramViaSorting(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] s1CharArray = s1.toCharArray();
        char[] s2CharArray = s2.toCharArray();

        Arrays.sort(s1CharArray);
        Arrays.sort(s2CharArray);

        for (int i = 0; i < s1.length(); i++){
            if (s1CharArray[i] != s2CharArray[i]) return false;
        }
        return true;
    }

    private static HashMap<Character, Integer> getCharactersWithFrequency(String s1) {
        HashMap<Character, Integer> uniqueChars = new HashMap<>();
        for (char letter: s1.toCharArray()) {
            if (uniqueChars.containsKey(letter)) {
                uniqueChars.put(letter, uniqueChars.get(letter) + 1);
            }
            else uniqueChars.put(letter, 1);
        }
        return uniqueChars;
    }
}
