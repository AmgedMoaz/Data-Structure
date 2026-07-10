// Stack Implementation in C++ with methods for Push(), Pop(), isEmpty() and Display()
#include <bits/stdc++.h>
using namespace std;

class Node {
    public:
    int Data;
    Node* Next;
    Node(){
        Data = 0;
        Next = NULL;
    }
};

class Stack  {
    public:
    Node* top;
    Stack() {
        top = NULL;
    }

    bool isEmpty() {
        return (top == NULL);
    }
   
    void Push() {
        cout << "How many times do you want to push : ";
        int times;
        cin >> times;
        for(int i = 0; i < times; i++) {
            cout << "Enter item to push : ";
            int item;
            cin >> item;
            Node* newNode = new Node();
            newNode->Data = item;
            if(isEmpty()) {
                newNode->Next = NULL;
                top = newNode;
            }else {
                newNode->Next = top;
                top = newNode;
            }
        }
    }
    int Pop() {
        if(isEmpty()) {
            cout << "Stack is empty" << endl;
            return -1;
        }else {
            cout << "How many times do you want to pop : ";
            int times;
            cin >> times;
            int value;
            for(int i = 0; i < times; i++) {
                value = top->Data;
                Node* delptr = top;
                top = top->Next;
                delete delptr;
            }
            return value;
        }

    }
    void Display() {
       if(isEmpty()) {
           cout << "Stack is empty" << endl;
       }else{
             Node* Temp = top;
             while(Temp != NULL) {
                    cout << Temp->Data << " ";
                    Temp = Temp->Next;
             }
             cout << endl;
       }
    }

};
int main() {
   cout << "Hi !" << endl;
   Stack ob;

  
   ob.Push();
   ob.Display();

   ob.Pop();
   ob.Display();
      

    return 0;
}