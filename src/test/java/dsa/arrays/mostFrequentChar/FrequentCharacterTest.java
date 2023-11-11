package dsa.arrays.mostFrequentChar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class FrequentCharacterTest {

    @Nested
    class mostFrequentChar {

        @Test
        void shouldDetermineEAsMostFrequentCharInBookeeper(){
            char output = FrequentCharacter.mostFrequentChar("bookeeper");

            Assertions.assertEquals('e', output);
        }

        @Test
        void shouldDetermineMostFrequentCharInDavid(){
            char output = FrequentCharacter.mostFrequentChar("david");

            Assertions.assertEquals('d', output);
        }

        @Test
        void shouldDetermineMostFrequentCharInMississippi(){
            char output = FrequentCharacter.mostFrequentChar("mississippi");

            Assertions.assertEquals('i', output);
        }
    }

    @Nested
    class mostFrequentCharSimplified {

        @Test
        void shouldDetermineEAsMostFrequentCharInBookeeper(){
            char output = FrequentCharacter.mostFrequentCharSimplified("bookeeper");

            Assertions.assertEquals('e', output);
        }

        @Test
        void shouldDetermineMostFrequentCharInDavid(){
            char output = FrequentCharacter.mostFrequentCharSimplified("david");

            Assertions.assertEquals('d', output);
        }

        @Test
        void shouldDetermineMostFrequentCharInMississippi(){
            char output = FrequentCharacter.mostFrequentCharSimplified("mississippi");

            Assertions.assertEquals('i', output);
        }
    }

    @Nested
    class MostFrequentCharInConstantSpace {

        @Test
        void shouldDetermineEAsMostFrequentCharInBookeeper(){
            char output = FrequentCharacter.mostFrequentCharInConstantSpace("bookeeper");

            Assertions.assertEquals('e', output);
        }

        @Test
        void shouldDetermineMostFrequentCharInDavid(){
            char output = FrequentCharacter.mostFrequentCharInConstantSpace("david");

            Assertions.assertEquals('d', output);
        }

        @Test
        void shouldDetermineMostFrequentCharInMississippi(){
            char output = FrequentCharacter.mostFrequentCharInConstantSpace("mississippi");

            Assertions.assertEquals('i', output);
        }
    }
}