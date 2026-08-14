// The shape of every node in Doubly linked li8st

public class Node {

    // Fields
    int data;
    Node next;
    Node prev;

    // Overloading constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}