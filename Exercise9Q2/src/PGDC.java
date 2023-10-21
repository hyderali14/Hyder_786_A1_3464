import java.util.Scanner;

public class PGDC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the two numbers from the user
        System.out.print("Enter a positive number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter another positive number: ");
        int num2 = scanner.nextInt();

        // Find the largest common divisor using Euclid's algorithm
        int gcd = gcd(num1, num2);

        // Print the result
        System.out.println("The largest common divisor of " + num1 + " and " + num2 + " is " + gcd);
    }

    private static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        return num1;
    }
}