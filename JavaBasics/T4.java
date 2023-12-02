package org.JavaBasics;

public class T4 {
    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 8;

        System.out.println("Before swap the numbers were: num1 = " + num1 + ", num2 = " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapp the numbers are: num1 = " + num1 + ", num2 = " + num2);
    }
}
