// Linked List as a data structure

public class SingleLinkedList {

    // Field
    Node head;

    // Methods

    // Check is empty or not
    public boolean isEmpty() {
        return (head == null);
    }

    // Insert first method
    public void InsertFirst(int element) {
        Node newnode = new Node(element);
        if(isEmpty()) {
            head = newnode;
        }else {
            newnode.next = head;
            head = newnode;
        }
    }

    // Insert last method
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
        }
    }

    // Insert at position method
    public void InsertAtPosition(int element , int position) {
        if(position == 0 ) {
            InsertFirst(element);
            return;
        }else {
            Node newnode = new Node(element);
            int index = 0;
            Node current = head;
            // Traverse to position just before the specific position
            while(current != null && index < position-1) {
                current = current.next;
                index++;
            }
            if(current == null) {
                System.out.println("Position is out of bounds..!");
                return;
            }
            newnode.next = current.next;
            current.next = newnode;
        }
    }

    // Delete first element
    public void DeleteFirst() {
        if(isEmpty()) {
            System.out.println("The Linked List is already empty");
            return;
        }else {
            head = head.next;
        }
    }

    // Delete last element
    public void DeleteLast() {
        if(isEmpty()) {
            System.out.println("The Linked List is already empty");
            return;
        }else {
            Node current = head;
            while(current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    // Delete specific element
    public void DeleteSpecificElement(int element) {

    }

    // Display or Travers method
    public void Traverse() {
        if(isEmpty()) {
            System.out.println("The Linked List is empty");
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






}