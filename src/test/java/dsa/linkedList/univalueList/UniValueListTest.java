package dsa.linkedList.univalueList;

import dsa.linkedList.Node;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniValueListTest {

    @Nested
    class IsUniValueList {

        @Test
        void shouldReturnTrueForUniValueListOfSize3(){
            Node<Integer> a = new Node<>(7);
            Node<Integer> b = new Node<>(7);
            Node<Integer> c = new Node<>(7);
            a.next = b;
            b.next = c;

            var output = UniValueList.isUniValueList(a);

            assertTrue(output);
        }

        @Test
        void shouldReturnFalseForNonUniValueListOfSize3(){
            Node<Integer> a = new Node<>(7);
            Node<Integer> b = new Node<>(7);
            Node<Integer> c = new Node<>(4);
            a.next = b;
            b.next = c;

            var output = UniValueList.isUniValueList(a);

            assertFalse(output);
        }

        @Test
        void shouldReturnTrueForUniValueListOfSize5(){
            Node<Integer> u = new Node<>(2);
            Node<Integer> v = new Node<>(2);
            Node<Integer> w = new Node<>(2);
            Node<Integer> x = new Node<>(2);
            Node<Integer> y = new Node<>(2);
            u.next = v;
            v.next = w;
            w.next = x;
            x.next = y;

            var output = UniValueList.isUniValueList(u);

            assertTrue(output);
        }

        @Test
        void shouldReturnFalseForUniValueListOfSize5(){
            Node<Integer> u = new Node<>(2);
            Node<Integer> v = new Node<>(2);
            Node<Integer> w = new Node<>(3);
            Node<Integer> x = new Node<>(3);
            Node<Integer> y = new Node<>(2);
            u.next = v;
            v.next = w;
            w.next = x;
            x.next = y;

            var output = UniValueList.isUniValueList(u);

            assertFalse(output);
        }

        @Test
        void shouldReturnTrueForListOfSize1(){
            Node<String> z = new Node<>("z");

            var output = UniValueList.isUniValueList(z);

            assertTrue(output);
        }
    }

    @Nested
    class IsUniValueListRecursive {

        @Test
        void shouldReturnTrueForUniValueListOfSize3(){
            Node<Integer> a = new Node<>(7);
            Node<Integer> b = new Node<>(7);
            Node<Integer> c = new Node<>(7);
            a.next = b;
            b.next = c;

            var output = UniValueList.isUniValueListRecursive(a);

            assertTrue(output);
        }

        @Test
        void shouldReturnFalseForNonUniValueListOfSize3(){
            Node<Integer> a = new Node<>(7);
            Node<Integer> b = new Node<>(7);
            Node<Integer> c = new Node<>(4);
            a.next = b;
            b.next = c;

            var output = UniValueList.isUniValueListRecursive(a);

            assertFalse(output);
        }

        @Test
        void shouldReturnTrueForUniValueListOfSize5(){
            Node<Integer> u = new Node<>(2);
            Node<Integer> v = new Node<>(2);
            Node<Integer> w = new Node<>(2);
            Node<Integer> x = new Node<>(2);
            Node<Integer> y = new Node<>(2);
            u.next = v;
            v.next = w;
            w.next = x;
            x.next = y;

            var output = UniValueList.isUniValueListRecursive(u);

            assertTrue(output);
        }

        @Test
        void shouldReturnFalseForUniValueListOfSize5(){
            Node<Integer> u = new Node<>(2);
            Node<Integer> v = new Node<>(2);
            Node<Integer> w = new Node<>(3);
            Node<Integer> x = new Node<>(3);
            Node<Integer> y = new Node<>(2);
            u.next = v;
            v.next = w;
            w.next = x;
            x.next = y;

            var output = UniValueList.isUniValueListRecursive(u);

            assertFalse(output);
        }

        @Test
        void shouldReturnTrueForListOfSize1(){
            Node<String> z = new Node<>("z");

            var output = UniValueList.isUniValueListRecursive(z);

            assertTrue(output);
        }
    }
}