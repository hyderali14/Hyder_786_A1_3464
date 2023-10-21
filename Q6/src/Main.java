import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a real number
        System.out.println("Enter a real number:");

        // Read the input from the user
        double x = scanner.nextDouble();

        // Test if x belongs to the set I
        boolean belongsToI = (x > 2 && x < 3) || (x >= 0 && x <= 1) || (x >= -10 && x <= -2);

        // Print the appropriate message
        if (belongsToI) {
            System.out.println("x belongs to I");
        } else {
            System.out.println("x does not belong to I");
        }
    }
}