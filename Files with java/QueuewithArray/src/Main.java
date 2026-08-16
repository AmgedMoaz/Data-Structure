// Write a main class for Queue class with array

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Queue arr = new Queue(6);

        if(arr.isEmpty())
            System.out.println("Is empty");
        else
            System.out.println("Not");

        arr.enqueue(10);
        arr.enqueue(20);
        arr.enqueue(30);
        arr.enqueue(40);
        arr.enqueue(50);
        arr.enqueue(60);
        arr.enqueue(70);

        if(arr.isFull())
            System.out.println("Is full");
        else
            System.out.println("Not yet");

        System.out.println(arr.getFront());
        arr.display();

        arr.dequeue();
        arr.dequeue();
        arr.display();

    }
}