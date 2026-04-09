package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        int regular = 1;
        int large = 2;
        double regularPrice = 5.45;
        double largePrice = 8.95;
        String isStudent = "T";
        String isSenior = "T";

        Scanner shopScanner  = new Scanner(System.in);

        System.out.println("Welcome to sandwich shop!");

        System.out.println("What is your name?: ");
        String name = shopScanner.nextLine();

        System.out.println("Hi " + name + "! " + "What size sandwich would you like? Type (1) for regular or (2) for large:");
        int number = shopScanner.nextInt();
        shopScanner.nextLine();

        System.out.println("Are you a Student? If YES type (T) if NO type (F)");
        String type = shopScanner.next();


        if (type.equals("1") && isStudent.equalsIgnoreCase("T")) {
            System.out.println("You get a regular sandwich and a 10% discount!");
        }else if (type.equals("2") && isSenior.equalsIgnoreCase("T")) {
            System.out.println("You get a regular sandwich and a 20% discount!");
        }

    }
}
