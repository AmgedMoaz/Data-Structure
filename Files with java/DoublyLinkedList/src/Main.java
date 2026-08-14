// Write a main class for Doubly linked list class

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        DoublyLinkedList list1 = new DoublyLinkedList();

        list1.append(10);
        list1.append(20);
        list1.append(30);
        list1.append(40);

        list1.traverseForward();
        list1.traverseBackward();


    }
}