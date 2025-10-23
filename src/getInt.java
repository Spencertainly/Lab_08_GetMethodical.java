import java.util.Scanner;
public class getInt {
    /**
     *
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
}