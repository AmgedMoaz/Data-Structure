// Implement of Doubly Linked List in C++
#include <bits/stdc++.h>
using namespace std;

class Node {
  public:
  int Data;
  Node* Next;
  Node* Prev;

  Node() {
    Data = 0;
    Next = NULL;
    Prev = NULL;
  }
};

 class DoublyLinkedList {
      // by default private
    Node *Head;
    Node *Tail;
    int size;

  public:
  DoublyLinkedList() {
    Head = NULL;
    Tail = NULL;
    size = 0;
  }

  ~DoublyLinkedList() {
    Node *temp = Head;
    while(Head != NULL) {
        Head = Head->Next;
        delete temp;
        temp = Head;
    }
  }

    void insertFirst() {
    cout << "Enter the data to insert at first: ";
    int element;
    cin >> element;

    Node *newNode = new Node();
    newNode->Data = element;

    if(Head == NULL) {
        newNode->Next = NULL;
        newNode->Prev = NULL;
        Head = Tail = newNode;
    }else {
            newNode->Next = Head;
            newNode->Prev = NULL;
            Head->Prev = newNode;
            Head = newNode;
       }
       size++;
    }

    void insertLast() {
        cout << "Enter the data to insert at last: ";
        int element;
        cin >> element;

        Node *newNode = new Node();
        newNode->Data = element;

        if(Head == NULL) {
            newNode->Next = NULL;
            newNode->Prev = NULL;
            Head = Tail = newNode;
        }else {
                newNode->Next = NULL;
                newNode->Prev = Tail;
                Tail->Next = newNode;
                Tail = newNode;
           }
         size++;
    }

    void insertAtPosition(int position) {
        if(position < 0 || position > size) {
            cout << "Invalid position!" << endl;
            return;
        } else if(position == 0) {
            insertFirst();
        } else  if(position == size) {
            insertLast();
        }else {
        cout << "Enter the data to insert at position " << position << ": ";
        int element;
        cin >> element;

        Node *newNode = new Node();
        newNode->Data = element;

        Node *temp = Head;
        for(int i = 1; i < position ; i++) {
            temp = temp->Next;
        }

        newNode->Next = temp->Next;
        newNode->Prev = temp;
        temp->Next->Prev = newNode;
        temp->Next = newNode;

        size++;
      }
    }

    void display() {
        if(Head == NULL) {
            cout << "List is empty!" << endl;
            return;
           }else {
   
             Node *temp = Head;
             cout << "Doubly Linked List: ";
              while(temp != NULL) {
                cout << temp->Data << " ";
                temp = temp->Next;
             }
            cout << endl;
        }
}

    void deleteFirst() {
        if(size == 0) {
            cout << "List is empty!" << endl;
            return;
        }else if(size == 1) {
            Node *temp = Head;
            Head = Tail = NULL;
            delete temp;
            size--;
        }else {
            Node *temp = Head;

            Head = Head->Next;
            Head->Prev = NULL;
            delete temp;
            size--;
        }
    }

    void deleteLast() {
          if(size == 0) {
            cout << "List is empty!" << endl;
            return;
        }else if(size == 1) {
            Node *temp = Head;
            Head = Tail = NULL;
            delete temp;
            size--;
        }else {
            Node *temp = Tail;
            Tail = Tail->Prev;
            Tail->Next = NULL;
            delete temp;
            size--;
        }
    }

    void deleteElement(int element) {
      if(size == 0) {
        cout << "List is empty!" << endl;
        return;
      }else if(element == Head->Data) {
        deleteFirst();  
      }else if(element == Tail->Data) {
        deleteLast();
      }else {
        Node *temp = Head;
        while(temp != NULL && temp->Data != element) {
            temp = temp->Next;
        }

        if(temp == NULL)
        {
           cout << "Element not found!" << endl;
           return;
        }

        temp->Prev->Next = temp->Next;
        temp->Next->Prev = temp->Prev;
        delete temp;
        size--;
      }
    }   

    void reverseDisplay() {
      if(size == 0) {
        cout << "List is empty!" << endl;
        return;
      }else {
        Node *temp = Tail;
        cout << "Doubly Linked List in reverse order: ";
        while(temp != NULL) {
            cout << temp->Data << " ";
            temp = temp->Prev;
        }
        cout << endl;
      }
    }

    int getSize() {
        return size;
    }

};

int main() {
    DoublyLinkedList ob;
    ob.insertFirst();
    ob.insertFirst();
    ob.insertLast();
    ob.insertLast();
    ob.insertAtPosition(2);
    ob.display();


   //  cout << "After deleting first and last node: " << endl;
   /* ob.deleteFirst();
    ob.deleteLast();*/
    ob.deleteElement(7);
    ob.display();

    ob.reverseDisplay();
    cout << "Size of the list: " << ob.getSize() << endl;

    return 0;
}