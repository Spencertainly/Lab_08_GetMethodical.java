import java.util.Scanner;

public class getynConfirm {
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
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // output
        boolean result = getYNConfirm(console, "Do you want to continue?");
        System.out.println("You chose: " + (result ? "Yes" : "No"));
    }
}
