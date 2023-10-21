package dsa.maths.ArmstrongNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArmstrongTest {

    @Test
    void shouldDetermine153AsArmstrongNumber() {
        boolean output = Armstrong.determineArmstrongByDigitCount(153);

        Assertions.assertTrue(output);
    }

    @Test
    void shouldNotDetermine123AsArmstrongNumber() {
        boolean output = Armstrong.determineArmstrongByDigitCount(123);

        Assertions.assertFalse(output);
    }

    @Test
    void shouldCheckForGivenNegativeIntegerAsArmstrong() {
        boolean output = Armstrong.determineArmstrongByDigitCount(-153);

        Assertions.assertTrue(output);
    }

    @Test
    void shouldDetermine0AsArmstrongNumber() {
        boolean output = Armstrong.determineArmstrongByDigitCount(0);

        Assertions.assertTrue(output);
    }

    @Test
    void shouldCheckGivenLargeIntForArmstrongNumber() {
        boolean output = Armstrong.determineArmstrongByDigitCount(Integer.MAX_VALUE);

        Assertions.assertFalse(output);
    }
}