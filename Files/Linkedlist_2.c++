 // insertBefore() and insertLast() or Append() in Linked List
#include <bits/stdc++.h>
using namespace std;

class Node {
  public:
   int Data;
   Node* Next;
};

class Linkedlist {
    public:
    Node* head;

    Linkedlist(){
        head = NULL;
    }

     bool isEmpty() {
         return (head == NULL);
     }

     void insertFirst(int newValue) {
         Node* newNode = new Node();
         newNode->Data = newValue;
         if(isEmpty()) {
             newNode->Next = NULL;
             head = newNode;
            } else {
                newNode->Next = head;
                head = newNode;
            }
     }

     void Display() {
            Node* Temp = head;
            while(Temp != NULL) {
                cout << Temp->Data << " ";
                Temp = Temp->Next;
            }
     }

     int Count() {
         int counter = 0;
         Node* Temp = head;
            while(Temp != NULL) {
                counter++;
                Temp = Temp->Next;
            }
            return counter;
     } 

     bool isFound(int key){
        bool found = false;
        Node* Temp = head;
        while(Temp != NULL) {
            if(Temp->Data == key)
            {
                found = true;
                break;
             }
             Temp = Temp->Next;
            }
            return found;
        }

        void insertBefore(int item , int newValue) {
         Node* newNode = new Node();
         newNode->Data = newValue;
         Node* Temp = head;
         if(isEmpty()) {
               cout << "List is already empty U can't insert before any item" << endl;
         }
         else {
            if(isFound(item)) {
                if(Temp->Data == item) {
                  insertFirst(newValue);
                  return;
                 }else {
             while(Temp->Next!= NULL && Temp->Next->Data != item) {
                 Temp = Temp->Next;
             }
             newNode->Next = Temp->Next;
             Temp->Next = newNode;
            }
        }
            
            else {
                cout << "Item is not found in the list U can't insert before it" << endl;
            }
        }
    }

    void Append(int newValue) {
           if(isEmpty()) {
                insertFirst(newValue);
                } else {
                    Node* newNode = new Node();
                    newNode->Data = newValue;
                    newNode->Next = NULL;
                    Node* Temp = head;
                    while(Temp->Next != NULL) {
                         Temp = Temp->Next;
                    }
                    Temp->Next = newNode;
                }   
            }
        
};
int main () {
    Linkedlist list;
    list.isEmpty() ? cout << "List is empty\n" : cout << "List is not empty\n";
    cout << "Enter Numbers U want to insert: " << endl;
    int n;
    cin >> n;
    int item;
    for(int i = 1 ; i <= n ; i++){
        cout << "Enter Item U want to insert first"<< endl;
        cin >> item;
        list.insertFirst(item);
    }
    cout << "List is: " ;
    list.Display();
    cout << endl;

    cout << "\nNumber of items in the list is: " << list.Count() << endl;
    cout << "Enter the number U want to search: " << endl;
    int key;
    cin >> key;
    list.isFound(key) ? cout << "Item is found in the list\n" : cout << "Item is not found in the list\n";

        cout << "Enter the number U want to insert before: " << endl;
        cin >> item;
        cout << "Enter the number U want to insert: " << endl;
        int newValue;
        cin >> newValue;
        list.insertBefore(item , newValue);
        cout << "List is: ";
        list.Display();
        cout <<"\n";

        cout << "Enter the number U want to insert at the end of the list: " << endl;
        cin >> newValue;
        list.Append(newValue);
        cout << "List is: ";
        list.Display();
        cout <<"\n";

    return 0;
}