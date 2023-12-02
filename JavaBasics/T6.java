package org.JavaBasics;

public class T6 {
    public static void main(String[] args) {

        int num1 = 0;
        int numNext = 1;

        for (int i = 0; i < 10; i++) {
            System.out.print(num1 + " ");

            int  numFollow= num1 + numNext;
            num1 = numNext;
            numNext = numFollow;
        }

    }
}
