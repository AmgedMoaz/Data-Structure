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
        }else if(position < 0) {
            System.out.println("The position can't be negative");
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

    // ال Garbage collector اللي موجود في java هيقوم لوحده بحذف ال node اللي مبقاش فيه pointer يشاور عليها اوتماتيكيا من الميموري
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
            // if head data == element
            if(head.next == null) {
                head = null;
            }else {
                Node current = head;
                while(current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
        }
    }

    // Delete specific element
    public void DeleteSpecificElement(int element) {
        if(isEmpty()) {
            System.out.println("The Linked List is already empty");
            return;
        }else {
            // if head data == element
            if(head.data == element) {
                DeleteFirst();
            }else {
                Node current = head;
                while(current.next != null && current.next.data != element) {
                    current = current.next;
                }
                if(current.next == null) {
                    System.out.println("The element you entered is not found");
                    return;
                }else {
                    current.next = current.next.next;
                }
            }
        }
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

    // Count method
    public int Count() {
        int count = 0;
        if(isEmpty()) {
            return count;
        }else {
            Node current = head;
            while(current != null) {
                current = current.next;
                count++;
            }
            return count;
        }
    }

    // Search method
    public boolean Search(int key) {
        Node current = head;
        while(current != null) {
            if(current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Merge method
    public void Merge(SingleLinkedList list2) {
        // list2 == null   mean that the list2 isn't pointing to any object  (SingleLinkedList list2;  not  SingleLinkedList list2 = new SingleLinkedList())
        // list2.isEmpty() mean that the list2 is empty
        if(list2 == null || list2.isEmpty()) {
            return;
        }else if(head == null) {
            head = list2.head;
        }else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = list2.head;
        }
    }

}