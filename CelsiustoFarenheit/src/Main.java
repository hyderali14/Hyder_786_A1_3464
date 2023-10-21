import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the Celsius temperature from the user.
        System.out.print("Enter the Celsius temperature: ");
        double celsius = scanner.nextDouble();

        // Convert the Celsius temperature to Fahrenheit.
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Print the Fahrenheit temperature.
        System.out.println("The Fahrenheit temperature is: " + fahrenheit);
    }
}
