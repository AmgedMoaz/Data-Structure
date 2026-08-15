public class Stack {

    // Fields
    private int maxSize;
    private int top;
    private int[] stackArray;

    // Overloading constructor
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[size];
        top = -1;
    }

    // Methods

    // isEmpty method
    public boolean isEmpty() {
        return (top == -1);
    }

    // isFull method
    public boolean isFull() {
        return (top == maxSize-2);
    }

    // Push method
    public void push(int value) {
        if(isFull()) {
            System.out.println("Stack overflow! Can't push " + value);
        }else {
            stackArray[++top] = value;  // equals to  [ top++;  stackArray[top] = value;]
            System.out.println(value + " is pushed to stack");
        }
    }

    // Pop method
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack underflow! Stack is empty");
            return -1;
        }else {
            int poppedValue = stackArray[top--];  // equals to  [int poppedValue = stackArray[top];  top--;]
            return poppedValue;
        }
    }

    // Top method
    public int top() {
        if(isEmpty()) {
            System.out.println("Stack is already empty");
            return -1;
        }else {
            return stackArray[top];
        }
    }




}
