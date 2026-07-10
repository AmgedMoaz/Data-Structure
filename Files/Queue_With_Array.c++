// Queue Implementation using Array
#include <bits/stdc++.h>
#include <assert.h>
using namespace std;
const int MAX_SIZE = 5;

class Queue {
   int front; // first, head or start of the queue
   int rear;  // last , tail or end of the queue
   int length;
   int arr[MAX_SIZE];
   public:
   Queue() : front(0), rear(MAX_SIZE -1), length(0) {}

   bool isEmpty() {
         return length == 0;
   }

   bool isFull() {
            return length == MAX_SIZE;
   }

   void Enqueue(int element) {
       if(isFull()) {
             cout << "Queue is full cannot enqueue " << element << endl;
       }else {
             rear = (rear + 1) % MAX_SIZE;
             arr[rear] = element;
             length++;  
        }
   }

   void Dequeue() {
         if(isEmpty()) {
                cout << "Queue is empty cannot dequeue" << endl;
         }else {
                front = (front + 1) % MAX_SIZE;
                length--;
         }
   }
     
    // get the front element of the queue by reference
   void getFront(int &element) {    
         assert(!isEmpty());
         element = arr[front];
   }
   
    // get the rear element of the queue by returning the value
   int getrear() {
            assert(!isEmpty());
            return arr[rear];
   }

    int size() {
            return length;
    }

  void Display() {
    assert(!isEmpty());

    cout << "Queue elements: ";

    for(int i = 0; i < length; i++) {
        cout << arr[(front + i) % MAX_SIZE] << " ";
    }

    cout << endl;
}

int Search(int element) {
    assert(!isEmpty());

    for(int i = 0; i < length; i++) {

        int index = (front + i) % MAX_SIZE;

        if(arr[index] == element) {
            return index;
        }
    }

    return -1;
}

};

int main() {
   Queue ob;
   cout << "How many elements you want to enqueue: ";
    int n;
    cin >> n;
    cout << "Enter " << n << " elements to enqueue \n";
    for(int i = 0; i < n; i++) {
        int element;
        cin >> element;
        ob.Enqueue(element);
    }
    ob.Display();
        cout << "Dequeueing elements from the queue" << endl;
        ob.Dequeue();
        ob.Dequeue();

        ob.Enqueue(6);
        ob.Display();
    
        int frontElement = 0;
        ob.getFront(frontElement);
        cout << "Front element of the queue: " << frontElement << endl;
    
        int rearElement = ob.getrear();
        cout << "Rear element of the queue: " << rearElement << endl;
    
        cout << "Size of the queue: " << ob.size() << endl;

        int key;
        cout << "Enter an element to search in the queue: ";
        cin >> key; 
        int index = ob.Search(key);
        if(index != -1) {
            cout << "Element " << key << " found at index: " << index << endl;
        } else {
            cout << "Element " << key << " not found in the queue" << endl;
        }

    return 0;
}