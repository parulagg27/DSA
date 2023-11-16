package dsa.linkedList.implementation;

class Node {
    int value;
    Node next;

    Node(int value){
        this.value = value;
        this.next = null;
    }
}
public class LinkedList {

    public static void main(String[] args) {
        Node a = new Node(1);
        System.out.println(a.value);
        System.out.println(a.next);

        Node b = new Node(5);
        Node c = new Node(3);
        a.next = b;
        b.next = c;
        System.out.println(a.next);
        System.out.println(c.next);
        System.out.println(b.value);
        System.out.println(a.next.value);
    }
}
