package dsa.recursion.stringPalindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class PalindromeWithSpecialCharsTest {

    @Nested
    class PalindromeByReplacingSpecialChars {

        @Test
        void shouldDetermineGivenStringWithSpecialCharsAsPalindrome() {
            String input = "A man, a plan, a canal: Panama";

            var output = PalindromeWithSpecialChars.determinePalindromeByReplacingSpecialChars(input);

            Assertions.assertTrue(output);
        }

        @Test
        void shouldDetermineRaceACarAsNonPalindrome() {
            String input = "race a car";

            var output = PalindromeWithSpecialChars.determinePalindromeByReplacingSpecialChars(input);

            Assertions.assertFalse(output);
        }

        @Test
        void shouldDetermineEmptyStringWithWhitespacesAsPalindrome() {
            var output = PalindromeWithSpecialChars.determinePalindromeByReplacingSpecialChars("   ");

            Assertions.assertTrue(output);
        }
    }

    @Nested
    class PalindromeByRegexMatchAndTwoPointerTraversal {

        @Test
        void shouldDetermineGivenStringWithSpecialCharsAsPalindrome() {
            String input = "A man, a plan, a canal: Panama";

            var output = PalindromeWithSpecialChars.isPalindromeByRegexMatchAndTwoPointerTraversal(input);

            Assertions.assertTrue(output);
        }

        @Test
        void shouldDetermineRaceACarAsNonPalindrome() {
            String input = "race a car";

            var output = PalindromeWithSpecialChars.isPalindromeByRegexMatchAndTwoPointerTraversal(input);

            Assertions.assertFalse(output);
        }

        @Test
        void shouldDetermineEmptyStringWithWhitespacesAsPalindrome() {
            var output = PalindromeWithSpecialChars.isPalindromeByRegexMatchAndTwoPointerTraversal("   ");

            Assertions.assertTrue(output);
        }
    }

    @Nested
    class sPalindromeByHalfTraversalAndNoRegex {

        @Test
        void shouldDetermineGivenStringWithSpecialCharsAsPalindrome() {
            String input = "A man, a plan, a canal: Panama";

            var output = PalindromeWithSpecialChars.isPalindromeByHalfTraversalAndNoRegex(input);

            Assertions.assertTrue(output);
        }

        @Test
        void shouldDetermineRaceACarAsNonPalindrome() {
            String input = "race a car";

            var output = PalindromeWithSpecialChars.isPalindromeByHalfTraversalAndNoRegex(input);

            Assertions.assertFalse(output);
        }

        @Test
        void shouldDetermineEmptyStringWithWhitespacesAsPalindrome() {
            var output = PalindromeWithSpecialChars.isPalindromeByHalfTraversalAndNoRegex("   ");

            Assertions.assertTrue(output);
        }
    }
}