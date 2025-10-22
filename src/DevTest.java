import java.util.Scanner;

public class DevTest {
    public static int getRangedInt(Scanner pipe, String prompt, int lo, int hi) {
        int result = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + "[" + lo + " - " + hi + "]: ");
            if (pipe.hasNextInt()) {
                result = pipe.nextInt();
                pipe.nextLine();
                if (result >= lo && result <= hi) {
                    done = true;
                } else {
                    System.out.println("You must enter a value in range [" + lo + " - " + hi + "]: " + result);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must entedr an int [" + lo + " - " + hi + "]: " + trash);
            }
        } while(!done);

        return result;
    }
}
public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
    double retVal = 0.0;
    boolean valid = false;
    String trash = "";
    do {
        System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
        if (pipe.hasNextDouble()) {
            retVal = pipe.nextDouble();
            pipe.nextLine();
            if (retVal >= low && retVal <= high) {
                valid = true;
            } else {
                System.out.println("You must enter a value in range [" + low + " - " + high + "]: " + retVal);
            }
        } else {
            trash = pipe.nextLine();
            System.out.println("You must enter a number [" + low + " - " + high + "]: " + trash);
        }
    } while (!valid);

    return retVal;
}

void main() {
}




