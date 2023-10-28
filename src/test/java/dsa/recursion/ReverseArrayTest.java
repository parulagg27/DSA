package dsa.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ReverseArrayTest {

    @Nested
    class ReverseViaNewArray {

        @Test
        void shouldReverseArrayContaining1Element() {
            int[] input = new int[]{1};
            int[] expected = new int[]{1};

            var output = ReverseArray.reverseViaNewArray(1, input);

            Assertions.assertArrayEquals(expected, output);
        }

        @Test
        void shouldReverseArrayContainingNoElement() {
            int[] input = new int[0];
            int[] expected = new int[0];

            var output = ReverseArray.reverseViaNewArray(0, input);

            Assertions.assertArrayEquals(expected, output);
        }

        @Test
        void shouldReverseArrayContaining6Elements() {
            int[] input = new int[]{5, 7, 8, 1, 6, 3};
            int[] expected = new int[]{3, 6, 1, 8, 7, 5};

            var output = ReverseArray.reverseViaNewArray(6, input);

            Assertions.assertArrayEquals(expected, output);
        }

        @Test
        void shouldReverseArrayContaining8Elements() {
            int[] input = new int[]{3, 1, 1, 7, 4, 2, 6, 11};
            int[] expected = new int[]{11, 6, 2, 4, 7, 1, 1, 3};

            var output = ReverseArray.reverseViaNewArray(8, input);

            Assertions.assertArrayEquals(expected, output);
        }
    }

    @Nested
    class ReverseArrayByHalfTraversal {

        @Test
        void shouldReverseArrayContaining1Element() {
            int[] input = new int[]{1};
            int[] expected = new int[]{1};

            var output = ReverseArray.reverseArrayByHalfTraversal(1, input);

            Assertions.assertArrayEquals(expected, output);
        }

        @Test
        void shouldReverseArrayContainingNoElement() {
            int[] input = new int[0];
            int[] expected = new int[0];

            var output = ReverseArray.reverseArrayByHalfTraversal(0, input);

            Assertions.assertArrayEquals(expected, output);
        }

        @Test
        void shouldReverseArrayContaining6Elements() {
            int[] input = new int[]{5, 7, 8, 1, 6, 3};
            int[] expected = new int[]{3, 6, 1, 8, 7, 5};

            var output = ReverseArray.reverseArrayByHalfTraversal(6, input);

            Assertions.assertArrayEquals(expected, output);
        }

        @Test
        void shouldReverseArrayContaining8Elements() {
            int[] input = new int[]{3, 1, 1, 7, 4, 2, 6, 11};
            int[] expected = new int[]{11, 6, 2, 4, 7, 1, 1, 3};

            var output = ReverseArray.reverseArrayByHalfTraversal(8, input);

            Assertions.assertArrayEquals(expected, output);
        }
    }

    @Nested
    class ReverseArrayByTwoPointers {

        @Test
        void shouldReverseArrayContaining1Element() {
            int[] input = new int[]{1};
            int[] expected = new int[]{1};

            var output = ReverseArray.reverseArrayByTwoPointers(1, input);

            Assertions.assertArrayEquals(expected, output);
        }

        @Test
        void shouldReverseArrayContainingNoElement() {
            int[] input = new int[0];
            int[] expected = new int[0];

            var output = ReverseArray.reverseArrayByTwoPointers(0, input);

            Assertions.assertArrayEquals(expected, output);
        }

        @Test
        void shouldReverseArrayContaining6Elements() {
            int[] input = new int[]{5, 7, 8, 1, 6, 3};
            int[] expected = new int[]{3, 6, 1, 8, 7, 5};

            var output = ReverseArray.reverseArrayByTwoPointers(6, input);

            Assertions.assertArrayEquals(expected, output);
        }

        @Test
        void shouldReverseArrayContaining8Elements() {
            int[] input = new int[]{3, 1, 1, 7, 4, 2, 6, 11};
            int[] expected = new int[]{11, 6, 2, 4, 7, 1, 1, 3};

            var output = ReverseArray.reverseArrayByTwoPointers(8, input);

            Assertions.assertArrayEquals(expected, output);
        }
    }

    @Nested
    class ReverseArrayByRecursion {

        @Test
        void shouldReverseArrayContaining1Element() {
            int[] input = new int[]{1};
            int[] expected = new int[]{1};

            var output = ReverseArray.reverseArrayByRecursion(1, input);

            Assertions.assertArrayEquals(expected, output);
        }

        @Test
        void shouldReverseArrayContainingNoElement() {
            int[] input = new int[0];
            int[] expected = new int[0];

            var output = ReverseArray.reverseArrayByRecursion(0, input);

            Assertions.assertArrayEquals(expected, output);
        }

        @Test
        void shouldReverseArrayContaining6Elements() {
            int[] input = new int[]{5, 7, 8, 1, 6, 3};
            int[] expected = new int[]{3, 6, 1, 8, 7, 5};

            var output = ReverseArray.reverseArrayByRecursion(6, input);

            Assertions.assertArrayEquals(expected, output);
        }

        @Test
        void shouldReverseArrayContaining8Elements() {
            int[] input = new int[]{3, 1, 1, 7, 4, 2, 6, 11};
            int[] expected = new int[]{11, 6, 2, 4, 7, 1, 1, 3};

            var output = ReverseArray.reverseArrayByRecursion(8, input);

            Assertions.assertArrayEquals(expected, output);
        }
    }

    @Nested
    class ReverseArrayByCollectionMethod {

        @Test
        void shouldReverseArrayContaining1Element() {
            int[] input = new int[]{1};
            int[] expected = new int[]{1};

            var output = ReverseArray.reverseArrayByCollectionMethod(1, input);

            Assertions.assertArrayEquals(expected, output);
        }

        @Test
        void shouldReverseArrayContainingNoElement() {
            int[] input = new int[0];
            int[] expected = new int[0];

            var output = ReverseArray.reverseArrayByCollectionMethod(0, input);

            Assertions.assertArrayEquals(expected, output);
        }

        @Test
        void shouldReverseArrayContaining6Elements() {
            int[] input = new int[]{5, 7, 8, 1, 6, 3};
            int[] expected = new int[]{3, 6, 1, 8, 7, 5};

            var output = ReverseArray.reverseArrayByCollectionMethod(6, input);

            Assertions.assertArrayEquals(expected, output);
        }

        @Test
        void shouldReverseArrayContaining8Elements() {
            int[] input = new int[]{3, 1, 1, 7, 4, 2, 6, 11};
            int[] expected = new int[]{11, 6, 2, 4, 7, 1, 1, 3};

            var output = ReverseArray.reverseArrayByCollectionMethod(8, input);

            Assertions.assertArrayEquals(expected, output);
        }
    }
}