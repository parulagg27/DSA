package dsa.maths.pallindrome;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeIntegerTest {
    
    @Nested
    class determinePalindromeByNumberReversal {

        @Test
        void shouldDetectPositiveIntegerPalindrome() {
            boolean output = PalindromeInteger.determinePalindromeByNumberReversal(121);

            assertTrue(output);
        }

        @Test
        void shouldDetectIntegerZeroAsPalindrome() {
            boolean output = PalindromeInteger.determinePalindromeByNumberReversal(0);

            assertTrue(output);
        }

        @Test
        void shouldNotDetermineNumbersDivisibleBy10AsPalindrome() {
            boolean output = PalindromeInteger.determinePalindromeByNumberReversal(1000);

            assertFalse(output);
        }

        @Test
        void shouldNotDetermineAnyNegativeIntegerAsPalindrome() {
           //L-R, reads -121. R-L: becomes 121-. So not a palindrome.
            boolean output = PalindromeInteger.determinePalindromeByNumberReversal(-121);

            assertFalse(output);
        }

        @Test
        void shouldDeterminePalindromeForHigherPositiveInteger() {
            boolean output = PalindromeInteger.determinePalindromeByNumberReversal(2147447412);

            assertTrue(output);
        }
    }

    @Nested
    class determinePalindromeByStringTraversal {

        @Test
        void shouldDetectPositiveIntegerPalindrome() {
            boolean output = PalindromeInteger.determinePalindromeByStringTraversal(121);

            assertTrue(output);
        }

        @Test
        void shouldDetectIntegerZeroAsPalindrome() {
            boolean output = PalindromeInteger.determinePalindromeByStringTraversal(0);

            assertTrue(output);
        }

        @Test
        void shouldNotDetermineNumbersDivisibleBy10AsPalindrome() {
            boolean output = PalindromeInteger.determinePalindromeByStringTraversal(1000);

            assertFalse(output);
        }

        @Test
        void shouldNotDetermineAnyNegativeIntegerAsPalindrome() {
            //L-R, reads -121. R-L: becomes 121-. So not a palindrome.
            boolean output = PalindromeInteger.determinePalindromeByStringTraversal(-121);

            assertFalse(output);
        }

        @Test
        void shouldDeterminePalindromeForHigherPositiveInteger() {
            boolean output = PalindromeInteger.determinePalindromeByStringTraversal(2147447412);

            assertTrue(output);
        }
    }

    @Nested
    class palindromeCheckByStringTraversalAndMemoryOptimisation {

        @Test
        void shouldDetectPositiveIntegerPalindrome() {
            boolean output = PalindromeInteger.palindromeCheckByStringTraversalAndMemoryOptimisation(121);

            assertTrue(output);
        }

        @Test
        void shouldDetectIntegerZeroAsPalindrome() {
            boolean output = PalindromeInteger.palindromeCheckByStringTraversalAndMemoryOptimisation(0);

            assertTrue(output);
        }

        @Test
        void shouldNotDetermineNumbersDivisibleBy10AsPalindrome() {
            boolean output = PalindromeInteger.palindromeCheckByStringTraversalAndMemoryOptimisation(1000);

            assertFalse(output);
        }

        @Test
        void shouldNotDetermineAnyNegativeIntegerAsPalindrome() {
            //L-R, reads -121. R-L: becomes 121-. So not a palindrome.
            boolean output = PalindromeInteger.palindromeCheckByStringTraversalAndMemoryOptimisation(-121);

            assertFalse(output);
        }

        @Test
        void shouldDeterminePalindromeForHigherPositiveInteger() {
            boolean output = PalindromeInteger.palindromeCheckByStringTraversalAndMemoryOptimisation(2147447412);

            assertTrue(output);
        }
    }

    @Nested
    class palindromeCheckByHalfDigitTraversal {

        @Test
        void shouldDetectPositiveIntegerPalindrome() {
            boolean output = PalindromeInteger.palindromeCheckByHalfDigitTraversal(121);

            assertTrue(output);
        }

        @Test
        void shouldDetectIntegerZeroAsPalindrome() {
            boolean output = PalindromeInteger.palindromeCheckByHalfDigitTraversal(0);

            assertTrue(output);
        }

        @Test
        void shouldNotDetermineNumbersDivisibleBy10AsPalindrome() {
            boolean output = PalindromeInteger.palindromeCheckByHalfDigitTraversal(1000);

            assertFalse(output);
        }

        @Test
        void shouldNotDetermineAnyNegativeIntegerAsPalindrome() {
            //L-R, reads -121. R-L: becomes 121-. So not a palindrome.
            boolean output = PalindromeInteger.palindromeCheckByHalfDigitTraversal(-121);

            assertFalse(output);
        }

        @Test
        void shouldDeterminePalindromeForHigherPositiveInteger() {
            boolean output = PalindromeInteger.palindromeCheckByHalfDigitTraversal(2147447412);

            assertTrue(output);
        }
    }
}