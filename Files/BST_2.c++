// Binary Search Tree (BST) Implementation in C++ Searching ,findMin() ,findMax() and Deleting methods .
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

   Node* Search(Node* pnode , int key) {
       if(pnode == NULL) {
              return NULL;
       }else if(pnode->Data == key) {
              return pnode;
       }else if(key < pnode->Data) {
                return Search(pnode->Left , key);
       }else {
                return Search(pnode->Right , key);
       }
   }

   bool Search(int key) {
    Node* result = Search(Root , key);
     if(result == NULL) {
        return false;
     }else {
        return true;
     }
   }

   Node* findMin(Node* pnode) {
     if(pnode == NULL) {
         return NULL;
         }else if(pnode->Left == NULL) {
              return pnode;
             }else {
                return findMin(pnode->Left);
                }
   }
   
    Node* findMax(Node* pnode) {
      if(pnode == NULL) {
            return NULL;
            }else if(pnode->Right == NULL) {
                  return pnode;
                 }else {
                 return findMax(pnode->Right);
                 }
    }

    Node* Delete(Node* pnode , int key) {
        if(pnode == NULL) {
            return NULL;
        }else if(key < pnode->Data) {
            pnode->Left = Delete(pnode->Left , key);

        }else if(key > pnode->Data) {
            pnode->Right = Delete(pnode->Right , key);
        }else {
            if(pnode->Left == NULL && pnode->Right == NULL) {
                 delete pnode;
                 pnode = NULL;
                }else if(pnode->Left != NULL && pnode->Right == NULL) {
                   pnode->Data = pnode->Left->Data;
                     delete pnode->Left ;
                       pnode->Left = NULL;
                    }else if(pnode->Left == NULL && pnode->Right != NULL) {
                        pnode->Data = pnode->Right->Data;
                          delete pnode->Right;
                          pnode->Right = NULL;
                      }else {
                        Node* predecessor = findMax(pnode->Left);
                        pnode->Data = predecessor->Data;
                        pnode->Left = Delete(pnode->Left, predecessor->Data);

                        /*
                        Node* succesor = findMin(pnode->Right);
                        pnode->Data = succesor->Data;
                        pnode->Right = Delete(pnode->Right, succesor->Data);
                        */ 
                      }
                      return pnode;
    }
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

        cout << "Enter the element you want to search" << endl;
         int key;
         cin >> key;
         if(ob.Search(key)) {
            cout << "Element is found in the tree" << endl;
         }else {
            cout << "Element is not found in the tree" << endl;
         }

         Node* min = ob.findMin(ob.Root);
         if(min == 0) { // 0 = NULL
            cout << "Tree is empty" << endl;
         }else {
            cout << "Minimum element in the tree is : " << min->Data << endl;
         }

         Node* max = ob.findMax(ob.Root);
         if(max == 0) { // 0 = NULL
            cout << "Tree is empty" << endl;
         }else { 
            cout << "Maximum element in the tree is : " << max->Data << endl;
         }
            cout << "Enter the element you want to delete" << endl;
            int delkey;
            cin >> delkey;
            Node* result = ob.Delete(ob.Root , delkey);
            cout << "\nDisplay or Traverse Tree in Preorder Traversal after deleting " << delkey << "\n\n";
            ob.Preorder(ob.Root);

    return 0;
}