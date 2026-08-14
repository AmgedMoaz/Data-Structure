// Doubly linked list as data structure

public class DoublyLInkedList {

    // Fields
    Node head;

    // Methods

    // isEmpty method
    public boolean isEmpty() {
        return (head == null);
    }


    // Inert Last method
    public void Append(int element) {
        Node newnode = new Node(element);
        if(isEmpty()) {
            head = newnode;
        }else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newnode;
            newnode.prev = current;
        }
    }


}