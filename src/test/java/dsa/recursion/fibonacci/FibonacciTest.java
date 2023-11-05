package dsa.recursion.fibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class FibonacciTest {

    @Nested
    class FibonacciByRecursion {

        @Test
        void getZerothFibonacciNumber() {
            var output = Fibonacci.fibonacciWithRecursion(0);

            Assertions.assertEquals(0, output);
        }

        @Test
        void getFirstFibonacciNumber() {
            var output = Fibonacci.fibonacciWithRecursion(1);

            Assertions.assertEquals(1, output);
        }

        @Test
        void getFifthFibonacciNumber() {
            var output = Fibonacci.fibonacciWithRecursion(5);

            Assertions.assertEquals(5, output);
        }

        @Test
        void get46thFibonacciNumber() {
            var output = Fibonacci.fibonacciWithRecursion(46);

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
        void get46thFibonacciNumber() {
            //TODO: Max. fibonacci number that can be computed by this approach
            var output = Fibonacci.fibonacciByLoop(46);

            Assertions.assertEquals(1836311903, output);
        }
    }

    @Nested
    class FibonacciWithMemoizationAndMemoryOptimisation {
        @Test
        void getZerothFibonacciNumber() {
            var output = Fibonacci.fibonacciWithMemoizationAndMemoryOptimisation(0);

            Assertions.assertEquals(0, output);
        }

        @Test
        void getFirstFibonacciNumber() {
            var output = Fibonacci.fibonacciWithMemoizationAndMemoryOptimisation(1);

            Assertions.assertEquals(1, output);
        }

        @Test
        void getFifthFibonacciNumber() {
            var output = Fibonacci.fibonacciWithMemoizationAndMemoryOptimisation(5);

            Assertions.assertEquals(5, output);
        }

        @Test
        void get46thFibonacciNumber() {
            //TODO: Max. fibonacci number that can be computed by this approach
            var output = Fibonacci.fibonacciWithMemoizationAndMemoryOptimisation(46);

            Assertions.assertEquals(1836311903, output);
        }
    }

    @Nested
    class FibonacciByRecursiveMemoization {

        @Test
        void getZerothFibonacciNumber() {
            var output = Fibonacci.fibonacciByRecursiveMemoization(0);

            Assertions.assertEquals(0, output);
        }

        @Test
        void getFirstFibonacciNumber() {
            var output = Fibonacci.fibonacciByRecursiveMemoization(1);

            Assertions.assertEquals(1, output);
        }

        @Test
        void getFifthFibonacciNumber() {
            var output = Fibonacci.fibonacciByRecursiveMemoization(5);

            Assertions.assertEquals(5, output);
        }

        @Test
        void get46thFibonacciNumber() {
            //TODO: Max. fibonacci number that can be computed by this approach
            var output = Fibonacci.fibonacciByRecursiveMemoization(46);

            Assertions.assertEquals(1836311903, output);
        }
    }
}