import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variables
        double gallonsOfGas = 0;
        double milesPerGallon = 0;
        double pricePerGallon = 0;
        boolean valid;
        double costPerHundredMiles;
        double HowFarCarCanGo;

        // Checks if user input for gallons of gas if valid and if not asks again
        do {
            valid = false;
            System.out.println("How many gallons are in the tank?");

            if (scan.hasNextDouble()) {
                gallonsOfGas = scan.nextDouble();

                if (gallonsOfGas >= 0) {
                    valid = true;
                } else {
                    System.out.println("Invaild number, please try again.");
                }

            } else {
                System.out.println("Invaild number, please try again.");
            }

            scan.nextLine(); //Clears Scanner

        } while (!valid);

        // Checks if user input for the MPG if valid and if not asks again
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

            scan.nextLine(); //Clears Scanner

        } while (!valid);

        // Checks if user input for the price of gas if valid and if not asks again
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

            scan.nextLine(); //Clears Scanner

        } while (!valid);

        //Calculates the cost per 100 miles
        costPerHundredMiles = (100/milesPerGallon) * pricePerGallon;
        //Calculates how far the car can go currently
        HowFarCarCanGo = gallonsOfGas * milesPerGallon;
        //Prints out both cost per 100 miles and how far the car can go currently
        System.out.printf("%-20s%30.2f", "Cost per 100 miles is:", costPerHundredMiles);
        System.out.printf("\n%-20s%20.2f", "The distance left in the car is:", HowFarCarCanGo);
    }
}
