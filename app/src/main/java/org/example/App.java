package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factorizer factorizer = new Factorizer();
        int chosenInteger;
        while (true) {
            System.out.println("please enter a integer you would like to find the prime numbers for, or enter -100 to end the program");
            chosenInteger = scanner.nextInt();
            if (chosenInteger == -100) {
                break;
            } else
                System.out.println("the prime factors of " + chosenInteger + " are" + factorizer.primeFactors(chosenInteger));
        }
    }
}
