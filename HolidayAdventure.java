import java.util.Scanner;
import java.util.Random;

public class HolidayAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;

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
            } else {
                score += 2;
                System.out.println(heroname + " rests safely and feels refreshed.");
            }


            System.out.println("\nDecision 2: Santa needs help moving his sled.");
            System.out.println("1) Help Santa push the sled");
            System.out.println("2) Ignore him and try to save Christmas on your own");
            int choice2 = scanner.nextInt();

            if (choice2 == 1) {
                score += 4;
                System.out.println(heroname + " helps Santa push his sled and saves Christmas!");
            } else {
                score -= 3;
                System.out.println(heroname + " feels a bit bad about leaving Santa behind.");
            }

            System.out.println("\nDecision 3: You encounter the Grinch.");
            System.out.println("1) Try to negotiate");
            System.out.println("2) Challenge the Grinch");
            int choice3 = scanner.nextInt();

            if (choice3 == 1) {
                score += 3;
                System.out.println(heroname + " rations with the Grinch and avoids the fight.");
            } else {
                score -= rand.nextInt(5) + 1; 
                System.out.println(heroname + " fights bravely but gets hurt.");
            }

            System.out.println("\nFinal score for " + heroname + ": " + score);

            if (score <= 0) {
                System.out.println(heroname.toUpperCase() + " has fallen. Christmas is lost...");
            } else if (score >= 6) {
                System.out.println("Amazing! " + heroname + " saves Christmas and becomes a holiday legend!");
            } else {
                System.out.println(heroname + " died and we never knew what happened to Christmas.");
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
