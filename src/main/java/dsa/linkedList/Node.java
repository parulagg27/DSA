package dsa.linkedList;

public class Node<T> {

    public T value;
    public Node<T> next;

    public Node(T value){
        this.value = value;
        this.next = null;
    }

    //TODO: create generic method to create linkedList with variable number of values as the only parameter & return head of list.
}
