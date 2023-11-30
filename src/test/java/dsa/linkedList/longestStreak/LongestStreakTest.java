package dsa.linkedList.longestStreak;

import dsa.linkedList.Node;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestStreakTest {

    @Nested
    class DetermineLongestStreak {

        @Test
        void shouldReturn0ForLinkedListOfSize0(){
            var output = LongestStreak.determineLongestStreak(null);

            assertEquals(0, output);
        }

        @Test
        void shouldReturn1ForLinkedListOfSize1(){
            Node<Integer> a = new Node<>(10);

            var output = LongestStreak.determineLongestStreak(a);

            assertEquals(1, output);
        }

        @Test
        void shouldReturn2ForUniValueListOfSize2(){
            Node<Integer> a = new Node<>(5);
            a.next = new Node<>(5);

            var output = LongestStreak.determineLongestStreak(a);

            assertEquals(2, output);
        }

        @Test
        void shouldReturnLongestStreakOfAnyValueInGivenList(){
            Node<Integer> a = new Node<>(9);
            Node<Integer> b = new Node<>(9);
            Node<Integer> c = new Node<>(1);
            Node<Integer> d = new Node<>(9);
            Node<Integer> e = new Node<>(9);
            Node<Integer> f = new Node<>(9);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;

            var output = LongestStreak.determineLongestStreak(a);

            assertEquals(3, output);
        }

        @Test
        void shouldReturnLongestStreakCountOfAValueAtBeginningOfList(){
            Node<Integer> a = new Node<>(3);
            Node<Integer> b = new Node<>(3);
            Node<Integer> c = new Node<>(3);
            Node<Integer> d = new Node<>(3);
            Node<Integer> e = new Node<>(9);
            Node<Integer> f = new Node<>(9);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;

            var output = LongestStreak.determineLongestStreak(a);

            assertEquals(4, output);
        }

        @Test
        void shouldReturnLongestStreakCountOfAValueAtMiddleOfLinkedList(){
            Node<Integer> a = new Node<>(5);
            Node<Integer> b = new Node<>(5);
            Node<Integer> c = new Node<>(7);
            Node<Integer> d = new Node<>(7);
            Node<Integer> e = new Node<>(7);
            Node<Integer> f = new Node<>(6);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;

            var output = LongestStreak.determineLongestStreak(a);

            assertEquals(3, output);
        }
    }

    @Nested
    class DetermineLongestStreakRecursively {

        @Test
        void shouldReturn0ForLinkedListOfSize0(){
            var output = LongestStreak.determineLongestStreakRecursively(null);

            assertEquals(0, output);
        }

        @Test
        void shouldReturn1ForLinkedListOfSize1(){
            Node<Integer> a = new Node<>(10);

            var output = LongestStreak.determineLongestStreakRecursively(a);

            assertEquals(1, output);
        }

        @Test
        void shouldReturn2ForUniValueListOfSize2(){
            Node<Integer> a = new Node<>(5);
            a.next = new Node<>(5);

            var output = LongestStreak.determineLongestStreakRecursively(a);

            assertEquals(2, output);
        }

        @Test
        void shouldReturnLongestStreakOfAnyValueInGivenList(){
            Node<Integer> a = new Node<>(9);
            Node<Integer> b = new Node<>(9);
            Node<Integer> c = new Node<>(1);
            Node<Integer> d = new Node<>(9);
            Node<Integer> e = new Node<>(9);
            Node<Integer> f = new Node<>(9);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;

            var output = LongestStreak.determineLongestStreakRecursively(a);

            assertEquals(3, output);
        }

        @Test
        void shouldReturnLongestStreakCountOfAValueAtBeginningOfList(){
            Node<Integer> a = new Node<>(3);
            Node<Integer> b = new Node<>(3);
            Node<Integer> c = new Node<>(3);
            Node<Integer> d = new Node<>(3);
            Node<Integer> e = new Node<>(9);
            Node<Integer> f = new Node<>(9);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;

            var output = LongestStreak.determineLongestStreakRecursively(a);

            assertEquals(4, output);
        }

        @Test
        void shouldReturnLongestStreakCountOfAValueAtMiddleOfLinkedList(){
            Node<Integer> a = new Node<>(5);
            Node<Integer> b = new Node<>(5);
            Node<Integer> c = new Node<>(7);
            Node<Integer> d = new Node<>(7);
            Node<Integer> e = new Node<>(7);
            Node<Integer> f = new Node<>(6);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;

            var output = LongestStreak.determineLongestStreakRecursively(a);

            assertEquals(3, output);
        }
    }
}