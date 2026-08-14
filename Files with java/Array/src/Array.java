// Array as a data structure

public class Array {

    // Field
    private int[] items;
    private int count;

    // Array with size
    Array(int size) {
        items = new int[size];
        count = 0;
    }

    // Getter
    public int getCount() {
        return count;
    }

    // isFull method
    boolean isFull() {
        return (count == items.length);
    }

    // isEmpty
    boolean isEmpty() {
        return (count == 0);
    }

    // Append method
    void Append(int newItem) {
        if(isFull()) {
            System.out.println("Sorry , You can't add new item");
            return;
        }else {
            //الطريقة الاولي
            items[count] = newItem;
            count++;
            // الطريقة الثانية
            // items[count++] = newItem;
        }
    }

    // Traverse method
    void Traverse() {
        if(isEmpty()) {
            System.out.println("The array is already empty");
            return;
        }else {
            for(int i = 0 ; i < count ; i++) {
                System.out.print(items[i] + " ");
            }
            System.out.println();
        }
    }

    // Search method
    boolean Search(int key) {
        if(isEmpty()) {
            System.out.println("The array is already empty");
        }else {
            for(int i = 0 ; i < count ; i++) {
                if(items[i] == key) {
                    return true;
                }
            }
        }
        return false;
    }

    // Insert method
    void Insert(int positon , int newItem) {
        if(isFull()) {
            System.out.println("Sorry , You can't add new item");
            return;
        }else {
            for(int i = count ; i > positon ; i--) {
                items[i] = items[i-1];
            }
            items[positon] = newItem;
            count++;
        }
    }

    // Delete method
    void Delete(int index) {
        if(isEmpty()) {
            System.out.println("The array is already empty");
            return;
        }else {
            for(int i = index ; i < count-1 ; i++) {
                items[i] = items[i+1];
            }
            count--;
        }
    }

    // Shape 1 Enlarge method
    /*
    int[] Enlarge(int newSize) {
        if(newSize > items.length) {
            int[] newArray = new int[newSize];
            for(int i = 0 ; i < count ; i++) {
                newArray[i] = items[i];
            }
            return newArray;
        }else {
            return items;
        }
    }
     */

    // Shape 2 Enlarge method by more OOP
    Array Enlarge(int newSize) {
        if(newSize > items.length) {
            Array newArray = new Array(newSize);
            for(int i = 0 ; i < count ; i++) {
                newArray.items[i] = this.items[i];
            }
            newArray.count = this.count;
            return newArray;
        }else {
            return this;
        }
    }

    // Shape 1 Merge method
    /*
    int[] Merge(int[] other) {
        int[] mergedArray = new int[count+other.length];
        int index = 0;
        for(int i = 0 ; i < count ; i++,index++) {
            mergedArray[index] = items[i];
        }
        for(int j = 0 ; j < other.length ; j++,index++) {
            mergedArray[index] = other[j];
        }
        return mergedArray;
    }
     */

    // Shape 2 Merge method by more OOP
    Array Merge(int[] other) {
        Array mergedArray = new Array(count + other.length);
        int index = 0;
        for(int i = 0 ; i < count ; i++,index++) {
            mergedArray.items[index] = this.items[i];
        }
        for(int j = 0 ; j < other.length ; j++,index++) {
            mergedArray.items[index] = other[j];
        }
        mergedArray.count = count + other.length;
        return mergedArray;
    }

}