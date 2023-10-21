import java.util.Scanner;

public class NumberProperties {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a whole number
        System.out.println("Enter a whole number:");

        // Read the input from the user
        int number = scanner.nextInt();

        // Check if the number is positive, negative, or zero
        String positivity = number > 0 ? "positive" : (number < 0 ? "negative" : "zero");

        // Check if the number is odd or even
        String parity = number % 2 == 0 ? "even" : "odd";

        // Print the output in one line
        System.out.println("The number is " + positivity + " and " + parity);
    }
}