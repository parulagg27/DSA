package dsa.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class Numbers1ToNTest {

    @Nested
    class get1ToN {

        @Test
        void shouldArrayOfNumbers1To5() {
            int[] expected = {1, 2, 3, 4, 5};

            int[] output = Numbers1ToN.get1ToN(5);

            Assertions.assertArrayEquals(expected, output);
        }

        @Test
        void shouldReturnArrayOfNumber1() {
            int[] expected = {1};

            int[] output = Numbers1ToN.get1ToN(1);

            Assertions.assertArrayEquals(expected, output);
        }

        @Test
        void shouldReturnEmptyArrayIfNumberIs0() {
            int[] expected = new int[0];

            int[] output = Numbers1ToN.get1ToN(0);

            Assertions.assertArrayEquals(expected, output);
        }
    }

    @Nested
    class getNto1 {

        @Test
        void shouldArrayOfNumbers1To5() {
            int[] expected = {5, 4, 3, 2, 1};

            int[] output = Numbers1ToN.getNto1(5);

            Assertions.assertArrayEquals(expected, output);
        }

        @Test
        void shouldReturnArrayOfNumber1() {
            int[] expected = {1};

            int[] output = Numbers1ToN.getNto1(1);

            Assertions.assertArrayEquals(expected, output);
        }

        @Test
        void shouldReturnEmptyArrayIfNumberIs0() {
            int[] expected = new int[0];

            int[] output = Numbers1ToN.getNto1(0);

            Assertions.assertArrayEquals(expected, output);
        }
    }
}