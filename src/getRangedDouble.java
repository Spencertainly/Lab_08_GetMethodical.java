import java.util.Scanner;

public class getRangedDouble {
    /**
     * @param pipe   a Scanner
     * @param prompt the prompt message
     * @param low    lower range
     * @param high   higher range
     * @return a valid double within the low high range
     */
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
}