// Write a main class for many classes

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Array arr = new Array(8);
        arr.Append(10);
        arr.Append(20);
        arr.Append(30);
        arr.Insert(2,25);
        arr.Append(40);

        System.out.println(arr.getCount());

        arr.Traverse();

        /*
        if(arr.Search(40)){
            System.out.println("Found");
        }else {
            System.out.println("Not found");
        }
         */

        /*
        arr.Delete(2);
        arr.Traverse();
        arr.Delete(0);
        arr.Traverse();
         */

        arr = arr.Enlarge(10);
        arr.Append(50);
        arr.Append(60);
        arr.Append(70);
        arr.Append(80);
        arr.Insert(6,55);

        arr.Traverse();

        int[] other = new int[4];
        other[0] = 90;
        other[1] = 100;
        other[2] = 110;

        arr = arr.Merge(other);

        arr.Traverse();

    }
}