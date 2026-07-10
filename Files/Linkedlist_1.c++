 // C++ program to demonstrate linked list and its operations like insertFirst() , Display() , Count() and isFound()
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
};
int main () {
    Linkedlist list;
    list.isEmpty() ? cout << "List is empty\n" : cout << "List is not empty\n";
    cout << "Enter Numbers U want to insert: " << endl;
    int n;
    cin >> n;
    for(int i = 1 ; i <= n ; i++){
        cout << "Enter Item U want to insert first"<< endl;
        int item;
        cin >> item;
        list.insertFirst(item);
    }
    cout << "List is: ";
    list.Display();

   cout << "\nNumber of items in the list is: " << list.Count() << endl;
    cout << "Enter the number U want to search: " << endl;
    int key;
    cin >> key;
    list.isFound(key) ? cout << "Item is found in the list\n" : cout << "Item is not found in the list\n";
    
    return 0;
}