// Queue Implementation in C++ with methods for getFront(), getRear(), Search(), Count() and Clear().
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

  int getFront() {
    if(isEmpty()) {
        cout << "Queue is Empty" << endl;
        return  -1;
    } else {
        return front->Data;
    }
  }

  int getRear() {
    if(isEmpty()) {
        cout << "Queue is Empty" << endl;
        return -1;
    } else {
        return rear->Data;
    }
  }

  int Count() {
    int counter = 0;
    if(isEmpty()) {
        cout << "Queue is Empty" << endl;
        return counter;
    } else {
        Node* Temp = front;
        while(Temp != NULL) {
            counter++;
            Temp = Temp->Next;
        }
        return counter;
    }
  }

  bool Search() {
    cout << "Enter the item you want to search : ";
    int value;
    cin >> value;
      if(isEmpty()) {
        cout << "Queue is Empty" << endl;
        return false;
      }else{
        Node* Temp = front;
         while(Temp != NULL) {
            if(Temp->Data == value) {
                    cout << "Item found in the queue." << endl;
                return true;
            }
            Temp = Temp->Next;
         }
         cout << "Item not found in the queue." << endl;
         return false;
      }
  }

  void Clear() {
    if(isEmpty()) {
        cout << "Queue is Empty" << endl;
    }else{
         while(!isEmpty()) {
            Degueue();
         }
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

   cout << "Front element: " << ob.getFront() << endl;
    cout << "Rear element: " << ob.getRear() << endl;
    cout << "Number of elements: " << ob.Count() << endl;
    ob.Search();
    cout << "Clearing the queue ? Yes or Not" << endl;
    string choice;
    cin >> choice;
    if(choice == "Yes" || choice == "yes") {
         ob.Clear();
    } else {
        cout << "Queue is not cleared." << endl;
    }
     ob.Display();
    
    return 0;
}