package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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

    }
}