// Write a class to show meaning of hash map

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        HashMap <Integer,String> students = new HashMap<>();
        students.put(1001, "Ahmed");
        students.put(1002, "Ali");
        students.put(1003, "Omar");


        System.out.println(students.get(1002));

        System.out.println(students.containsKey(1003));

        students.remove(1001);

    }
}