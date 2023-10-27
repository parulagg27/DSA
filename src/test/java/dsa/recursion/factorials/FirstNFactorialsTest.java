package dsa.recursion.factorials;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FirstNFactorialsTest {

    @Nested
    class firstNFactorials {

        @Test
        void shouldReturnListOfFactorialsLessThan10() {
            int[] expected = new int[]{1, 2, 6, 0, 0, 0, 0, 0, 0, 0};

            var output = FirstNFactorials.firstNFactorials(10);

            assertArrayEquals(expected, output);
        }
    }

    @Nested
    class firstNFactorialsList {

        @Test
        void shouldGetFactorialsLessThanEqualTo2() {
            List<Long> expected = new ArrayList<>(List.of(1L, 2L));

            var output = FirstNFactorials.firstNFactorialsList(2);

            Assertions.assertEquals(expected, output);
        }

        @Test
        void shouldGetFactorialsLessThanEqualTo1() {
            List<Long> expected = new ArrayList<>(List.of(1L));

            var output = FirstNFactorials.firstNFactorialsList(1);

            Assertions.assertEquals(expected, output);
        }

        @Test
        void shouldGetFactorialsLessThanEqualTo10() {
            List<Long> expected = new ArrayList<>(List.of(1L, 2L, 6L));

            var output = FirstNFactorials.firstNFactorialsList(10);

            Assertions.assertEquals(expected, output);
        }
    }

    @Nested
    class firstNFactorialsOptimised {

        @Test
        void shouldGetFactorialsLessThanEqualTo2() {
            List<Long> expected = new ArrayList<>(List.of(1L, 2L));

            var output = FirstNFactorials.firstNFactorialsOptimised(2);

            Assertions.assertEquals(expected, output);
        }

        @Test
        void shouldGetFactorialsLessThanEqualTo1() {
            List<Long> expected = new ArrayList<>(List.of(1L));

            var output = FirstNFactorials.firstNFactorialsOptimised(1);

            Assertions.assertEquals(expected, output);
        }

        @Test
        void shouldGetFactorialsLessThanEqualTo10() {
            List<Long> expected = new ArrayList<>(List.of(1L, 2L, 6L));

            var output = FirstNFactorials.firstNFactorialsOptimised(10);

            Assertions.assertEquals(expected, output);
        }
    }

    @Nested
    class firstNFactorialsSimplifiedOptimised {

        @Test
        void shouldGetFactorialsLessThanEqualTo2() {
            List<Long> expected = new ArrayList<>(List.of(1L, 2L));

            var output = FirstNFactorials.firstNFactorialsSimplifiedOptimised(2);

            Assertions.assertEquals(expected, output);
        }

        @Test
        void shouldGetFactorialsLessThanEqualTo1() {
            List<Long> expected = new ArrayList<>(List.of(1L));

            var output = FirstNFactorials.firstNFactorialsSimplifiedOptimised(1);

            Assertions.assertEquals(expected, output);
        }

        @Test
        void shouldGetFactorialsLessThanEqualTo10() {
            List<Long> expected = new ArrayList<>(List.of(1L, 2L, 6L));

            var output = FirstNFactorials.firstNFactorialsSimplifiedOptimised(10);

            Assertions.assertEquals(expected, output);
        }
    }
}