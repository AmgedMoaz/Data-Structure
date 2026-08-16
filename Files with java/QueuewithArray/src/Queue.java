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

    // isFull method
    public boolean isFull() {
        return (rear == size -1);
    }

    // isEmpty method
    boolean isEmpty() {
        return (front == -1);
    }

    // Enqueue method
    public void enqueue(int value) {
        if(isFull()) {
            System.out.print("Queue overflow..! Can't add " + value);
            return;
        }else {
            if(isEmpty()) {
                front = rear = 0;
                queue[front] = value;
                System.out.print(value + " is Enqueued");
            }else {
                queue[++rear] = value;
                System.out.print(value + " is Enqueued");
            }
        }
    }

    // Dequeue method
    int dequeue() {
        if(isEmpty()) {
            System.out.print("Queue underflow...! Nothing to dequeue");
            return -1;
        }else {
            int removedValue = queue[rear--];
            System.out.println(removedValue + " is Dequeued");
            return removedValue;
        }
    }

    // Display method
    public void display() {
        if(isEmpty()) {
            System.out.print("Queue is already empty");
            return;
        }else {
            System.out.print("Queue items : ");
            for(int i = 0 ; i <= rear ; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

}