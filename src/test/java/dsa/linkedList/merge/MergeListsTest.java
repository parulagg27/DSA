package dsa.linkedList.merge;

import dsa.linkedList.Node;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static dsa.linkedList.merge.MergeLists.mergeLists;
import static dsa.linkedList.merge.MergeLists.mergeListsRecursively;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MergeListsTest {

    @Nested
    class MergeLists {

        @Test
        void shouldMerge2LinkedListsOfSameSizeIntoSortedList() {
            Node<Integer> a = new Node<>(5);
            Node<Integer> b = new Node<>(7);
            Node<Integer> c = new Node<>(10);
            Node<Integer> d = new Node<>(12);
            a.next = b;
            b.next = c;
            c.next = d;
            Node<Integer> q = new Node<>(6);
            Node<Integer> r = new Node<>(8);
            Node<Integer> s = new Node<>(9);
            Node<Integer> t = new Node<>(25);
            q.next = r;
            r.next = s;
            s.next = t;

            var output = mergeLists(a, q);

            assertEquals(a, output);
            assertEquals(a.next, q);
            assertEquals(q.next, b);
            assertEquals(b.next, r);
            assertEquals(r.next, s);
            assertEquals(s.next, c);
            assertEquals(c.next, d);
            assertEquals(d.next, t);
            assertNull(t.next);
        }

        @Test
        void shouldMerge2LinkedListsOfDifferentSizeIntoSortedList() {
            Node<Integer> a = new Node<>(5);
            Node<Integer> b = new Node<>(7);
            Node<Integer> c = new Node<>(10);
            Node<Integer> d = new Node<>(12);
            Node<Integer> e = new Node<>(20);
            Node<Integer> f = new Node<>(28);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
            Node<Integer> q = new Node<>(1);
            Node<Integer> r = new Node<>(8);
            Node<Integer> s = new Node<>(9);
            Node<Integer> t = new Node<>(10);
            q.next = r;
            r.next = s;
            s.next = t;

            var output = mergeLists(a, q);
            assertEquals(q, output);
            assertEquals(q.next, a);
            assertEquals(a.next, b);
            assertEquals(b.next, r);
            assertEquals(r.next, s);
            assertEquals(s.next, t);
            assertEquals(t.next, c);
            assertEquals(c.next, d);
            assertEquals(d.next, e);
            assertEquals(e.next, f);
            assertNull(f.next);
        }

        @Test
        void shouldMerge2LinkedListsOfSize1And2Respectively() {
            Node<Integer> h = new Node<>(30);
            Node<Integer> p = new Node<>(15);
            Node<Integer> q = new Node<>(67);
            p.next = q;

            var output = mergeLists(h, p);

            assertEquals(p, output);
            assertEquals(p.next, h);
            assertEquals(h.next, q);
            assertNull(q.next);
        }
    }

    @Nested
    class MergeListsRecursively {

        @Test
        void shouldMerge2LinkedListsOfSameSizeIntoSortedList() {
            Node<Integer> a = new Node<>(5);
            Node<Integer> b = new Node<>(7);
            Node<Integer> c = new Node<>(10);
            Node<Integer> d = new Node<>(12);
            a.next = b;
            b.next = c;
            c.next = d;
            Node<Integer> q = new Node<>(6);
            Node<Integer> r = new Node<>(8);
            Node<Integer> s = new Node<>(9);
            Node<Integer> t = new Node<>(25);
            q.next = r;
            r.next = s;
            s.next = t;

            var output = mergeListsRecursively(a, q);

            assertEquals(a, output);
            assertEquals(a.next, q);
            assertEquals(q.next, b);
            assertEquals(b.next, r);
            assertEquals(r.next, s);
            assertEquals(s.next, c);
            assertEquals(c.next, d);
            assertEquals(d.next, t);
            assertNull(t.next);
        }

        @Test
        void shouldMerge2LinkedListsOfDifferentSizeIntoSortedList() {
            Node<Integer> a = new Node<>(5);
            Node<Integer> b = new Node<>(7);
            Node<Integer> c = new Node<>(10);
            Node<Integer> d = new Node<>(12);
            Node<Integer> e = new Node<>(20);
            Node<Integer> f = new Node<>(28);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
            Node<Integer> q = new Node<>(1);
            Node<Integer> r = new Node<>(8);
            Node<Integer> s = new Node<>(9);
            Node<Integer> t = new Node<>(10);
            q.next = r;
            r.next = s;
            s.next = t;

            var output = mergeListsRecursively(a, q);
            assertEquals(q, output);
            assertEquals(q.next, a);
            assertEquals(a.next, b);
            assertEquals(b.next, r);
            assertEquals(r.next, s);
            assertEquals(s.next, t);
            assertEquals(t.next, c);
            assertEquals(c.next, d);
            assertEquals(d.next, e);
            assertEquals(e.next, f);
            assertNull(f.next);
        }

        @Test
        void shouldMerge2LinkedListsOfSize1And2Respectively() {
            Node<Integer> h = new Node<>(30);
            Node<Integer> p = new Node<>(15);
            Node<Integer> q = new Node<>(67);
            p.next = q;

            var output = mergeListsRecursively(h, p);

            assertEquals(p, output);
            assertEquals(p.next, h);
            assertEquals(h.next, q);
            assertNull(q.next);
        }
    }
}