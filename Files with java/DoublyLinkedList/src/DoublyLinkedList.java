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


}