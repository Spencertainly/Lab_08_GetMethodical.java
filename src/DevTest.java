
public class DevTest {
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
