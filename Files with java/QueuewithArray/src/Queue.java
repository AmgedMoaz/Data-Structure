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
            System.out.println("Queue overflow..! Can't add " + value);
            return;
        }else {
            if(isEmpty()) {
                front = rear = 0;
                queue[front] = value;
                System.out.println(value + " is Enqueued");
            }else {
                queue[++rear] = value;
                System.out.println(value + " is Enqueued");
            }
        }
    }

    // Dequeue method
    int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue underflow...! Nothing to dequeue");
            return -1;
        }else {
            int removedValue = queue[front++];
            System.out.println(removedValue + " is Dequeued");
            return removedValue;
        }
    }

    // Peek method
    public int getFront() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }else {
            return queue[front];
        }
    }

    // Display method
    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is already empty");
            return;
        }else {
            System.out.print("Queue items : ");
            for(int i = front ; i <= rear ; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

}