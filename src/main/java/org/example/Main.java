package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 7, 17, 21, 33, 64, 77};

        Scanner enteredNum = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int number = enteredNum.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }

        Scanner greeting = new Scanner(System.in);
        System.out.println("Enter the name: ");

        String name = greeting.nextLine();
        if (name.equals("Вячаслав")) {
            System.out.println("Привет, Вячаслав");
        } else {
            System.out.println("Нет такого имени");
        }

        System.out.println("Цифры кратные 3м: ");
        for(int n : array){
            if(n%3==0){
                System.out.println(n);
            }
        }
    }
}