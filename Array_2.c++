   // Search() , Append() and Insert() functions for array implementation in C++
#include <bits/stdc++.h>
using namespace std;

class Array {
    private:
    int Size;
    int Length;
    int *items;

    public:
    Array (int arrSize) {
        Size = arrSize;
        Length = 0;
        items = new int[arrSize];
    }
    void Fill(){
        int num_of_Arr;
        cout << "How many elements do you want to enter? ";
        cin >> num_of_Arr;
        if (num_of_Arr > Size){
            cout << "You can't enter more than " << Size << " elements." << endl;
            return;
        }
        else{
            for (int i = 0; i < num_of_Arr; i++){
                cout << "Enter item  " << i+1 << " : ";
                cin >> items[i];
                Length++;
            }
        }
    }
    void Display(){
        cout << "The elements in the array are: " << "\n";
        for (int i = 0; i < Length; i++){
            cout << items[i] << "\t";
        }
        cout << endl;
    }
    int getSize(){
        return Size;
    }
    int getLength() {
        return Length;
    }
    int Search(int key) {
        int index = -1;
        cout << "Enter the element you want to search: ";
        cin >> key;
        for(int i = 0 ; i < Length ; i++) {
            if(items[i] == key) {
                index = i;
                break;
            }
        } 
        if (index != -1) {
            cout << "Element found at index : " << index << endl;
        } else {
            cout << "Element not found in the array." << endl;
        }
        return index;
    }
    void Append() {
        int newItem;
        cout << "Enter the element you want to append: ";
        cin >> newItem;
        if (Length < Size) {
            items[Length] = newItem;
            Length++;
        } else {
            cout << "Array is full. Cannot append more elements." << endl;
        }
    }
    void Insert() {
        if(Length < Size) {
            int newItem , index;
            cout << "Enter the element you want to insert: ";
            cin >> newItem;
            cout << "Enter the index where you want to insert the element: ";
            cin >> index;
               if(index < Length && index >= 0) {
                  for(int i = Length ; i > index ; i--) {
                      items[i] = items[i-1];
                   }
                    items[index] = newItem;
                       Length++;
                }else {
                       cout << "Invalid index. Please enter an index between 0 and " << Size-1 << "." << endl;
                    }
        } else {
            cout << "Array is full. Cannot insert more elements." << endl;
        }
    }
};

int main () {
    cout << "Enter the size of the array: ";
    int arraySize;
    cin >> arraySize;
    Array ob(arraySize);

    ob.Fill();

    cout << "The size of the array is: " << ob.getSize() << "\t" << "The length of the array is: " << ob.getLength() << endl;
   
    ob.Display();

    // ob.Search(12);

    /*ob.Append();
    ob.Display();*/
   
    /* ob.Insert();
    ob.Display();*/

    return 0;
}