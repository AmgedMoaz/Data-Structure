// Write a Stack class by linked list

public class Stack {

    // Fields
    Node top;

    // Overloading constructor
    public Stack() {
        top = null;
    }

    // Methods

    // isEmpty method
    public boolean isEmpty() {
        return (top == null);
    }

    // Push method
    public void push(int value) {
        Node newnode = new Node(value);
        if(isEmpty()) {
            top = newnode;
        }else {
            newnode.next = top;
            top = newnode;
        }
        System.out.println(value + " is pushed in stack");
    }

    // Pop method
    int pop() {   // equals to [ public int pop() {} ]
        if(isEmpty()) {
            System.out.println("Stack is already empty");
            return -1;
        }else {
            int poppedValue = top.data;
            top = top.next;
            return poppedValue;
        }
    }

    // Top method
    public int peek() {
        if (isEmpty()) {
            System.out.print("Stack is already empty");
            return -1;
        }else {
            return top.data;
        }
    }

    // Display method
    void display() {
        if(isEmpty()) {
            System.out.print("Stack is already empty");
        }else {
            Node current = top;
            System.out.print("Stack items : ");
            while(current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

}