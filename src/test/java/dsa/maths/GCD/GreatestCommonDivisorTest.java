package dsa.maths.GCD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class GreatestCommonDivisorTest {

    @Nested
    class findGCDByDivisionTillRemainderZero {
        @Test
        void getGCDOf0and0(){
            int output = GreatestCommonDivisor.findGCDByDivisionTillRemainderZero(0, 0);

            Assertions.assertEquals(0, output);
        }

        @Test
        void shouldReturnGCDasNumberItselfIfOtherNumberIsZero() {
            int output = GreatestCommonDivisor.findGCDByDivisionTillRemainderZero(100, 0);

            Assertions.assertEquals(100, output);
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
            //TODO:  GCD (greatest common divisor) is always a non-negative integer even if one or both int are negative
            int output = GreatestCommonDivisor.findGCDByDivisionTillRemainderZero(12, -12);

            Assertions.assertEquals(12, output);
        }

        @Test
        void shouldReturnGcdForIntMaxAndIntMin() {
            int output = GreatestCommonDivisor.findGCDByDivisionTillRemainderZero(Integer.MAX_VALUE, Integer.MIN_VALUE);

            Assertions.assertEquals(1, output);
        }
    }

    @Nested
    class findGCDByDivisionTillRemainderZeroV2 {
        @Test
        void getGCDOf0and0(){
            int output = GreatestCommonDivisor.findGCDByDivisionTillRemainderZeroV2(0, 0);

            Assertions.assertEquals(0, output);
        }

        @Test
        void shouldReturnGCDasNumberItselfIfOtherNumberIsZero() {
            int output = GreatestCommonDivisor.findGCDByDivisionTillRemainderZeroV2(100, 0);

            Assertions.assertEquals(100, output);
        }

        @Test
        void shouldReturnGcdForEvenNumbers() {
            int output = GreatestCommonDivisor.findGCDByDivisionTillRemainderZeroV2(12, 20);

            Assertions.assertEquals(4, output);
        }

        @Test
        void shouldReturnGcdForOddNumbers() {
            int output = GreatestCommonDivisor.findGCDByDivisionTillRemainderZeroV2(3, 17);

            Assertions.assertEquals(1, output);
        }

        @Test
        void shouldReturnGcdForPositiveAndNegativeInt() {
            //TODO:  GCD (greatest common divisor) is always a non-negative integer even if one or both int are negative
            int output = GreatestCommonDivisor.findGCDByDivisionTillRemainderZeroV2(12, -12);

            Assertions.assertEquals(12, output);
        }

        @Test
        void shouldReturnGcdForIntMaxAndIntMin() {
            int output = GreatestCommonDivisor.findGCDByDivisionTillRemainderZeroV2(Integer.MAX_VALUE, Integer.MIN_VALUE + 1);

            Assertions.assertEquals(Integer.MAX_VALUE, output);
        }
    }

    @Nested
    class findGCDByBruteForce {
        @Test
        void getGCDOf0and0(){
            int output = GreatestCommonDivisor.findGCDByBruteForce(0, 0);

            Assertions.assertEquals(0, output);
        }

        @Test
        void shouldReturnGCDasNumberItselfIfOtherNumberIsZero() {
            int output = GreatestCommonDivisor.findGCDByBruteForce(100, 0);

            Assertions.assertEquals(100, output);
        }

        @Test
        void shouldReturnGcdForEvenNumbers() {
            int output = GreatestCommonDivisor.findGCDByBruteForce(12, 20);

            Assertions.assertEquals(4, output);
        }

        @Test
        void shouldReturnGcdForOddNumbers() {
            int output = GreatestCommonDivisor.findGCDByBruteForce(3, 17);

            Assertions.assertEquals(1, output);
        }

        @Test
        void shouldReturnGcdForPositiveAndNegativeInt() {
            int output = GreatestCommonDivisor.findGCDByBruteForce(12, -12);

            Assertions.assertEquals(12, output);
        }

        @Test
        void shouldReturnGcdForIntMaxAndIntMin() {
            int output = GreatestCommonDivisor.findGCDByBruteForce(Integer.MAX_VALUE, Integer.MIN_VALUE);

            Assertions.assertEquals(1, output);
        }
    }

    @Nested
    class gcdByEuclideanFormula {

        @Test
        void getGCDOf0and0(){
            int output = GreatestCommonDivisor.gcdByEuclideanFormula(0, 0);

            Assertions.assertEquals(0, output);
        }

        @Test
        void shouldReturnGCDasNumberItselfIfOtherNumberIsZero() {
            int output = GreatestCommonDivisor.gcdByEuclideanFormula(100, 0);

            Assertions.assertEquals(100, output);
        }

        @Test
        void shouldReturnGcdForEvenNumbers() {
            int output = GreatestCommonDivisor.gcdByEuclideanFormula(12, 20);

            Assertions.assertEquals(4, output);
        }

        @Test
        void shouldReturnGcdForOddNumbers() {
            int output = GreatestCommonDivisor.gcdByEuclideanFormula(3, 17);

            Assertions.assertEquals(1, output);
        }

        @Test
        void shouldReturnGcdForPositiveAndNegativeInt() {
            int output = GreatestCommonDivisor.gcdByEuclideanFormula(12, -12);

            Assertions.assertEquals(12, output);
        }

        @Test
        void shouldReturnGcdForIntMaxAndIntMin() {
            //TODO: limitation of this approach: output is stackoverflow as Min value will always be less even if absolute value is more. Taking absolute of Int.MIN_VALUE will also not work since it will be integer out of range
            int output = GreatestCommonDivisor.gcdByEuclideanFormula(Integer.MAX_VALUE, Integer.MIN_VALUE + 1);

            Assertions.assertEquals(2147483647, output);
        }
    }
}