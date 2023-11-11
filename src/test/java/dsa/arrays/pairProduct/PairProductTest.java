package dsa.arrays.pairProduct;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

class PairProductTest {

    @Nested
    class pairProduct {
        @Test
        void shouldReturnFirstMatchingSetForPairProduct8() {
            List<Integer> numbers = List.of(3, 2, 5, 4, 1);

            var output = PairProduct.pairProduct(numbers, 8);

            Assertions.assertEquals(List.of(1, 3), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum5() {
            List<Integer> numbers = List.of(3, 2, 5, 4, 1);

            var output = PairProduct.pairProduct(numbers, 10);

            Assertions.assertEquals(List.of(1, 2), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum3() {
            List<Integer> numbers = List.of(4, 7, 9, 2, 5, 1);

            var output = PairProduct.pairProduct(numbers, 5);

            Assertions.assertEquals(List.of(4,5), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum13() {
            List<Integer> numbers = List.of(4, 7, 9, 2, 5, 1);

            var output = PairProduct.pairProduct(numbers, 35);

            Assertions.assertEquals(List.of(1, 4), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum18() {
            List<Integer> numbers = List.of(3, 2, 5, 4, 1);

            var output = PairProduct.pairProduct(numbers, 10);

            Assertions.assertEquals(List.of(1, 2), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum12() {
            List<Integer> numbers = List.of(4, 6, 8, 2);

            var output = PairProduct.pairProduct(numbers, 16);

            Assertions.assertEquals(List.of(2, 3), output);
        }
    }

    @Nested
    class pairProductViaSingleLoop {
        @Test
        void shouldReturnFirstMatchingSetForPairProduct8() {
            List<Integer> numbers = List.of(3, 2, 5, 4, 1);

            var output = PairProduct.pairProductViaSingleLoop(numbers, 8);

            Assertions.assertEquals(List.of(1, 3), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum5() {
            List<Integer> numbers = List.of(3, 2, 5, 4, 1);

            var output = PairProduct.pairProductViaSingleLoop(numbers, 10);

            Assertions.assertEquals(List.of(1, 2), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum3() {
            List<Integer> numbers = List.of(4, 7, 9, 2, 5, 1);

            var output = PairProduct.pairProductViaSingleLoop(numbers, 5);

            Assertions.assertEquals(List.of(4,5), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum13() {
            List<Integer> numbers = List.of(4, 7, 9, 2, 5, 1);

            var output = PairProduct.pairProductViaSingleLoop(numbers, 35);

            Assertions.assertEquals(List.of(1, 4), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum18() {
            List<Integer> numbers = List.of(3, 2, 5, 4, 1);

            var output = PairProduct.pairProductViaSingleLoop(numbers, 10);

            Assertions.assertEquals(List.of(1, 2), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum12() {
            List<Integer> numbers = List.of(4, 6, 8, 2);

            var output = PairProduct.pairProductViaSingleLoop(numbers, 16);

            Assertions.assertEquals(List.of(2, 3), output);
        }
    }

    @Nested
    class pairProductViaHashMap {

        @Test
        void shouldReturnFirstMatchingSetForPairProduct8() {
            List<Integer> numbers = List.of(3, 2, 5, 4, 1);

            var output = PairProduct.pairProductViaHashMap(numbers, 8);

            Assertions.assertEquals(List.of(1, 3), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum5() {
            List<Integer> numbers = List.of(3, 2, 5, 4, 1);

            var output = PairProduct.pairProductViaHashMap(numbers, 10);

            Assertions.assertEquals(List.of(1, 2), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum3() {
            List<Integer> numbers = List.of(4, 7, 9, 2, 5, 1);

            var output = PairProduct.pairProductViaHashMap(numbers, 5);

            Assertions.assertEquals(List.of(4,5), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum13() {
            List<Integer> numbers = List.of(4, 7, 9, 2, 5, 1);

            var output = PairProduct.pairProductViaHashMap(numbers, 35);

            Assertions.assertEquals(List.of(1, 4), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum18() {
            List<Integer> numbers = List.of(3, 2, 5, 4, 1);

            var output = PairProduct.pairProductViaHashMap(numbers, 10);

            Assertions.assertEquals(List.of(1, 2), output);
        }

        @Test
        void shouldReturnFirstMatchingSetForPairSum12() {
            List<Integer> numbers = List.of(4, 6, 8, 2);

            var output = PairProduct.pairProductViaHashMap(numbers, 16);

            Assertions.assertEquals(List.of(2, 3), output);
        }
    }
}