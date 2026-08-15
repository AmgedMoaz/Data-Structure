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
            stackArray[top++] = value;  // equals to  stackArray[top] = value;  top++;
            System.out.println(value + " is pushed to stack");
        }
    }



}
