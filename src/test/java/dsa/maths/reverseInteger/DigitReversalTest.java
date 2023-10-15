package dsa.maths.reverseInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class DigitReversalTest {

    @Nested
    class reverseNumberByModulus10AndStringConcat {

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

            Assertions.assertEquals(0, output);
        }

        @Test
        void shouldNotReverseMinInt() {
            int output = DigitReversal.reverseNumberByModulus10AndStringConcat(Integer.MIN_VALUE); // -2147483648

            Assertions.assertEquals(0, output);
        }
    }

    @Nested
    class reverseNumberByModulus10AndNumberFormation {

        @Test
        void shouldReverseGivenPositiveInteger() {
            int output = DigitReversal.reverseNumberByModulus10AndNumberFormation(12345);

            Assertions.assertEquals(54321, output);
        }

        @Test
        void shouldReturn0IfGivenIntegerIsZero() {
            int output = DigitReversal.reverseNumberByModulus10AndNumberFormation(0);

            Assertions.assertEquals(0, output);
        }

        @Test
        void shouldReverseGivenNegativeInteger() {
            int output = DigitReversal.reverseNumberByModulus10AndNumberFormation(-12345);

            Assertions.assertEquals(-54321, output);
        }

        @Test
        void shouldNotReverseMaxIntToPreventIntOverflow() {
            int output = DigitReversal.reverseNumberByModulus10AndNumberFormation(Integer.MAX_VALUE);

            Assertions.assertEquals(0, output);
        }

        @Test
        void shouldNotReverseMinInt() {
            int output = DigitReversal.reverseNumberByModulus10AndNumberFormation(Integer.MIN_VALUE); // -2147483648

            Assertions.assertEquals(0, output);
        }

        @Test
        void shouldNotReverseIntWithReversedPositiveNumberOutsideIntRange() {
            int output = DigitReversal.reverseNumberByModulus10AndNumberFormation(1534236469);

            Assertions.assertEquals(0, output);
        }

        @Test
        void shouldNotReverseIntWithReversedNegativeNumberOutsideIntRange() {
            int output = DigitReversal.reverseNumberByModulus10AndNumberFormation(-2146384742);

            Assertions.assertEquals(0, output);
        }
    }
}