package org.JavaBasics;

public class T9 {
    public static void main(String[] args) {

        int[] numbers = {3, 8, 97, -11, 52, 17, 0, -3};

        int maxNumb = numbers[0];
        int secondMax = numbers[1];

        if (maxNumb < secondMax) {
            int temp = maxNumb;
            maxNumb = secondMax;
            secondMax = temp;
        }
        for (int number : numbers) {
            if (number > maxNumb) {
                secondMax = maxNumb;
                maxNumb = number;
            } else if (number > secondMax && number != maxNumb) {
                secondMax = number;
            }
        }
        System.out.println("The second largest number in the array is: " + secondMax);
    }
}

