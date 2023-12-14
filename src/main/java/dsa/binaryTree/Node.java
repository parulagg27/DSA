package dsa.binaryTree;

public class Node<T> {
    T value;
    Node<T> left;
    Node<T> right;

    public Node(T value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public void assignChildren(Node<T> left, Node<T> right){
        this.left = left;
        this.right = right;
    }
}
