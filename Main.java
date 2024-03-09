package com.coderscampus;

import java.util.Random;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		playGame();
	}

		public static void playGame() {
	        Random random = new Random();
	        int secretNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
	        int attempts = 0;
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Number Guessing Game!");

	        while (attempts < 5) {
	            System.out.print("Pick a number between 1 and 100: ");
	            String input = scanner.nextLine();

	            try {
	                int guess = Integer.parseInt(input);

	                if (guess < 1 || guess > 100) {
	                    System.out.println("Your guess is not between 1 and 100, please try again.");
	                } else if (guess < secretNumber) {
	                    System.out.println("Please pick a higher number.");
	                } else if (guess > secretNumber) {
	                    System.out.println("Please pick a lower number.");
	                } else {
	                    System.out.println("You win!");
	                    return;
	                }

	                attempts++;	
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input. Please enter an integer.");
	            }
	        }

	        System.out.println("You lose! The number to guess was: " + secretNumber);
	    }
		
	}


