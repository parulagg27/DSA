package dsa.maths.ArmstrongNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ArmstrongTest {

    @Nested
    class determineArmstrongByModulus10 {

        @Test
        void shouldDetermine153AsArmstrongNumber() {
            boolean output = Armstrong.determineArmstrongByModulus10(153);

            Assertions.assertTrue(output);
        }

        @Test
        void shouldNotDetermine123AsArmstrongNumber() {
            boolean output = Armstrong.determineArmstrongByModulus10(123);

            Assertions.assertFalse(output);
        }

        @Test
        void shouldCheckForGivenNegativeIntegerAsArmstrong() {
            boolean output = Armstrong.determineArmstrongByModulus10(-153);

            Assertions.assertTrue(output);
        }

        @Test
        void shouldDetermine0AsArmstrongNumber() {
            boolean output = Armstrong.determineArmstrongByModulus10(0);

            Assertions.assertTrue(output);
        }

        @Test
        void shouldCheckGivenLargeIntForArmstrongNumber() {
            boolean output = Armstrong.determineArmstrongByModulus10(Integer.MAX_VALUE);

            Assertions.assertFalse(output);
        }
    }

    @Nested
    class determineArmstrongByLogarithm {

        @Test
        void shouldDetermine153AsArmstrongNumber() {
            boolean output = Armstrong.determineArmstrongByLogarithm(153);

            Assertions.assertTrue(output);
        }

        @Test
        void shouldNotDetermine123AsArmstrongNumber() {
            boolean output = Armstrong.determineArmstrongByLogarithm(123);

            Assertions.assertFalse(output);
        }

        @Test
        void shouldCheckForGivenNegativeIntegerAsArmstrong() {
            boolean output = Armstrong.determineArmstrongByLogarithm(-153);

            Assertions.assertTrue(output);
        }

        @Test
        void shouldDetermine0AsArmstrongNumber() {
            boolean output = Armstrong.determineArmstrongByLogarithm(0);

            Assertions.assertTrue(output);
        }

        @Test
        void shouldCheckGivenLargeIntForArmstrongNumber() {
            boolean output = Armstrong.determineArmstrongByLogarithm(Integer.MAX_VALUE);

            Assertions.assertFalse(output);
        }
    }

    @Nested
    class determineArmstrongByCharArray {

        @Test
        void shouldDetermine153AsArmstrongNumber() {
            boolean output = Armstrong.determineArmstrongByCharArray(153);

            Assertions.assertTrue(output);
        }

        @Test
        void shouldNotDetermine123AsArmstrongNumber() {
            boolean output = Armstrong.determineArmstrongByCharArray(123);

            Assertions.assertFalse(output);
        }

        @Test
        void shouldCheckForGivenNegativeIntegerAsArmstrong() {
            boolean output = Armstrong.determineArmstrongByCharArray(-153);

            Assertions.assertTrue(output);
        }

        @Test
        void shouldDetermine0AsArmstrongNumber() {
            boolean output = Armstrong.determineArmstrongByCharArray(0);

            Assertions.assertTrue(output);
        }

        @Test
        void shouldCheckGivenLargeIntForArmstrongNumber() {
            boolean output = Armstrong.determineArmstrongByCharArray(Integer.MAX_VALUE);

            Assertions.assertFalse(output);
        }
    }
}