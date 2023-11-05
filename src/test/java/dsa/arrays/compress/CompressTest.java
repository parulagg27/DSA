package dsa.arrays.compress;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class CompressTest {

    @Nested
    class compress {

        @Test
        void shouldCompressCTSString(){
            String input = "ccaaatsss";

            var output = Compress.compress(input);

            Assertions.assertEquals("2c3at3s", output);
        }

        @Test
        void shouldCompressSBZString(){
            String input = "ssssbbz";

            var output = Compress.compress(input);

            Assertions.assertEquals("4s2bz", output);
        }

        @Test
        void shouldCompressPOPString(){
            String input = "ppoppppp";

            var output = Compress.compress(input);

            Assertions.assertEquals("2po5p", output);
        }

        @Test
        void shouldCompressNEZString(){
            String input = "nnneeeeeeeeeeeezz";

            var output = Compress.compress(input);

            Assertions.assertEquals("3n12e2z", output);
        }

        @Test
        void shouldCompressYRepeatingString(){
            String input = "y".repeat(127);

            var output = Compress.compress(input);

            Assertions.assertEquals("127y", output);
        }

        @Test
        void shouldReturnEmptyForEmptyString(){
            var output = Compress.compress("");

            Assertions.assertEquals("", output);
        }

        @Test
        void shouldReturnStringItselfForStringOfLength1() {
            var output = Compress.compress("a");

            Assertions.assertEquals("a", output);
        }
    }

    @Nested
    class compressByTwoPointers {

        @Test
        void shouldCompressCTSString(){
            String input = "ccaaatsss";

            var output = Compress.compressByTwoPointers(input);

            Assertions.assertEquals("2c3at3s", output);
        }

        @Test
        void shouldCompressSBZString(){
            String input = "ssssbbz";

            var output = Compress.compressByTwoPointers(input);

            Assertions.assertEquals("4s2bz", output);
        }

        @Test
        void shouldCompressPOPString(){
            String input = "ppoppppp";

            var output = Compress.compressByTwoPointers(input);

            Assertions.assertEquals("2po5p", output);
        }

        @Test
        void shouldCompressNEZString(){
            String input = "nnneeeeeeeeeeeezz";

            var output = Compress.compressByTwoPointers(input);

            Assertions.assertEquals("3n12e2z", output);
        }

        @Test
        void shouldCompressYRepeatingString(){
            String input = "y".repeat(127);

            var output = Compress.compressByTwoPointers(input);

            Assertions.assertEquals("127y", output);
        }

        @Test
        void shouldReturnEmptyForEmptyString(){
            var output = Compress.compressByTwoPointers("");

            Assertions.assertEquals("", output);
        }

        @Test
        void shouldReturnStringItselfForStringOfLength1() {
            var output = Compress.compressByTwoPointers("a");

            Assertions.assertEquals("a", output);
        }
    }
}