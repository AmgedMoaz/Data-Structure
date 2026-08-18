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

    // Factorial method by recursion
    public static int factorial(int n) {
        if(n == 1)
            return 1;
        else
            return n*factorial(n-1);
    }

    // Power method by recursion
    static int power(int x , int n) {
        if(n == 0)
            return 1;
        else
            return x*power(x,n-1);
    }

    // Fibonacci method
    public static int fib(int n) {
        if(n <= 1)
            return n;
        else
            return fib(n-1) + fib(n-2);
    }


}