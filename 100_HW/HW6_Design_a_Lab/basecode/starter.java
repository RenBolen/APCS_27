/*
 *	Author: Ren Bolen
 *  Date: October 1, 2026
 */

import java.util.*;

public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("====================");
        System.out.println("| Guess the Number |");
        System.out.println("====================");            
        System.out.print("Type a number: ");
        int num1 = sc.nextInt();
        System.out.print("Type another number: ");
        int num2 = sc.nextInt();
        int greater = Math.max(num1, num2);
        int smaller = Math.min(num1, num2);
    
        int number = (int)(Math.random() * (greater - smaller) + smaller);
        System.out.println("Guess the number from " + num1 + " to " + num2 + ".");
        System.out.println();
        int guessnum = 5;
        System.out.println("You have " + guessnum + " guesses remaining.");
        int guess = sc.nextInt();
        boolean higherLower = guess > number;
        
        if (guess != number) {
            if (guess < smaller || guess > greater) {
                System.out.println("This is a bad guess and is not in the possible range.");
                System.out.println("Please try another number.");
                guess = sc.nextInt();
            }
        }
        if (guess != number) {
            System.out.println();
            higherLower = guess > number;
            if (higherLower) {
            System.out.println("The number is lower than your guess.");
            }
        if (!higherLower) {
            System.out.println("The number is higher than your guess.");
            }
            guessnum--;
            System.out.println("You have " + guessnum + " guesses remaining.");
            guess = sc.nextInt();
        }
       if (guess != number) {
            if (guess < smaller || guess > greater) {
                System.out.println("This is a bad guess and is not in the possible range.");
                System.out.println("Please try another number.");
                guess = sc.nextInt();
            }
        }
        if (guess != number) {
            System.out.println();
            higherLower = guess > number;
            if (higherLower) {
                System.out.println("The number is lower than your guess.");
            }
            if (!higherLower) {
                System.out.println("The number is higher than your guess.");
            }
            guessnum--;
            System.out.println("You have " + guessnum + " guesses remaining.");
            guess = sc.nextInt();
        }
        if (guess != number) {
            if (guess < smaller || guess > greater) {
                System.out.println("This is a bad guess and is not in the possible range.");
                System.out.println("Please try another number.");
                guess = sc.nextInt();
            }
        }
        if (guess != number) {
            System.out.println();
            higherLower = guess > number;
            if (higherLower) {
                System.out.println("The number is lower than your guess.");
            }
            if (!higherLower) {
                System.out.println("The number is higher than your guess.");
            }
            guessnum--;
            System.out.println("You have " + guessnum + " guesses remaining.");
            guess = sc.nextInt();
        }
      if (guess != number) {
            if (guess < smaller || guess > greater) {
                System.out.println("This is a bad guess and is not in the possible range.");
                System.out.println("Please try another number.");
                guess = sc.nextInt();
            }
        }
        if (guess != number) {
            System.out.println();
            higherLower = guess > number;
            if (higherLower) {
                System.out.println("The number is lower than your guess.");
            }
            if (!higherLower) {
                System.out.println("The number is higher than your guess.");
            }
            guessnum--;
            System.out.println("You have " + guessnum + " guess remaining.");
            guess = sc.nextInt();
        }
       if (guess != number) {
            if (guess < smaller || guess > greater) {
                System.out.println("This is a bad guess and is not in the possible range.");
                System.out.println("Please try another number.");
                guess = sc.nextInt();
            }
        }
        if (guess == number) {
            System.out.println();
            System.out.println("You are correct! The answer was " + number + ".");
        }
         if (guess != number) {
            System.out.println();
            System.out.println("You have run out of guesses. The correct number was " + number + ".");
        }
        
    }
}
