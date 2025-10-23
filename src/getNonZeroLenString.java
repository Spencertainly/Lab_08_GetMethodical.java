import java.util.Scanner;

public class getNonZeroLenString {
    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that isn't empty
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.isEmpty());

        return retString;
    }
    //output
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test getNonZeroLenString
        String name = getNonZeroLenString(scanner, "Enter your name");
        System.out.println("String input: " + name);

        scanner.close();
    }
}