// Write a recursion file that has many examples of recursion expression

import java.util.Scanner;

public class Recursion {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

    }

    // Sum method by recursion
    static int sum(int n) {
        if(n == 1)
            return 1;
        else
            return  n+sum(n-1);
    }

}