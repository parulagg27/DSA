package dsa.arrays.anagrams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class AnagramsTest {

    @Nested
    class isAnagramVia2HashMaps {

        @Test
        void shouldDetermineRestfulFlusterAsAnagram(){
            var output = Anagrams.isAnagramVia2HashMaps("restful", "fluster");

            Assertions.assertTrue(output);
        }
        @Test
        void shouldDetermineCatsTocsAsAnagram(){
            var output = Anagrams.isAnagramVia2HashMaps("cats", "tocs");

            Assertions.assertFalse(output);
        }

        @Test
        void shouldDetermineTwoStringsAsAnagramIgnoringCase(){
            var output = Anagrams.isAnagramVia2HashMaps("cats", "CatS");

            Assertions.assertTrue(output);
        }

        @Test
        void shouldDeterminePaperAndReapaAsNonAnagram(){
            var output = Anagrams.isAnagramVia2HashMaps("paper", "reapa");

            Assertions.assertFalse(output);
        }
    }

    @Nested
    class isAnagramVia1HashMap {

        @Test
        void shouldDetermineRestfulFlusterAsAnagram(){
            var output = Anagrams.isAnagramVia1HashMap("restful", "fluster");

            Assertions.assertTrue(output);
        }
        @Test
        void shouldDetermineCatsTocsAsAnagram(){
            var output = Anagrams.isAnagramVia1HashMap("cats", "tocs");

            Assertions.assertFalse(output);
        }

        @Test
        void shouldDetermineTwoStringsAsAnagramIgnoringCase(){
            var output = Anagrams.isAnagramVia1HashMap("cats", "CatS");

            Assertions.assertTrue(output);
        }

        @Test
        void shouldDeterminePaperAndReapaAsNonAnagram(){
            var output = Anagrams.isAnagramVia1HashMap("paper", "reapa");

            Assertions.assertFalse(output);
        }
    }

    @Nested
    class isAnagramViaSorting {

        @Test
        void shouldDetermineRestfulFlusterAsAnagram(){
            var output = Anagrams.isAnagramViaSorting("restful", "fluster");

            Assertions.assertTrue(output);
        }
        @Test
        void shouldDetermineCatsTocsAsAnagram(){
            var output = Anagrams.isAnagramViaSorting("cats", "tocs");

            Assertions.assertFalse(output);
        }

        @Test
        void shouldDetermineTwoStringsAsAnagramIgnoringCase(){
            var output = Anagrams.isAnagramViaSorting("cats", "CatS");

            Assertions.assertTrue(output);
        }

        @Test
        void shouldDeterminePaperAndReapaAsNonAnagram(){
            var output = Anagrams.isAnagramViaSorting("paper", "reapa");

            Assertions.assertFalse(output);
        }
    }
}