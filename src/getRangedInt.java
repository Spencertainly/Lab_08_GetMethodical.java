import java.util.Scanner;

public class getRangedInt {
    public static String getRangedInt(Scanner pipe, String prompt) {
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
    }