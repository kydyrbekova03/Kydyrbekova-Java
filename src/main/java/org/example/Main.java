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


        }

    }

