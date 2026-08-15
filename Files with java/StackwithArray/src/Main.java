// Write a main class for Stack class with array

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Stack arr = new Stack(6);
        arr.push(12);
        arr.push(12);
        arr.push(2004);
        arr.display();

        System.out.println("After pop " + arr.pop());
        arr.display();

        System.out.println("Top is : " + arr.top());

    }
}