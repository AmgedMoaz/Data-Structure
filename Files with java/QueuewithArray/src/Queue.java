// Write a class Queue with array

public class Queue {

    // Fields
    int[] queue;
    int front;
    public int rear;
    int size;

    // Overloading constructor
    Queue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

}