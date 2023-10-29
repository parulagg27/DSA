package dsa.recursion.stringPalindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class PalindromicStringTest {

    @Nested
    class PalindromeByReversingString {

        @Test
        void shouldDetermineRaceCarAsPalindromeIgnoringCase() {
            boolean output = PalindromicString.determinePalindromeByReversingString("RAceCar");

            Assertions.assertTrue(output);
        }

        @Test
        void shouldDetermineAbbbaAsPalindromeIgnoringCase() {
            boolean output = PalindromicString.determinePalindromeByReversingString("abbba");

            Assertions.assertTrue(output);
        }

        @Test
        void shouldNotDetermineAbcdAsPalindrome() {
            boolean output = PalindromicString.determinePalindromeByReversingString("abcd");

            Assertions.assertFalse(output);
        }

        @Test
        void shouldDetermineEmptyStringAsPalindrome() {
            boolean output = PalindromicString.determinePalindromeByReversingString("");

            Assertions.assertTrue(output);
        }

        @Test
        void shouldDetermineStringWithOneCharAsPalindrome() {
            boolean output = PalindromicString.determinePalindromeByReversingString("a");

            Assertions.assertTrue(output);
        }

        @Test
        void shouldDetermineStringAsPalindromeIrrespectiveOfSpecialCharsOrWhitespaces() {
            boolean output = PalindromicString.determinePalindromeByReversingString("a#b# #b#a");

            Assertions.assertTrue(output);
        }
    }

    @Nested
    class PalindromeByHalfTraversal {

        @Test
        void shouldDetermineRaceCarAsPalindromeIgnoringCase() {
            boolean output = PalindromicString.determinePalindromeByHalfTraversal("RAceCar");

            Assertions.assertTrue(output);
        }

        @Test
        void shouldDetermineAbbbaAsPalindromeIgnoringCase() {
            boolean output = PalindromicString.determinePalindromeByHalfTraversal("abbba");

            Assertions.assertTrue(output);
        }

        @Test
        void shouldNotDetermineAbcdAsPalindrome() {
            boolean output = PalindromicString.determinePalindromeByHalfTraversal("abcd");

            Assertions.assertFalse(output);
        }

        @Test
        void shouldDetermineEmptyStringAsPalindrome() {
            boolean output = PalindromicString.determinePalindromeByHalfTraversal("");

            Assertions.assertTrue(output);
        }

        @Test
        void shouldDetermineStringWithOneCharAsPalindrome() {
            boolean output = PalindromicString.determinePalindromeByHalfTraversal("a");

            Assertions.assertTrue(output);
        }

        @Test
        void shouldDetermineStringAsPalindromeIrrespectiveOfSpecialCharsOrWhitespaces() {
            boolean output = PalindromicString.determinePalindromeByHalfTraversal("a#b# #b#a");

            Assertions.assertTrue(output);
        }
    }

    @Nested
    class PalindromeByCharArrayAndHalfTraversal {

        @Test
        void shouldDetermineRaceCarAsPalindromeIgnoringCase() {
            boolean output = PalindromicString.determinePalindromeByCharArrayAndHalfTraversal("RAceCar");

            Assertions.assertTrue(output);
        }

        @Test
        void shouldDetermineAbbbaAsPalindromeIgnoringCase() {
            boolean output = PalindromicString.determinePalindromeByCharArrayAndHalfTraversal("abbba");

            Assertions.assertTrue(output);
        }

        @Test
        void shouldNotDetermineAbcdAsPalindrome() {
            boolean output = PalindromicString.determinePalindromeByCharArrayAndHalfTraversal("abcd");

            Assertions.assertFalse(output);
        }

        @Test
        void shouldDetermineEmptyStringAsPalindrome() {
            boolean output = PalindromicString.determinePalindromeByCharArrayAndHalfTraversal("");

            Assertions.assertTrue(output);
        }

        @Test
        void shouldDetermineStringWithOneCharAsPalindrome() {
            boolean output = PalindromicString.determinePalindromeByCharArrayAndHalfTraversal("a");

            Assertions.assertTrue(output);
        }

        @Test
        void shouldDetermineStringAsPalindromeIrrespectiveOfSpecialCharsOrWhitespaces() {
            boolean output = PalindromicString.determinePalindromeByCharArrayAndHalfTraversal("a#b# #b#a");

            Assertions.assertTrue(output);
        }
    }

    @Nested
    class PalindromeByRecursion {

        @Test
        void shouldDetermineRaceCarAsPalindromeIgnoringCase() {
            boolean output = PalindromicString.determinePalindromeByRecursion("RAceCar");

            Assertions.assertTrue(output);
        }

        @Test
        void shouldDetermineAbbbaAsPalindromeIgnoringCase() {
            boolean output = PalindromicString.determinePalindromeByRecursion("abbba");

            Assertions.assertTrue(output);
        }

        @Test
        void shouldNotDetermineAbcdAsPalindrome() {
            boolean output = PalindromicString.determinePalindromeByRecursion("abcd");

            Assertions.assertFalse(output);
        }

        @Test
        void shouldDetermineEmptyStringAsPalindrome() {
            boolean output = PalindromicString.determinePalindromeByRecursion("");

            Assertions.assertTrue(output);
        }

        @Test
        void shouldDetermineStringWithOneCharAsPalindrome() {
            boolean output = PalindromicString.determinePalindromeByRecursion("a");

            Assertions.assertTrue(output);
        }

        @Test
        void shouldDetermineStringAsPalindromeIrrespectiveOfSpecialCharsOrWhitespaces() {
            boolean output = PalindromicString.determinePalindromeByRecursion("a#b# #b#a");

            Assertions.assertTrue(output);
        }
    }
}