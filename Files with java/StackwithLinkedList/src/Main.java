// Write a main class for Stack class with linked list

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Stack list = new Stack();
        list.pop();

        list.push(10);
        list.push(20);
        list.push(30);
        list.display();

        list.pop();
        list.display();

        System.out.print("Value in top : " + list.peek());

    }
}