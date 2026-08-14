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

        System.out.println(list1.count());

        list1.insertFirst(5);
        list1.traverseForward();

        list1.insertAtPosition(15,2);
        list1.traverseForward();

        list1.deleteFirst();
        list1.traverseForward();

        list1.deleteLast();
        list1.traverseForward();

        list1.deleteSpecificElement(15);
        list1.traverseForward();

    }
}