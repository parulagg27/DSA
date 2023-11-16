package dsa.linkedList.implementation;

class Node<T> {
    T value;
    Node<T> next;

    Node(T value){
        this.value = value;
        this.next = null;
    }
}
public class LinkedList {

    public static void main(String[] args) {
        Node<Integer> a = new Node<>(1);
        System.out.println(a.value);
        System.out.println(a.next);

        Node<Integer> b = new Node<>(5);
        Node<Integer> c = new Node<>(3);
        a.next = b;
        b.next = c;
        System.out.println(a.next);
        System.out.println(c.next);
        System.out.println(b.value);
        System.out.println(a.next.value);

        Node<String> name1 = new Node<>("apple");
        System.out.println(name1.value);
        System.out.println(name1.next);
    }
}
