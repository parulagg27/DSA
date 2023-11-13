package dsa.arrays.fiveSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FiveSortTest {

    @Test
    void shouldReturnArrayItselfIfInputSize1() {
        int[] input = new int[]{1};

        var output = FiveSort.fiveSort(input);

        assertEquals(input, output);
    }

    @Test
    void shouldReturnArrayWithInput5sInMiddle() {
        int[] input = new int[]{12, 5, 1, 5, 12, 7};

        var output = FiveSort.fiveSort(input);

        assertArrayEquals(new int[]{12, 7, 1, 12, 5, 5}, output);
    }

    @Test
    void shouldReturnArrayWithInput5sInBeginning() {
        int[] input = new int[]{5, 5, 5, 1, 1, 1, 4};

        var output = FiveSort.fiveSort(input);

        assertArrayEquals(new int[]{4, 1, 1, 1, 5, 5, 5}, output);
    }

    @Test
    void shouldReturnArrayWithLargerList() {
        int[] input = new int[]{5, 1, 2, 5, 5, 3, 2, 5, 1, 5, 5, 5, 4, 5};

        var output = FiveSort.fiveSort(input);

        assertArrayEquals(new int[]{4, 1, 2, 1, 2, 3, 5, 5, 5, 5, 5, 5, 5, 5}, output);
    }
}