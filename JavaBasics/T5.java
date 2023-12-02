package org.JavaBasics;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number= sc.nextInt();

        if(number<=1){
            System.out.println("The number "+number+" is not the prime number");
        } else if (number>1&&number%2==0) {
            System.out.println("The number "+number+" is the prime number");

        } else if (number>1&&number%2!=0) {
            System.out.println("The number "+number+" is the prime number");
        }

    }
}
