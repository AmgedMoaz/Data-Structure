// Queue by linked list as data structure

public class Queue {

    // Fields
    Node front , rear;

    // Default constructor
    Queue() {
        front = rear = null;
    }

    // Methods

    // isEmpty method
    public boolean isEmpty() {
        return (front == null);
    }

    // enqueue method
    void enqueue(int value) {
        Node newnode = new Node(value);
        if(isEmpty()) {
            front = rear = newnode;
            System.out.println(value + " is pushed");
            return;
        }else {
            rear.next = newnode;
            rear = newnode;
            System.out.println(value + " is pushed");
        }
    }

}