package dsa.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class UncompressTest {

    @Nested
    class uncompress {

        @Test
        void shouldDecompress2c3a1t() {
            String input = "2c3a1t";

            var output = Uncompress.uncompress(input);

            Assertions.assertEquals("ccaaat", output);
        }

        @Test
        void shouldDecompress4s2b() {
            String input = "4s2b";

            var output = Uncompress.uncompress(input);

            Assertions.assertEquals("ssssbb", output);
        }

        @Test
        void shouldDecompress2p1o5p() {
            String input = "2p1o5p";

            var output = Uncompress.uncompress(input);

            Assertions.assertEquals("ppoppppp", output);
        }

        @Test
        void shouldDecompress3n12e2z() {
            String input = "3n12e2z";

            var output = Uncompress.uncompress(input);

            Assertions.assertEquals("nnneeeeeeeeeeeezz", output);
        }

        @Test
        void shouldDecompress127y() {
            String input = "127y";

            var output = Uncompress.uncompress(input);

            Assertions.assertEquals("y".repeat(127), output);
        }

        @Test
        void shouldDecompress0y5w0q() {
            String input = "0y5w0q";

            var output = Uncompress.uncompress(input);

            Assertions.assertEquals("wwwww", output);
        }
    }

    @Nested
    class uncompressByTwoPointers {

        @Test
        void shouldDecompress2c3a1t() {
            String input = "2c3a1t";

            var output = Uncompress.uncompressByTwoPointers(input);

            Assertions.assertEquals("ccaaat", output);
        }

        @Test
        void shouldDecompress4s2b() {
            String input = "4s2b";

            var output = Uncompress.uncompressByTwoPointers(input);

            Assertions.assertEquals("ssssbb", output);
        }

        @Test
        void shouldDecompress2p1o5p() {
            String input = "2p1o5p";

            var output = Uncompress.uncompressByTwoPointers(input);

            Assertions.assertEquals("ppoppppp", output);
        }

        @Test
        void shouldDecompress3n12e2z() {
            String input = "3n12e2z";

            var output = Uncompress.uncompressByTwoPointers(input);

            Assertions.assertEquals("nnneeeeeeeeeeeezz", output);
        }

        @Test
        void shouldDecompress127y() {
            String input = "127y";

            var output = Uncompress.uncompressByTwoPointers(input);

            Assertions.assertEquals("y".repeat(127), output);
        }

        @Test
        void shouldDecompress0y5w0q() {
            String input = "0y5w0q";

            var output = Uncompress.uncompressByTwoPointers(input);

            Assertions.assertEquals("wwwww", output);
        }
    }

    @Nested
    class uncompressWith2PointersWithoutCharArray {

        @Test
        void shouldDecompress2c3a1t() {
            String input = "2c3a1t";

            var output = Uncompress.uncompressWith2PointersWithoutCharArray(input);

            Assertions.assertEquals("ccaaat", output);
        }

        @Test
        void shouldDecompress4s2b() {
            String input = "4s2b";

            var output = Uncompress.uncompressWith2PointersWithoutCharArray(input);

            Assertions.assertEquals("ssssbb", output);
        }

        @Test
        void shouldDecompress2p1o5p() {
            String input = "2p1o5p";

            var output = Uncompress.uncompressWith2PointersWithoutCharArray(input);

            Assertions.assertEquals("ppoppppp", output);
        }

        @Test
        void shouldDecompress3n12e2z() {
            String input = "3n12e2z";

            var output = Uncompress.uncompressWith2PointersWithoutCharArray(input);

            Assertions.assertEquals("nnneeeeeeeeeeeezz", output);
        }

        @Test
        void shouldDecompress127y() {
            String input = "127y";

            var output = Uncompress.uncompressWith2PointersWithoutCharArray(input);

            Assertions.assertEquals("y".repeat(127), output);
        }

        @Test
        void shouldDecompress0y5w0q() {
            String input = "0y5w0q";

            var output = Uncompress.uncompressWith2PointersWithoutCharArray(input);

            Assertions.assertEquals("wwwww", output);
        }
    }
}