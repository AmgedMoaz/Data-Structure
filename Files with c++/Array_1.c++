   // create() , Fill() , Display() , getSize() , getLength() functions for array implementation in C++
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
};

int main () {
    cout << "Enter the size of the array: ";
    int arraySize;
    cin >> arraySize;
    Array ob(arraySize);

    ob.Fill();

    cout << "The size of the array is: " << ob.getSize() << "\t" << "The length of the array is: " << ob.getLength() << endl;
   
    ob.Display();

    return 0;
}