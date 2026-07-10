#include <iostream>
using namespace std;

const int MAX_SIZE = 100;

template <class t>   // Template class for stack to allow different data types

class Stack {
    t top;
    t items[MAX_SIZE];
    public:
    Stack() {
        top = -1;
    }
    void Push(t element) {
        if(top == MAX_SIZE - 1) {
            cout << "Stack overflow" << endl;
        }else {
            top++;
            items[top] = element;
        }
    }\

    bool isEmpty() {
       return top < 0;
    }

   void Pop() {
        if(isEmpty()) {
            cout << "Stack underflow" << endl;
          }else {
            top--;
             }
        }

    void getTop(t &stackTop) {
        if(isEmpty()) {
            cout << "Stack is empty" << endl;
        }else {
            stackTop = items[top];
        }
    }  
    
    void Display() {
        if(isEmpty()){
            cout << "Stack is empty" << endl;
        }else {
            cout << "\nStack elements \n\n[";
            for(int i = top; i >= 0; i--) {
                cout << items[i] << " ";
            }
            cout << "]";
            cout << endl;
        }
    }

};

int main() {
    Stack<int> ob;
    ob.Push(5);
    ob.Push(10);
    ob.Push(15);
    ob.Push(20);
    ob.Display();

    int x;
    ob.getTop(x);
    cout << "Top element: " << x << endl;

    ob.Pop();
    ob.Display();

    ob.Push(7);
    ob.Display();

    return 0;
}