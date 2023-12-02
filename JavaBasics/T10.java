package org.JavaBasics;

public class T10 {
    public static void main(String[] args) {

        String[] cars = {"bmw","audi","vw","bmw","toyota","vw"};
        for (int i = 0; i < cars.length-1; i++) {
            for (int j = i+1; j < cars.length; j++) {
                if(cars[i].equals(cars[j])){
                    System.out.println(cars[i]);
                }
            }
        }
    }
}
