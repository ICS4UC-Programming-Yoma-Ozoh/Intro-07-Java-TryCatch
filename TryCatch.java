import java.util.Scanner;

/**

 * This program asks the user for the radius of a circle

 * and calculates the volume.

 * @author Yoma Ozoh

 * @version 1.0

 * @since 2026-09-15

 */

public final class TryCatch {

    /**

     * This is a private constructor used to satisfy the

     * style checker.

     *

     * @exception IllegalStateException Utility class

     * @see IllegalStateException

     */

    private TryCatch() {

        throw new IllegalStateException("utility class");

    }



    /**

     * This is the main method.

     *

     * @param args Unused

     */

    public static void main(final String[] args) {

        // Welcome the user

        System.out.println("Welcome, we will be calculating the"
        + "volume of a sphere");

        System.out.print("Enter the radius of the sphere (cm): ");



        // Using the scanner to get the input from user

        final Scanner scanner = new Scanner(System.in);

        final String radstring = scanner.nextLine();


        try {

            // Convert the string to a double

            final double radDouble = Double.parseDouble(radstring);



            // If radius is negative, tell the user

            if (radDouble <= 0) {

                System.out.println("The radius cannot be negative.");

            } else {

                // Calculate the volume

                final double volume = (4.0 / 3.0) * Math.PI
                * Math.pow(radDouble, 3);



                // Display the area, rounded to 2 decimal places

                System.out.print("The volume of a sphere with radius, ");

                System.out.print(radstring + "cm, is ");

                System.out.format("%.2f", volume);

                System.out.println("cm^3.");

            }

        } catch (NumberFormatException e) {

            System.out.println("Invalid input. Please enter a valid radius.");

        }

        // Closing Scanner

        scanner.close();

    }

}
