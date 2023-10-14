package dsa.maths.digitsInInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitCounterTest {
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