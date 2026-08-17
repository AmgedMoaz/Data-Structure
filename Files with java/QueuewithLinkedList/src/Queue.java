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

    // Enqueue method
    void enqueue(int value) {
        Node newnode = new Node(value);
        if(isEmpty()) {
            front = rear = newnode;
            System.out.println(value + " is enqueued");
            return;
        }else {
            rear.next = newnode;
            rear = newnode;
            System.out.println(value + " is enqueued");
        }
    }

    // Dequeue method
    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue underflow...! Nothing to dequeue");
            return -1;
        }else {
            int removedvalue = front.data;
            front = front.next;
            System.out.println(removedvalue + " is dequeued");
            return removedvalue;
        }
    }

    // Display method
    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is already empty");
            return;
        }else {
            Node current = front;
            System.out.println("Queue items : ");
            while(current != null) {
                System.out.println(current.data + " " );
                current = current.next;
            }
            System.out.println();
        }
    }

    // Peek method
    int peek() {
        return front.data;
    }


}