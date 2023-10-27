package dsa.recursion;

import dsa.recursion.factorials.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class FactorialTest {

    @Nested
    class factorialByRecursion {

        @Test
        void shouldReturnFactorialOf1() {
            var output = Factorial.factorialByRecursion(1);

            Assertions.assertEquals(1, output);
        }

        @Test
        void shouldReturnFactorialOf0() {
            var output = Factorial.factorialByRecursion(0);

            Assertions.assertEquals(0, output);
        }

        @Test
        void shouldHandleFactorialForNegativeInt() {
            var output = Factorial.factorialByRecursion(-3);

            Assertions.assertEquals(0, output);
        }

        @Test
        void shouldGetFactorialFor2() {
            var output = Factorial.factorialByRecursion(2);

            Assertions.assertEquals(2, output);
        }

        @Test
        void shouldGetFactorialFor5() {
            var output = Factorial.factorialByRecursion(5);

            Assertions.assertEquals(120, output);
        }

        @Test
        void shouldGetFactorialForIntWithFactorialNearToLargeInt() {
            //TODO: Limitation of using int: only factorial for 12 or less can be computed with factorial in int limit.
            var output = Factorial.factorialByRecursion(12);

            Assertions.assertEquals(479001600, output);
        }
    }

    @Nested
    class factorialByLoop {

        @Test
        void shouldReturnFactorialOf1() {
            var output = Factorial.factorialByLoop(1);

            Assertions.assertEquals(1, output);
        }

        @Test
        void shouldReturnFactorialOf0() {
            var output = Factorial.factorialByLoop(0);

            Assertions.assertEquals(0, output);
        }

        @Test
        void shouldHandleFactorialForNegativeInt() {
            var output = Factorial.factorialByLoop(-3);

            Assertions.assertEquals(0, output);
        }

        @Test
        void shouldGetFactorialFor2() {
            var output = Factorial.factorialByLoop(2);

            Assertions.assertEquals(2, output);
        }

        @Test
        void shouldGetFactorialFor5() {
            var output = Factorial.factorialByLoop(5);

            Assertions.assertEquals(120, output);
        }

        @Test
        void shouldGetFactorialForIntWithFactorialNearToLargeInt() {
            //TODO: Limitation of using int: only factorial for 12 or less can be computed with factorial in int limit.
            var output = Factorial.factorialByLoop(12);

            Assertions.assertEquals(479001600, output);
        }
    }
}