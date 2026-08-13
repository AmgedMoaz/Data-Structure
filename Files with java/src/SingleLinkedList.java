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

    }

    // Delete first element
    public void DeleteFirst() {

    }

    // Delete last element
    public void DeleteLast() {

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