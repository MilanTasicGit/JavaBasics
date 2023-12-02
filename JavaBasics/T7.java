package org.JavaBasics;

public class T7 {
    public static void main(String[] args) {

        int[] numbers = {3, 8, 7, 11, 38, 24, 60, 0, 17};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Max number in the array is " + max);
        System.out.println("Min number in the array is " + min);

    }
}
