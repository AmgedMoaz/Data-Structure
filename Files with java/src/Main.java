// Write a main class for many classes

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Array arr = new Array(5);
        arr.Append(10);
        arr.Append(20);
        arr.Append(30);
        arr.Append(40);
        arr.insert(2,25);
        arr.Append(50);

        System.out.println(arr.getCount());

        arr.Traverse();

        if(arr.Search(40)){
            System.out.println("Found");
        }else {
            System.out.println("Not found");
        }

    }
}