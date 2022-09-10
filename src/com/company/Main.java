package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide the price of the meal:");

        double meal = scanner.nextDouble();

        System.out.println("Enter value in percentage of the tip:");

        double tipPercentage = scanner.nextDouble();

        double tip = tipPercentage / 10;

        double value = meal + tip;

        System.out.println("tip amount is " + tip + " to pay " + value + " euro");

    }
}
