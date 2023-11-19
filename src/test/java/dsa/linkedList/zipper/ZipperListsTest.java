package dsa.linkedList.zipper;

import dsa.linkedList.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ZipperListsTest {

    @Test
    void shouldZipperListsOfEqualSize() {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        a.next = b;
        b.next = c;
        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");
        Node<String> z = new Node<>("z");
        x.next = y;
        y.next = z;

        var output = ZipperLists.zipperByOddEvenAndCurrentPointer(a, x);

        assertEquals(a, output);
        assertEquals(a.next, x);
        assertEquals(x.next, b);
        assertEquals(b.next, y);
        assertEquals(y.next, c);
        assertEquals(c.next, z);
    }

    @Test
    void shouldZipperListsWithList1BiggerThanList2() {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");
        Node<String> z = new Node<>("z");
        x.next = y;
        y.next = z;

        var output = ZipperLists.zipperByOddEvenAndCurrentPointer(a, x);

        assertEquals(a, output);
        assertEquals(a.next, x);
        assertEquals(x.next, b);
        assertEquals(b.next, y);
        assertEquals(y.next, c);
        assertEquals(c.next, z);
        assertEquals(z.next, d);
        assertEquals(d.next, e);
        assertEquals(e.next, f);
        assertNull(f.next);
    }

    @Test
    void shouldZipperListsWithList2BiggerThanList1() {
        Node<String> s = new Node<>("s");
        Node<String> t = new Node<>("t");
        s.next = t;
        Node<String> one = new Node<>("1");
        Node<String> two = new Node<>("2");
        Node<String> three = new Node<>("3");
        Node<String> four = new Node<>("4");
        one.next = two;
        two.next = three;
        three.next = four;

        var output = ZipperLists.zipperByOddEvenAndCurrentPointer(s, one);

        assertEquals(s, output);
        assertEquals(s.next, one);
        assertEquals(one.next, t);
        assertEquals(t.next, two);
        assertEquals(two.next, three);
        assertEquals(three.next, four);
        assertNull(four.next);
    }

    @Test
    void shouldZipperListsWithList1OfSize1() {
        Node<String> w = new Node<>("w");
        Node<String> one = new Node<>("1");
        Node<String> two = new Node<>("2");
        Node<String> three = new Node<>("3");
        one.next = two;
        two.next = three;

        var output = ZipperLists.zipperByOddEvenAndCurrentPointer(w, one);

        assertEquals(w, output);
        assertEquals(w.next, one);
        assertEquals(one.next, two);
        assertEquals(two.next, three);
        assertNull(three.next);
    }

    @Test
    void shouldZipperListsWithList2OfSize1() {
        Node<String> one = new Node<>("1");
        Node<String> two = new Node<>("2");
        Node<String> three = new Node<>("3");
        one.next = two;
        two.next = three;
        Node<String> w = new Node<>("w");

        var output = ZipperLists.zipperByOddEvenAndCurrentPointer(one, w);

        assertEquals(one, output);
        assertEquals(one.next, w);
        assertEquals(w.next, two);
        assertEquals(two.next, three);
        assertNull(three.next);
    }
}