// Queue Implementation in C++ with methods for Enqueue(), Dequeue(), isEmpty() and Display()
#include <bits/stdc++.h>
using namespace std;

class Node {
   public:
   int Data;
   Node* Next;
   Node() {
    Data = 0;
    Next = NULL;
   }
};

class Queue {
   public:
   Node* front;
   Node* rear;
   Queue() {
    front = NULL;
    rear = NULL;
   }

   bool isEmpty() {
    if(front == NULL && rear == NULL) {
       return true;
    }else{
         return false;
    }
   }

  void Enqueue() {
    int item;
    cout << "How many items you want to Enqueue : ";
    int n;
    cin >> n;
    for(int i = 0; i < n; i++) {
         cout << "Enter the item to be Enqueued : ";
          cin >> item;
          Node* newnode = new Node();
           newnode->Data = item;
             if(isEmpty()) {
               front = rear = newnode;
                 }else{
                   rear->Next = newnode;
                      rear = newnode;
                   }
       }
}

  void Display() {
    if(isEmpty()) {
        cout << "Queue is Empty" << endl;
    }else{
        Node* Temp;
        Temp = front;
        while(Temp != NULL) {
           cout << Temp->Data << " ";
           Temp = Temp->Next;
        }
        cout << endl;
    }
  }

  void Degueue() {
           if(isEmpty()) {
                cout << "Queue is Empty" << endl;
              }else if(front == rear) {
                delete front;
                front = rear = NULL;
                 } else{
                     Node* dlptr = front;
                    front = dlptr->Next;
                       delete dlptr;          
           }
  }

};
int main () {
   cout << "Hi" << endl;
   Queue ob;
   ob.Enqueue();
   ob.Display();

  cout << "How many items you want to Dequeue : ";
    int n; 
    cin >> n;
    for(int i = 0; i < n; i++) {
    ob.Degueue();
    }
    ob.Display();

    return 0;
}