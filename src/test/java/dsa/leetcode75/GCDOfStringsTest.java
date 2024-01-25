package dsa.leetcode75;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class GCDOfStringsTest {

    @Nested
    class GcdOfStringsViaGCD {

        @Test
        void shouldReturnEmptyIfAnyStringIsEmpty() {
            var output = GCDOfStrings.gcdOfStringsViaGCD("", "");

            Assertions.assertEquals("", output);
        }

        @Test
        void shouldReturnGCDStringForABC() {
            var output = GCDOfStrings.gcdOfStringsViaGCD("ABC", "ABCABC");

            Assertions.assertEquals("ABC", output);
        }

        @Test
        void shouldReturnABasGCDForTwoStringsWith3And8Repetitions() {
            var output = GCDOfStrings.gcdOfStringsViaGCD("ABABAB", "ABABABABABABABAB");

            Assertions.assertEquals("AB", output);
        }

        @Test
        void shouldReturnEmptyFor2DifferentStrings() {
            var output = GCDOfStrings.gcdOfStringsViaGCD("LEET", "CODE");

            Assertions.assertEquals("", output);
        }
    }

    @Nested
    class GcdOfStringsByConcatenationAndGCD {

        @Test
        void shouldReturnEmptyIfAnyStringIsEmpty() {
            var output = GCDOfStrings.gcdOfStringsByConcatenationAndGCD("", "");

            Assertions.assertEquals("", output);
        }

        @Test
        void shouldReturnGCDStringForABC() {
            var output = GCDOfStrings.gcdOfStringsByConcatenationAndGCD("ABC", "ABCABC");

            Assertions.assertEquals("ABC", output);
        }

        @Test
        void shouldReturnABasGCDForTwoStringsWith3And8Repetitions() {
            var output = GCDOfStrings.gcdOfStringsByConcatenationAndGCD("ABABAB", "ABABABABABABABAB");

            Assertions.assertEquals("AB", output);
        }

        @Test
        void shouldReturnEmptyFor2DifferentStrings() {
            var output = GCDOfStrings.gcdOfStringsByConcatenationAndGCD("LEET", "CODE");

            Assertions.assertEquals("", output);
        }
    }

}