// Write a class Queue with linked list

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Queue list = new Queue();
        list.enqueue(10);
        list.enqueue(20);
        list.enqueue(30);
        list.enqueue(40);
        list.display();

        list.dequeue();
        System.out.println("Peek item is : " + list.peek());

        System.out.println("Number of items in Queue is : " + list.count());

    }
}