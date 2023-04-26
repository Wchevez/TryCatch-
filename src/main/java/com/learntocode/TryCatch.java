package com.learntocode;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        String[] sayings = {"All that glitters is not gold.",
                "Actions speak louder than words.",
                "Honesty is the best policy.",
                "The pen is mightier than the sword.",
                "If at first you don't succeed, try, try again.",
                "Practice makes perfect.",
                "You can't judge a book by its cover.",
                "The early bird catches the worm.",
                "When in Rome, do as the Romans do.",
                "An apple a day keeps the doctor away."};
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (true) {
            try {
                System.out.print("Enter a number between 1 and 10 (or 0 to exit): ");
                choice = Integer.parseInt(input.nextLine());
                if (choice == 0) {
                    break;
                }
                if (choice < 1 || choice > 10) {
                    throw new IllegalArgumentException("Invalid choice. Please enter a number between 1 and 10 (or 0 to exit).");
                }
                System.out.println(sayings[choice - 1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
        input.close();
        System.out.println("Goodbye!");
    }
}