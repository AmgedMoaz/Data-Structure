// Write a main class for Stack class with array

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Stack ob = new Stack(6);
        ob.push(12);
        ob.push(12);
        ob.push(2004);

        System.out.println("After pop " + ob.pop());

        System.out.println("Top is : " + ob.top());

    }
}