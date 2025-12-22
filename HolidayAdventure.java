import java.util.Scanner;
import java.util.Random;

public class HolidayAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;
        String p1 = "";
        String p2 = "";
        String p3 = "";

        while (playAgain == true) {
            System.out.print("Enter your hero's name: ");
            String heroname = scanner.nextLine().trim();

            int score = 0;

            System.out.println("\nWelcome, " + heroname + "!");
            System.out.println("It's the holiday season, and your mission is to save Christmas.");
            System.out.println("Your starting score is " + score + ".\n");

            System.out.println("Decision 1: You see a snowstorm blocking the road.");
            System.out.println("1) Push through the storm");
            System.out.println("2) Take shelter and wait it out");
            int choice1 = scanner.nextInt();

            if (choice1 == 1) {
                score -= 4;
                System.out.println(heroname + " fights the storm and loses energy.");
            } else if (choice1 == 2) {
                score += 2;
                System.out.println(heroname + " rests safely and feels refreshed.");
            } else {
                System.out.println(heroname + ", choose either 1 or 2! ");
                System.out.println("\nDecision 1: You see a snowstorm blocking the road.");
                System.out.println("1) Push through the storm");
                System.out.println("2) Take shelter and wait it out");
                choice1 = scanner.nextInt();
            }


            System.out.println("\nDecision 2: Santa needs help moving his sled.");
            System.out.println("1) Help Santa push the sled");
            System.out.println("2) Ignore him and try to save Christmas on your own");
            int choice2 = scanner.nextInt();

            if (choice2 == 1) {
                score += 4;
                System.out.println(heroname + " helps Santa push his sled and saves Christmas!");
            } else if(choice2 == 2) {
                score -= 3;
                System.out.println(heroname + " feels a bit bad about leaving Santa behind.");
            } else {
                System.out.println(heroname + ", choose either 1 or 2! ");
                System.out.println("\nDecision 2: Santa needs help moving his sled.");
                System.out.println("1) Help Santa push the sled");
                System.out.println("2) Ignore him and try to save Christmas on your own");
                choice2 = scanner.nextInt();
            }

            System.out.println("\nDecision 3: You encounter the Grinch.");
            System.out.println("1) Try to negotiate");
            System.out.println("2) Challenge the Grinch");
            int choice3 = scanner.nextInt();

            if (choice3 == 1) {
                score += 3;
                System.out.println(heroname + " rations with the Grinch and avoids the fight.");
            } else if (choice3 == 2){
                score -= rand.nextInt(5) + 1; 
                System.out.println(heroname + " fights bravely but gets hurt.");
            } else {
                System.out.println(heroname + ", choose either 1 or 2! ");
                System.out.println("\nDecision 3: You encounter the Grinch.");
                System.out.println("1) Try to negotiate");
                System.out.println("2) Challenge the Grinch");
                choice3 = scanner.nextInt();
            }

            System.out.println("\nFinal score for " + heroname + ": " + score);

            if (choice1 == 1) {
                p1 = (heroname + "chose to push through the storm, ");
            } else if (choice1 == 2) {
                p1 = (heroname + " chose to take shelter and wait out the Snow Storm, ");
            }

            if (choice2 == 1) {
                p2 = ("then you chose to helps Santa push his sled, ");
            } else if (choice1 == 1) {
                p2 = ("then you chose to ignore Santa and save Christmas on your own, ");
            }

            if (choice3 == 1) {
                p3 = ("lastly you chose to negotiate with the Grinch.");
            } else if (choice3 == 2) {
                p3 = ("then you chose to Challenge the Grinch.");
            }            

            System.out.println("\n" + p1 + p2 + p3);

            if (score <= 0) {
                System.out.println("\n" + heroname.toUpperCase() + " has fallen. Christmas is lost...");
            } else if (score >= 6) {
                System.out.println("\nAmazing! " + heroname.toUpperCase() + " saves Christmas and becomes a holiday legend!");
            } else {
                System.out.println("\n" + heroname.toUpperCase() + " died and we never knew what happened to Christmas.");
            }

            System.out.print("\nWould you like to play again? (yes/no): ");
            scanner.nextLine();
            String answer = scanner.nextLine().toLowerCase();

            playAgain = answer.equals("yes");
            System.out.println();
        }

        System.out.println("Thanks for playing the Holiday Adventure!");
        scanner.close();
    }
}
