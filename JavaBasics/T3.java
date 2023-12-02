package org.JavaBasics;

public class T3 {
    public static void main(String[] args) {

        int[][] numbers={
                {1, 8, 3},
                {8, 11, 34},
                {7, 0, 25}
        };
        int sumEven=0;
        int sumOdd=0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    sumEven=sumEven+numbers[i][j];
                }
                if(numbers[i][j]%2!=0){
                    sumOdd=sumOdd+numbers[i][j];
                }
            }
        }
        System.out.println("The sum of Even numbers is "+sumEven);
        System.out.println("The sum of Odd numbers is "+sumOdd);
    }
}
