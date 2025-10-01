import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variables
        boolean valid;
        double width = 0;
        double length = 0;
        double area;
        double perimeter;
        double diagonal;

        // Ask the user for the width of the rectangle and checks if it is valid if not asks the user again
        do {
            valid = false;
            System.out.println("What is the width of the rectangle?");

            if (scan.hasNextDouble()) {
                width = scan.nextDouble();

                if (width >= 0) {
                    valid = true;
                } else {
                    System.out.println("Invaild number, please try again.");
                }

            } else {
                System.out.println("Invaild number, please try again.");
            }
            scan.nextLine(); //Clears Scanner
        } while (!valid);

        // Ask the user for the length of the rectangle and checks if it is valid if not asks the user again
        do {
            valid = false;
            System.out.println("What is the width of the rectangle?");

            if (scan.hasNextDouble()) {
                length = scan.nextDouble();

                if (length >= 0) {
                    valid = true;
                } else {
                    System.out.println("Invaild number, please try again.");
                }

            } else {
                System.out.println("Invaild number, please try again.");
            }
            scan.nextLine(); //Clears Scanner
        } while (!valid);

        //Calculates the area, perimeter, and diagonal of the lengths and widths of the rectangle.
        area = width*length;
        perimeter = 2*(width+length);
        diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));

        // Prints out Width, Length, area, perimeter, and diagonal of the rectangle.
        System.out.printf("%-10s%20.2f", "Width:", width);
        System.out.printf("\n%-10s%20.2f", "Length:", length);
        System.out.printf("\n%-10s%20.2f", "Area:", area);
        System.out.printf("\n%-10s%20.2f", "Perimeter:", perimeter);
        System.out.printf("\n%-10s%20.2f", "Diagonal:", diagonal);
    }
}
