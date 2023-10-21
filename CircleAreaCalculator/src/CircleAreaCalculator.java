import java.util.Scanner;

public class CircleAreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();

        // Calculate the area of the circle
        double area = Math.PI * radius * radius;

        // Print the area of the circle
        System.out.println("The area of the circle is: " + area);
    }
}