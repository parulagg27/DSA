package dsa.maths.divisors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class DivisorsOfNumberTest {

    @Nested
    class getDivisorsByBruteForce {

        @Test
        void shouldReturnDivisorsForNumber12() {
            int[] output = DivisorsOfNumber.getDivisorsByBruteForce(12);

            Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 6, 12}, output);
        }

        @Test
        void shouldReturnDivisorsForNumber10() {
            int[] output = DivisorsOfNumber.getDivisorsByBruteForce(10);

            //TODO: limitation of using int[] fixed size array. Unassigned element will be by default zero.
            Assertions.assertArrayEquals(new int[]{1, 2, 5, 10, 0}, output);
        }
    }

    @Nested
    class getDivisorsUsingArrayList {

        @Test
        void shouldReturnDivisorsForNumber12() {
            var expected = new ArrayList<>(List.of(1, 2, 3, 4, 6, 12));

            var output = DivisorsOfNumber.getDivisorsUsingArrayList(12);

            Assertions.assertEquals(expected, output);
        }

        @Test
        void shouldReturnDivisorsForNumber10() {
            var expected = new ArrayList<>(List.of(1, 2, 5, 10));

            List<Integer> output = DivisorsOfNumber.getDivisorsUsingArrayList(10);

            Assertions.assertEquals(expected, output);
        }
    }

    @Nested
    class getDivisorsBySquareRoot {

        @Test
        void shouldReturnDivisorsForNumber12() {
            var expected = new ArrayList<>(List.of(1, 12, 2, 6, 3, 4));

            var output = DivisorsOfNumber.getDivisorsBySquareRoot(12);

            Assertions.assertEquals(expected, output);
        }

        @Test
        void shouldReturnDivisorsForNumber10() {
            var expected = new ArrayList<>(List.of(1,10, 2, 5));

            List<Integer> output = DivisorsOfNumber.getDivisorsBySquareRoot(10);

            Assertions.assertEquals(expected, output);
        }

        @Test
        void shouldReturnDivisorsForNumber36() {
            var expected = new ArrayList<>(List.of(1, 36, 2, 18, 3, 12, 4, 9, 6));

            List<Integer> output = DivisorsOfNumber.getDivisorsBySquareRoot(36);

            Assertions.assertEquals(expected, output);
        }

        @Test
        void shouldReturnDivisorsForNegativeNumber() {
            var expected = new ArrayList<>(List.of(1, 227));

            List<Integer> output = DivisorsOfNumber.getDivisorsBySquareRoot(-227);

            Assertions.assertEquals(expected, output);
        }

        @Test
        void shouldNotGetDivisorsForMinInt() {
            var output = DivisorsOfNumber.getDivisorsBySquareRoot(Integer.MIN_VALUE);

            Assertions.assertEquals(List.of(0), output);
        }
    }
}