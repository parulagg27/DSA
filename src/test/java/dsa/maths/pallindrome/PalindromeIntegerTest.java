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
}