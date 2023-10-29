package dsa.recursion.fibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class FibonacciTest {

    @Nested
    class FibonacciByRecursion {

        @Test
        void getZerothFibonacciNumber() {
            var output = Fibonacci.fib(0);

            Assertions.assertEquals(0, output);
        }

        @Test
        void getFirstFibonacciNumber() {
            var output = Fibonacci.fib(1);

            Assertions.assertEquals(1, output);
        }

        @Test
        void getFifthFibonacciNumber() {
            var output = Fibonacci.fib(5);

            Assertions.assertEquals(5, output);
        }

        @Test
        void get100thFibonacciNumber() {
            var output = Fibonacci.fib(46);

            Assertions.assertEquals(1836311903, output);
        }
    }

    @Nested
    class FibonacciByLoop {

        @Test
        void getZerothFibonacciNumber() {
            var output = Fibonacci.fibonacciByLoop(0);

            Assertions.assertEquals(0, output);
        }

        @Test
        void getFirstFibonacciNumber() {
            var output = Fibonacci.fibonacciByLoop(1);

            Assertions.assertEquals(1, output);
        }

        @Test
        void getFifthFibonacciNumber() {
            var output = Fibonacci.fibonacciByLoop(5);

            Assertions.assertEquals(5, output);
        }

        @Test
        void get100thFibonacciNumber() {
            //TODO: Max. fibonacci number that can be computed by this approach
            var output = Fibonacci.fibonacciByLoop(46);

            Assertions.assertEquals(1836311903, output);
        }
    }

}