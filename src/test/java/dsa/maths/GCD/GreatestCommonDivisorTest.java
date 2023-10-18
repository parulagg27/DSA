package dsa.maths.GCD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GreatestCommonDivisorTest {

    @Test
    void getGCDOf0and0(){
        int output = GreatestCommonDivisor.findGCDByDivisionTillRemainderZero(0, 0);

        Assertions.assertEquals(0, output);
    }

    @Test
    void shouldReturnGCDas0IfAnyNumberIsZero() {
        int output = GreatestCommonDivisor.findGCDByDivisionTillRemainderZero(100, 0);

        Assertions.assertEquals(0, output);
    }

    @Test
    void shouldReturnGcdForEvenNumbers() {
        int output = GreatestCommonDivisor.findGCDByDivisionTillRemainderZero(12, 20);

        Assertions.assertEquals(4, output);
    }

    @Test
    void shouldReturnGcdForOddNumbers() {
        int output = GreatestCommonDivisor.findGCDByDivisionTillRemainderZero(3, 17);

        Assertions.assertEquals(1, output);
    }

    @Test
    void shouldReturnGcdForPositiveAndNegativeInt() {
        int output = GreatestCommonDivisor.findGCDByDivisionTillRemainderZero(12, -12);

        Assertions.assertEquals(-12, output);
    }

    @Test
    void shouldReturnGcdForIntMaxAndIntMin() {
        int output = GreatestCommonDivisor.findGCDByDivisionTillRemainderZero(Integer.MAX_VALUE, Integer.MIN_VALUE);

        Assertions.assertEquals(-1, output);
    }
}