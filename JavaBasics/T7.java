package org.JavaBasics;

public class T7 {
    public static void main(String[] args) {

        int n = 10;

        System.out.println("First " + n + " numbers in the Fibonacci series:");

        int num1 = 0;
        int num2 = 1;

        for (int i = 1; i <= n; ++i) {
            System.out.print(num1 + " ");

            int numNext = num1 + num2;
            num1 = num2;
            num2 = numNext;
        }
    }
}
