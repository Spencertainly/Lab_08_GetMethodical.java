import java.util.Scanner;

public class getRegExString {
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
            System.out.print(prompt + ": ");
            retString = pipe.nextLine().trim();
            if (retString.isEmpty()) {
                System.out.println("Please enter a non-empty string.");
            }
        } while (retString.isEmpty());
        return retString;
    }

    /**
     * Prompts the user for a string that matches the provided regex pattern.
     *
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
}