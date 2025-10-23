
import java.util.Scanner;
public class SafeInput {
    /**
     * Prompts the user for a non-empty string input.
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.isEmpty());

        return retString;
    }

    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getRegExString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print(prompt + ": ");
            retString = pipe.nextLine().trim();
            if (retString.isEmpty()) {
                System.out.println("Please enter a non-empty string.");
            }
        } while (retString.isEmpty());
        return retString;
    }

    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param regEx  the regex pattern to match
     * @return a String that matches the regex pattern
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input = "";
        boolean valid = false;
        do {
            System.out.print(prompt + ": ");
            input = pipe.nextLine().trim();
            if (input.matches(regEx)) {
                valid = true;
            } else {
                System.out.println("Input must match the pattern: " + regEx);
            }
        } while (!valid);
        return input;
    }

    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return an integer value
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.nextLine();
            }
            pipe.nextLine();
        } while (!valid);

        return retVal;
    }

    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt the prompt message for the user
     * @return a valid double value
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double retVal = 0.0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                pipe.next(); // Clear invalid input
            }
            pipe.nextLine(); // Clear the newline
        } while (!valid);

        return retVal;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int lo, int hi) {
        int result = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print("\n" + prompt + " [" + lo + " - " + hi + "]: ");
            if (pipe.hasNextInt()) {
                result = pipe.nextInt();
                pipe.nextLine(); // clear input buffer
                if (result >= lo && result <= hi) {
                    done = true;
                } else {
                    System.out.println("You must enter a value in range [" + lo + " - " + hi + "]: " + result);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an int [" + lo + " - " + hi + "]: " + trash);
            }
        } while (!done);

        return result;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double result = 0.0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + "[" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                result = pipe.nextDouble();
                pipe.nextLine();
                if (result >= low && result <= high) {
                    done = true;
                } else {
                    System.out.println("You must enter a value in range [" + low + " - " + high + "]: " + result);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number [" + low + " - " + high + "]: " + trash);
            }
        } while (!done);

        return result;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        while (true) {
            System.out.print(prompt + " [Y/N]: ");
            String input = pipe.nextLine().trim().toUpperCase();

            if (input.equals("Y")) {
                return true;
            } else if (input.equals("N")) {
                return false;
            }
            System.out.println("Please enter Y or N.");
        }
    }
    public class CtoFTableDisplay {
        public static void main(String[] args) {
            // Print table header
            System.out.println("Celsius to Fahrenheit Conversion Table");
            System.out.println("-------------------------------------");
            System.out.printf("%-10s %-10s%n", "Celsius", "Fahrenheit");
            System.out.println("-------------------------------------");

            // Loop through Celsius values from -100 to 100
            for (int celsius = -100; celsius <= 100; celsius++) {
                double fahrenheit = CtoF(celsius);
                System.out.printf("%-10.1f %-10.1f%n", (double)celsius, fahrenheit);
            }

            System.out.println("-------------------------------------");
        }

        /**
         * Converts a Celsius temperature to Fahrenheit.
         *
         * @param celsius the temperature in Celsius
         * @return the equivalent temperature in Fahrenheit
         */
        public static double CtoF(double celsius) {
            return celsius * 9.0 / 5.0 + 32.0;
        }
    }
}

