package dsa.maths.primeNumbers;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    @Nested
    class isPrime {

        @Test
        void shouldNotDetermine0AsPrime(){
            // 0 is neither prime nor composite. Not prime since it is not positive. Not composite since it has infinite number of factors that gives zero itself [not finite]
            var output = PrimeNumber.isPrime(0);

            assertFalse(output);
        }

        @Test
        void shouldNotDetermine1AsPrime(){
            // 1 is not prime not composite. Not prime since only 1 positive distinct divisor, i.e., 1 itself. Not composite since no.of distinct positive factors is not more than 2.
            var output = PrimeNumber.isPrime(1);

            assertFalse(output);
        }

        @Test
        void shouldDetermine2AsPrime() {
            var output = PrimeNumber.isPrime(2);

            assertTrue(output);
        }

        @Test
        void shouldNotDetermine51AsPrime() {
            var output = PrimeNumber.isPrime(51);

            assertFalse(output);
        }

        @Test
        void shouldCheckForLargeIntAsPrime() {
            var output = PrimeNumber.isPrime(100000001);

            assertFalse(output);
        }
    }

    @Nested
    class isPrimeByOnlyCheckingIfRemainderZero {

        @Test
        void shouldNotDetermine0AsPrime(){
            // 0 is neither prime nor composite. Not prime since it is not positive. Not composite since it has infinite number of factors that gives zero itself [not finite]
            var output = PrimeNumber.isPrimeByOnlyCheckingIfRemainderZero(0);

            assertFalse(output);
        }

        @Test
        void shouldNotDetermine1AsPrime(){
            // 1 is not prime not composite. Not prime since only 1 positive distinct divisor, i.e., 1 itself. Not composite since no.of distinct positive factors is not more than 2.
            var output = PrimeNumber.isPrimeByOnlyCheckingIfRemainderZero(1);

            assertFalse(output);
        }

        @Test
        void shouldDetermine2AsPrime() {
            var output = PrimeNumber.isPrimeByOnlyCheckingIfRemainderZero(2);

            assertTrue(output);
        }

        @Test
        void shouldNotDetermine51AsPrime() {
            var output = PrimeNumber.isPrimeByOnlyCheckingIfRemainderZero(51);

            assertFalse(output);
        }

        @Test
        void shouldCheckForLargeIntAsPrime() {
            var output = PrimeNumber.isPrimeByOnlyCheckingIfRemainderZero(100000001);

            assertFalse(output);
        }
    }

    @Nested
    class isPrimeByRuleOf6Algorithm {
        @Test
        void shouldNotDetermine0AsPrime(){
            var output = PrimeNumber.isPrimeByRuleOf6Algorithm(0);

            assertFalse(output);
        }

        @Test
        void shouldNotDetermine1AsPrime(){
            var output = PrimeNumber.isPrimeByRuleOf6Algorithm(1);

            assertFalse(output);
        }

        @Test
        void shouldDetermine2AsPrime() {
            var output = PrimeNumber.isPrimeByRuleOf6Algorithm(2);

            assertTrue(output);
        }

        @Test
        void shouldDetermine3AsPrime() {
            var output = PrimeNumber.isPrimeByRuleOf6Algorithm(3);

            assertTrue(output);
        }

        @Test
        void shouldDetermine5AsPrime() {
            var output = PrimeNumber.isPrimeByRuleOf6Algorithm(5);

            assertTrue(output);
        }

        @Test
        void shouldNotDetermine25AsPrime() {
            var output = PrimeNumber.isPrimeByRuleOf6Algorithm(25);

            assertFalse(output);
        }

        @Test
        void shouldNotDetermine49AsPrime() {
            var output = PrimeNumber.isPrimeByRuleOf6Algorithm(49);

            assertFalse(output);
        }

        @Test
        void shouldCheckForLargeIntAsPrime() {
            var output = PrimeNumber.isPrimeByRuleOf6Algorithm(100000001);

            assertFalse(output);
        }
    }
}