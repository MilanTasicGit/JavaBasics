package org.JavaBasics;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int weekDays=7;
        double[] temp=new double[weekDays];

        for (int i = 0; i < weekDays; i++) {
            System.out.println("Enter the temperature for the day "+(i+1)+" ");
            temp[i]=sc.nextDouble();
        }

        double tempHigh=temp[0];
        double tempLow=temp[0];

        for(int i=1;i<weekDays;i++){
            if (temp[i]>tempHigh){
                tempHigh=temp[i];
        }
            if (temp[i]<tempLow){
                tempLow=temp[i];
            }
        }
        System.out.println("The highest temp of the week is "+tempHigh);
        System.out.println("The lowest temp of the week is "+tempLow);
    }
}
