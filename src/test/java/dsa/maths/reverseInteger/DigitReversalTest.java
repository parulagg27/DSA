package dsa.maths.reverseInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DigitReversalTest {

    @Test
    void shouldReverseGivenPositiveInteger() {
        int output = DigitReversal.reverseNumberByModulus10AndStringConcat(12345);

        Assertions.assertEquals(54321, output);
    }

    @Test
    void shouldReturn0IfGivenIntegerIsZero() {
        int output = DigitReversal.reverseNumberByModulus10AndStringConcat(0);

        Assertions.assertEquals(0, output);
    }

    @Test
    void shouldReverseGivenNegativeInteger() {
        int output = DigitReversal.reverseNumberByModulus10AndStringConcat(-12345);

        Assertions.assertEquals(-54321, output);
    }

    @Test
    void shouldNotReverseMaxIntToPreventIntOverflow() {
        int output = DigitReversal.reverseNumberByModulus10AndStringConcat(Integer.MAX_VALUE);

        Assertions.assertEquals(Integer.MAX_VALUE, output);
    }

    @Test
    void shouldReverseMinInt() {
        int output = DigitReversal.reverseNumberByModulus10AndStringConcat(Integer.MIN_VALUE); // -2147483648

        Assertions.assertEquals(Integer.MIN_VALUE, output);
    }
}