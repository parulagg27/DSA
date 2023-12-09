package dsa.binaryTree.implementation;

class Node<T> {
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
public class BinaryTree {

    public static void main(String[] arg){
        Node<Integer> a = new Node<>(1);
        Node<Integer> b = new Node<>(2);
        Node<Integer> c = new Node<>(3);
        a.left = b;
        a.right = c;
        //     a
        //   /   \
        //  b     c
        System.out.println(a.left.value);
        System.out.println(a.right.value);

        Node<String> test1 = new Node<>("z");
        Node<String> test2 = new Node<>("y");
        Node<String> test3 = new Node<>("x");
        test1.assignChildren(test2, test3);

        System.out.println(test1.left.value);
        System.out.println(test1.right.value);
    }
}
