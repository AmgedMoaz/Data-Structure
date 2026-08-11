// Binary Search Tree (BST) Implementation in C++ Creation , Insertion and Traversal (Preorder, Inorder and Postorder)
#include <bits/stdc++.h>
using namespace std;

class Node {
    public:
    int Data;
    Node *Left;
    Node *Right;
    Node() {
       Data = 0;
       Left = NULL;
       Right = NULL;
    }
};

class BST {
    public:
    Node *Root;
    BST() {
        Root = NULL;
    }

    Node* Insert(Node* pnode , int item) {
        if(pnode == NULL) {
            Node* newnode = new Node();
            newnode->Data = item;
            pnode = newnode;
        }else if(item < pnode->Data) {
            pnode->Left = Insert(pnode->Left , item);
        }else{
            pnode->Right = Insert(pnode->Right , item);
        }
        return pnode;
    }

    void Insert(int item) {
        Root = Insert(Root , item);
    }

   void Preorder(Node* pnode) { // Root -> Left -> Right
        if(pnode == NULL) {
            return;
        }
        cout << pnode->Data << "\t";
        Preorder(pnode->Left);
        Preorder(pnode->Right);
   }

   void Inorder(Node* pnode) { // Left -> Root -> Right
         if(pnode == NULL) {
            return;
         }
         Inorder(pnode->Left);
         cout << pnode->Data << "\t";
         Inorder(pnode->Right);
   }

   void Postorder(Node* pnode) { // Left -> Right -> Root
        if(pnode == NULL) {
            return;
        }
        Postorder(pnode->Left);
        Postorder(pnode->Right);
        cout << pnode->Data << "\t";
   }
};

int main () {
   cout << "Hi" << endl;
        BST ob;
        cout << "How many elements do you want to insert?" << endl;
        int n;
        cin >> n;
        cout << "Enter the elements you want to insert" << endl;
        for(int i = 0 ; i < n ; i++) {
         int item;
            cin >> item;
            ob.Insert(item);
        }
    
        cout << "\nDisplay or Traverse Tree in Preorder, Inorder and Postorder Traversal" << endl << endl;
        ob.Preorder(ob.Root);
        cout << "\n--------------------------------------------------------------------\n";
        ob.Inorder(ob.Root);
        cout << "\n--------------------------------------------------------------------\n";
        ob.Postorder(ob.Root);
        cout << "\n--------------------------------------------------------------------\n" << endl;

    return 0;
}