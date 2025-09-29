import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variables
        double gallonsOfGass;
        double milesPerGallon;
        double pricePerGallon;
        boolean valid = false;
        double costPerHundredMiles;
        double HowFarCarCanGo;

        do {
            System.out.println("How many gallons are in the tank?");

            if (scan.hasNextDouble()) {
                gallonsOfGass = scan.nextDouble();

                if (gallonsOfGass >= 0) {
                    valid = true;
                } else {
                    System.out.println("Invaild number, please try again.");
                }

            } else {
                System.out.println("Invaild number, please try again.");
            }

            scan.nextLine();

        } while (!valid);

        do {
            valid = false;
            System.out.println("What is the fuel efficiency in miles per gallon?");

            if (scan.hasNextDouble()) {
                milesPerGallon = scan.nextDouble();

                if (milesPerGallon > 0) {
                    valid = true;
                } else {
                    System.out.println("Invaild number, please try again.");
                }

            } else {
                System.out.println("Invaild number, please try again.");
            }

            scan.nextLine();

        } while (!valid);

        do {
            valid = false;
            System.out.println("What is the price per gallon?");

            if (scan.hasNextDouble()) {
                pricePerGallon = scan.nextDouble();

                if (pricePerGallon > 0) {
                    valid = true;
                } else {
                    System.out.println("Invaild number, please try again.");
                }

            } else {
                System.out.println("Invaild number, please try again.");
            }

            scan.nextLine();

        } while (!valid);

        costPerHundredMiles =
        HowFarCarCanGo =
        System.out.printf();
    }
}
