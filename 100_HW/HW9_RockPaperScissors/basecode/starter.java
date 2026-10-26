/*
 *	Author: Ren Bolen
 *  Date: 10/23/2026
*/

import java.util.Scanner;

class starter {
    public static String getObject(){
        int object = (int)(Math.random() * 3 + 1);
        if (object == 1) {
            return "Rock";
        }
        else if (object == 2) {
            return "Paper";
        }
        else {
            return "Scissors";
        }
    }
    public static int compare2(String player1, String player2) {
        boolean win1 = player1.equalsIgnoreCase("rock") && player2.equalsIgnoreCase("scissors");
        boolean win2 = player1.equalsIgnoreCase("paper") && player2.equalsIgnoreCase("rock");
        boolean win3 = player1.equalsIgnoreCase("scissors") && player2.equalsIgnoreCase("paper");
        if (win1 || win2 || win3) {
            return 1;
        }
        else if (player1.equalsIgnoreCase(player2)) {
            return 2;
        }
        else {
            return 3;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        while (true) {
            System.out.println("======================================================================");
            System.out.println("Would you like to play the bot in Rock, Paper, Scissors? (Yes/No/Done)");
            String choice = sc.nextLine();
            while (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no") && !choice.equalsIgnoreCase("done")) {
                System.out.println("Invalid input, try again.");
                choice = sc.nextLine();
            }
            if (choice.equalsIgnoreCase("yes")){
                System.out.println("What would you like to play? (Rock/Paper/Scissors)");
                String play = sc.nextLine();
                String botPlay = getObject();
                int result = compare2(play, botPlay);
                if (result == 1) {
                    System.out.println("The bot played " + botPlay + "!");
                    System.out.println("You won!");
                }
                else if (result == 2) {
                    System.out.println("The bot played " + botPlay + "!");
                    System.out.println("You tied.");
                }
                else if (result == 3) {
                    System.out.println("The bot played " + botPlay + "!");
                    System.out.println("You LOST.");
                }
            }
            if (choice.equalsIgnoreCase("no")) {
                System.out.println("How many times would you like the bots to play each other?");
                int playsNum = sc.nextInt();
                String clear = sc.nextLine();
                int runs = 0;
                int bot1 = 0;
                int bot2 = 0;
                int ties = 0;
                while (runs < playsNum) {
                    int result = compare2(getObject(), getObject());
                    if (result == 1) {
                        bot1++;
                    }
                    else if (result == 2) {
                        ties++;
                    }
                    else {
                        bot2++;
                    }
                    runs++;
                }
                System.out.println("Results");
                System.out.println("bot 1: " + bot1);
                System.out.println("bot 2: " + bot2);
                System.out.println("Tie: " + ties);
            }
            if (choice.equalsIgnoreCase("done")) {
                break;
            }       
        }
        System.out.println();
        System.out.println("Thank you for trying out Rock, Paper, Scissors!");
    }
}
