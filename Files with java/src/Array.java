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

    // Append method
    void Append(int newItem) {
        if(count == items.length) {
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
            System.out.println(items[i]);
        }
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

}