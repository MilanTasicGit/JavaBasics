package org.JavaBasics;

public class T2 {
    public static void main(String[] args) {

        int[] numbers={3,8,11,23,38};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
        }
        System.out.println("The sum or all stored numbers in the array is "+sum);
    }
}
