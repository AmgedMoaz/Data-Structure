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
        for(int i = 0 ; i < items.length ; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }

    // Search method
    boolean Search(int key) {
        for(int i = 0 ; i < count ; i++) {
            if(items[i] == key) {
                return true;
            }
        }
            return false;
    }

    // Insert method
    void insert(int positon , int newItem) {
        if(isFull()) {
            System.out.println("Sorry , You can't add new item");
        }else {
        for(int i = count ; i > positon ; i--) {
            items[i] = items[i-1];
        }
        items[positon] = newItem;
        }
    }

}