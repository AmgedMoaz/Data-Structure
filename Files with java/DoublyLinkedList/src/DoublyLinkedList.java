// Doubly linked list as data structure

public class DoublyLinkedList {

    // Fields
    Node head;

    // Methods

    // isEmpty method
    public boolean isEmpty() {
        return (head == null);
    }

    // Inert Last method
    public void append(int element) {
        Node newnode = new Node(element);
        if(isEmpty()) {
            head = newnode;
            return;
        }else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newnode;
            newnode.prev = current;
        }
    }

    // Insert first method
    public void insertFirst(int element) {
        Node newnode = new Node(element);
        if (isEmpty()) {
            head = newnode;
            return;
        }else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }

    // Insert at position method
    public void insertAtPosition(int element , int position) {
        if(position < 0) {
            System.out.println("The position can't be negative");
            return;
        }else if(position == 0) {
            insertFirst(element);
            return;
        }else if(position == count()) {
            append(element);
            return;
        }else if (position > count()) {
            System.out.println("The position is out of bounds..!");
            return;
        }else {
            Node newnode = new Node(element);
            int index = 0;
            Node current = head;
            while(index < position-1) {
                current = current.next;
                index++;
            }
                newnode.next = current.next;
                current.next.prev = newnode;
                newnode.prev = current;
                current.next = newnode;
        }
    }

    // Traverse forward method
    public void traverseForward() {
        if(isEmpty()) {
            System.out.println("Sorry ,the list is empty");
            return;
        }else {
            Node current = head;
            while(current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    // Traverse backward
    public void traverseBackward() {
        if(isEmpty()) {
            System.out.println("Sorry ,the list is empty");
            return;
        }else {
            Node current = head;
            // Go to the last node
            while(current.next != null) {
                current = current.next;
            }
            // Traverse backward
            while(current != null) {
                System.out.print(current.data + " ");
                current = current.prev;
            }
            System.out.println();
        }
    }

    // Count method
    public int count() {
        int count = 0;
        Node current = head;
        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Delete first method
    public void deleteFirst() {
        if(isEmpty()) {
            System.out.println("The list is already empty");
            return;
        }else if(head.next == null) {
            head = null;
        }else {
            head = head.next;
            head.prev = null;
        }
    }

    // Delete last method
    public void deleteLast() {
        if(isEmpty()) {
            System.out.println("The list is already empty");
            return;
        }else if(head.next == null) {
            head = null;
        }else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.prev.next = null;
        }
    }


}