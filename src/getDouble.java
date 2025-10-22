import java.util.Scanner;
public class getDouble {
        /**
         * Prompts the user for a double value, validating input and clearing the scanner.
         *
         * @param pipe a Scanner opened to read from System.in
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

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String prompt = "Enter a number (e.g., 3.14)";
            double number = getDouble(scanner, prompt);
            System.out.println("You entered: " + number);
            scanner.close();
        }
    }
