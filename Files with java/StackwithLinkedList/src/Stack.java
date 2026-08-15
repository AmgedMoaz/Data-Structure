// Write a Stack class by linked list

public class Stack {

    // Fields
    Node top;


    // Overloading constructor
    public Stack(int size) {
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
        System.out.print(value + "is pushed in stack");
    }




}