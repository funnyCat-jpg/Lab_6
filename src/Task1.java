import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variables
        double celsius = 0;
        double fahrenheit;
        boolean cValid = false;


        do {
            System.out.println("Please enter the temperature in degrees C to be converted to degrees F: ");

            if(scan.hasNextDouble()) {
                celsius = scan.nextDouble();
                cValid = true;
            } else {
                System.out.println("Invalid temperature, please try again.");
            }

            scan.nextLine();

        } while (!cValid);

        fahrenheit = ((double) 9 /5)*celsius+32;
        System.out.printf("%-15s%1.2f", "Degrees C:", celsius);
        System.out.printf("\n%-15s%1.2f", "Degrees F:", fahrenheit);
    }
}
