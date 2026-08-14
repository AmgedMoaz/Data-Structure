// Write a main class for Single linked list class

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();
        list.Traverse();

        list.Append(10);
        list.Append(20);
        list.Append(30);
        list.Append(40);
        list.Traverse();

        list.InsertFirst(5);
        list.Traverse();

        list.InsertAtPosition(15,2);
        list.InsertAtPosition(25,4);
        list.Traverse();

        list.DeleteFirst();
        list.Traverse();

        list.DeleteLast();
        list.Traverse();

        list.DeleteSpecificElement(60);
        list.Traverse();

        System.out.println(list.Count());

        if(list.Search(15)) {
            System.out.println("is found");
        }else {
            System.out.println("not found");
        }

        SingleLinkedList list2 = new SingleLinkedList();
        list2.Append(40);
        list2.Append(50);
        list2.Append(60);
        list.Merge(list2);
        list2.Traverse();
        list.Traverse();

    }
}