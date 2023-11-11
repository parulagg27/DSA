package dsa.arrays.pairSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

class PairSumTest {

    @Nested
    class PairSumByNaiveApproach {

        @Test
        void shouldReturnFirstMatchingSetForPairSum8() {
            List<Integer> numbers = List.of(3, 2, 5, 4, 1);

            var output = PairSum.pairSum(numbers, 8);

            Assertions.assertEquals(List.of(0, 2), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum5() {
            List<Integer> numbers = List.of(4, 7, 9, 2, 5, 1);

            var output = PairSum.pairSum(numbers, 5);

            Assertions.assertEquals(List.of(0, 5), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum3() {
            List<Integer> numbers = List.of(4, 7, 9, 2, 5, 1);

            var output = PairSum.pairSum(numbers, 3);

            Assertions.assertEquals(List.of(3, 5), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum13() {
            List<Integer> numbers = List.of(1, 6, 7, 2);

            var output = PairSum.pairSum(numbers, 13);

            Assertions.assertEquals(List.of(1, 2), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum18() {
            List<Integer> numbers = List.of(9, 9);

            var output = PairSum.pairSum(numbers, 18);

            Assertions.assertEquals(List.of(0, 1), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum12() {
            List<Integer> numbers = List.of(6, 4, 2, 8);

            var output = PairSum.pairSum(numbers, 12);

            Assertions.assertEquals(List.of(1, 3), output);
        }
    }

    @Nested
    class PairSumViaSingleLoop {

        @Test
        void shouldReturnFirstMatchingSetForPairSum8() {
            List<Integer> numbers = List.of(3, 2, 5, 4, 1);

            var output = PairSum.pairSumViaSingleLoop(numbers, 8);

            Assertions.assertEquals(List.of(0, 2), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum5() {
            List<Integer> numbers = List.of(4, 7, 9, 2, 5, 1);

            var output = PairSum.pairSumViaSingleLoop(numbers, 5);

            Assertions.assertEquals(List.of(0, 5), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum3() {
            List<Integer> numbers = List.of(4, 7, 9, 2, 5, 1);

            var output = PairSum.pairSumViaSingleLoop(numbers, 3);

            Assertions.assertEquals(List.of(3, 5), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum13() {
            List<Integer> numbers = List.of(1, 6, 7, 2);

            var output = PairSum.pairSumViaSingleLoop(numbers, 13);

            Assertions.assertEquals(List.of(1, 2), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum18() {
            List<Integer> numbers = List.of(9, 9);

            var output = PairSum.pairSumViaSingleLoop(numbers, 18);

            Assertions.assertEquals(List.of(0, 1), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum12() {
            List<Integer> numbers = List.of(6, 4, 2, 8);

            var output = PairSum.pairSumViaSingleLoop(numbers, 12);

            Assertions.assertEquals(List.of(1, 3), output);
        }
    }

    @Nested
    class pairSumViaCompliment {

        @Test
        void shouldReturnFirstMatchingSetForPairSum8() {
            List<Integer> numbers = List.of(3, 2, 5, 4, 1);

            var output = PairSum.pairSumViaCompliment(numbers, 8);

            Assertions.assertEquals(List.of(0, 2), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum5() {
            List<Integer> numbers = List.of(4, 7, 9, 2, 5, 1);

            var output = PairSum.pairSumViaCompliment(numbers, 5);

            Assertions.assertEquals(List.of(0, 5), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum3() {
            List<Integer> numbers = List.of(4, 7, 9, 2, 5, 1);

            var output = PairSum.pairSumViaCompliment(numbers, 3);

            Assertions.assertEquals(List.of(3, 5), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum13() {
            List<Integer> numbers = List.of(1, 6, 7, 2);

            var output = PairSum.pairSumViaCompliment(numbers, 13);

            Assertions.assertEquals(List.of(1, 2), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum18() {
            List<Integer> numbers = List.of(9, 9);

            var output = PairSum.pairSumViaCompliment(numbers, 18);

            Assertions.assertEquals(List.of(0, 1), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum12() {
            List<Integer> numbers = List.of(6, 4, 2, 8);

            var output = PairSum.pairSumViaCompliment(numbers, 12);

            Assertions.assertEquals(List.of(1, 3), output);
        }
    }
}