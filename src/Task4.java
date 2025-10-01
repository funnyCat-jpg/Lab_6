import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variables
        boolean valid;
        int magicNum = (int)(Math.random() * 10) + 1;
        int playerGuess = 0;

        // Asks the User for a number, id not valid asks again.
        do {
            valid = false;
            System.out.println("Enter a number between 1-10:");

            if (scan.hasNextInt()) {
                playerGuess = scan.nextInt();

                if (playerGuess >= 1 && playerGuess <= 10) {
                    valid = true;
                } else {
                    System.out.println("Invaild number, please try again.");
                }

            } else {
                System.out.println("Invaild number, please try again.");
            }

            scan.nextLine(); //Clear Scanner

        } while (!valid);

        // Tells the user if their number is lower, higher or actually the magic number.
        if (playerGuess < magicNum) {
            System.out.println("My number was " + magicNum + ".");
            System.out.println("Your guess was too low.");
        } else if (playerGuess > magicNum) {
            System.out.println("My number was " + magicNum + ".");
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("My number was " + magicNum + ".");
            System.out.println("You got it right!");
        }
    }
}
