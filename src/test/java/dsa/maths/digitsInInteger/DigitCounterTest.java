package dsa.maths.digitsInInteger;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitCounterTest {

    @Nested
    class countingDigitsByDivisor10 {
        @Test
        void shouldReturnCountOfDigitsGivenPositiveInteger() {
            int output = DigitCounter.countDigitsByBase10(2356);

            assertEquals(4, output);
        }

        @Test
        void shouldReturnCountOfDigitsGivenNegativeInteger() {
            int output = DigitCounter.countDigitsByBase10(-23388888);

            assertEquals(8, output);
        }

        @Test
        void shouldReturnDigitsCountForIntMaxValue() {
            int maxInteger = Integer.MAX_VALUE;

            int output = DigitCounter.countDigitsByBase10(maxInteger);

            assertEquals(10, output);
        }

        @Test
        void shouldReturnDigitsCountForIntMinValue() {
            int minInteger = Integer.MIN_VALUE;

            int output = DigitCounter.countDigitsByBase10(minInteger);

            assertEquals(10, output);
        }

        @Test
        void shouldReturnCountOfDigitForIntegerZero() {
            int output = DigitCounter.countDigitsByBase10(0);

            assertEquals(1, output);
        }
    }

    @Nested
    class countDigitsByLog10 {
        @Test
        void shouldReturnCountOfDigitsGivenPositiveInteger() {
            int output = DigitCounter.countDigitsByLog(2356);

            assertEquals(4, output);
        }

        @Test
        void shouldReturnCountOfDigitsGivenNegativeInteger() {
            int output = DigitCounter.countDigitsByLog(-23388888);

            assertEquals(8, output);
        }

        @Test
        void shouldReturnDigitsCountForIntMaxValue() {
            int maxInteger = Integer.MAX_VALUE;

            int output = DigitCounter.countDigitsByLog(maxInteger);

            assertEquals(10, output);
        }

        @Test
        void shouldReturnDigitsCountForIntMinValueMinus1() {
            //TODO: Math.abs will not convert min_value to absolute value as its positive value cant be represented [Integer overflow]
            int minInteger = -2147483647;

            int output = DigitCounter.countDigitsByLog(minInteger);

            assertEquals(10, output);
        }

        @Test
        void shouldReturnCountOfDigitForIntegerZero() {
            int output = DigitCounter.countDigitsByLog(0);

            assertEquals(1, output);
        }
    }

    @Nested
    class countDigitsByStringConversion {

        @Test
        void shouldReturnCountOfDigitsGivenPositiveInteger() {
            int output = DigitCounter.countDigitsByStringConversion(2356);

            assertEquals(4, output);
        }

        @Test
        void shouldReturnCountOfDigitsGivenNegativeInteger() {
            int output = DigitCounter.countDigitsByStringConversion(-23388888);

            assertEquals(8, output);
        }

        @Test
        void shouldReturnDigitsCountForIntMaxValue() {
            int maxInteger = Integer.MAX_VALUE;

            int output = DigitCounter.countDigitsByStringConversion(maxInteger);

            assertEquals(10, output);
        }

        @Test
        void shouldReturnDigitsCountForIntMinValueMinus1() {
            int minInteger = -2147483647;

            int output = DigitCounter.countDigitsByStringConversion(minInteger);

            assertEquals(10, output);
        }

        @Test
        void shouldReturnCountOfDigitForIntegerZero() {
            int output = DigitCounter.countDigitsByStringConversion(0);

            assertEquals(1, output);
        }
    }
}