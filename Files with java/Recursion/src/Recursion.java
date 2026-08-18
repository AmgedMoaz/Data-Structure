// Write a recursion file that has many examples of recursion expression

import java.util.Scanner;

public class Recursion {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the number : ");
        int n = input.nextInt();

        System.out.println("Sum of numbers from 1 to " + n + " : " + sum(n));

        System.out.println("Factorial of number " + n + " : " + factorial(n));

    }

    // Sum method by recursion
    static int sum(int n) {
        if(n == 1)
            return 1;                // base case
        else
            return  n+sum(n-1);    // recursive case
    }

    // Factorial method by recursion
    public static int factorial(int n) {
        if(n == 1)
            return 1;                      // base case
        else
            return n*factorial(n-1);     // recursive case
    }

    // Power method by recursion
    static int power(int x , int n) {
        if(n == 0)
            return 1;                      // base case
        else
            return x*power(x,n-1);       // recursive case
    }

    // Fibonacci method
    public static int fib(int n) {
        if(n <= 1)
            return n;                         // base case
        else
            return fib(n-1) + fib(n-2);  // recursive case
    }

}