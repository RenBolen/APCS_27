import java.util.Random;
import java.util.Scanner;
import pkg.*;

class starter {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int area = 0;
      String areaString = "";
      String advancedRuleChoice = "";
      System.out.println("⬜⬜⬜   ⬜⬜⬜  ⬜      ⬜  ⬜  ⬜⬜⬜        ⬜⬜⬜  ⬜⬜⬜  ⬜      ⬜  ⬜⬜⬜");
      System.out.println("⬜  ⬜   ⬜      ⬜⬜    ⬜  ⬜  ⬜          ⬜        ⬜  ⬜  ⬜⬜  ⬜⬜  ⬜");
      System.out.println("⬜⬜⬜   ⬜⬜⬜  ⬜  ⬜  ⬜      ⬜⬜⬜      ⬜  ⬜⬜  ⬜⬜⬜  ⬜  ⬜  ⬜  ⬜⬜⬜");
      System.out.println("⬜   ⬜  ⬜      ⬜    ⬜⬜          ⬜      ⬜    ⬜  ⬜  ⬜  ⬜      ⬜  ⬜");
      System.out.println("⬜   ⬜  ⬜⬜⬜  ⬜      ⬜      ⬜⬜⬜        ⬜⬜    ⬜  ⬜  ⬜      ⬜  ⬜⬜⬜");
      System.out.println("=================================================================================");
      System.out.println("Rules");
      System.out.println(" - Try to survive for 50 days");
      System.out.println(" - Have 50 foood and a cabin by the end of the 50 days");
      System.out.println(" - Every day you can hunt or gather, build and craft, get materials, explore, or skip");
      System.out.println(" - Unlikely events can set you back");
      System.out.println("=================================================================================");
      System.out.println("Would you like to see the Advanced rules? (Yes/No/y/n)");
      while (!advancedRuleChoice.equalsIgnoreCase("Yes") && !advancedRuleChoice.equalsIgnoreCase("Y") && !advancedRuleChoice.equalsIgnoreCase("No") && !advancedRuleChoice.equalsIgnoreCase("N")) {
         advancedRuleChoice = sc.nextLine();
         if (advancedRuleChoice.equalsIgnoreCase("Yes") || advancedRuleChoice.equalsIgnoreCase("Y")) {
            System.out.println("=================================================================================");
            System.out.println("Advanced Rules");
            System.out.println(" - You will chose an area to live in (Forest, Savanna, Jungle)");
            System.out.println("       Forest: More materials, Normal food, More rain, Normal predators");
            System.out.println("       Savanna: Less materials, Most food, Low rain, Most predators");
            System.out.println("       Jungle: Most materials, More food, Most rain, More predators");
            System.out.println(" - \"Good\" attributes");
            System.out.println("       Material and Food amounts to build and survive");
            System.out.println("       Chances of getting them can increase with crafting of items");
            System.out.println(" - \"Bad\" events");
            System.out.println("       Predator attacks (Damage shelter/Eat food) can be stopped by better shelters");
            System.out.println("       Rain (Gathering material/Hunting chances down) Traps not affected");
            System.out.println("       Storms (Skips day) Traps not affected");
            System.out.println();
         }
         else if (advancedRuleChoice.equalsIgnoreCase("No") && advancedRuleChoice.equalsIgnoreCase("N")) {

         }
         else {
            System.out.println("Invalid. Please enter Yes or No.");
         }
      }
      
      System.out.println("What area would you like to play in? (Forest, Savanna, Jungle)");
      while (!areaString.equalsIgnoreCase("Forest") && !areaString.equalsIgnoreCase("Savanna") && !areaString.equalsIgnoreCase("Jungle")){
         areaString = sc.nextLine();
         if (areaString.equalsIgnoreCase("Forest")) {
            area = 1;
         }
         else if (areaString.equalsIgnoreCase("Savanna")) {
            area = 2;
         }
         else if (areaString.equalsIgnoreCase("Jungle")) {
            area = 3;
         }
         else {
            System.out.println("Invalid choice, please try again. (Forest, Savanna, Jungle)");
         }
      }
      BaseClass game = new BaseClass(area);
      int gameLength = 50;
      System.out.println("Every day you can eat or skip.");
      game.printArea(area);      
      while (game.getDays() <= gameLength && game.getHunger() > 0) {
         System.out.println("Day " + game.getDays());
         System.out.print("Action: ");
         String action = sc.nextLine();
         if (action.equalsIgnoreCase("Skip")) {
            System.out.println("Hunger: " + game.getHunger());
         }
         else if (action.equalsIgnoreCase("eat")) {
            System.out.print("Eat (1-10): ");
            int eatNum = sc.nextInt();
            String clear = sc.nextLine();
            game.addHunger(eatNum);
            System.out.println("Hunger: " + game.getHunger());
         }
         System.out.println();
         game.addDays(1);
         game.addHunger(-1);
      }
   }
}
