import java.util.Scanner;

public class GPA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the score from the user.
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        // Calculate the GPA based on the score.
        double gpa;

        if (score >= 80 && score <= 100) {
            gpa = 4.0;
        } else if (score >= 70 && score < 80) {
            gpa = 3.0;
        } else if (score >= 60 && score < 70) {
            gpa = 2.0;
        } else if (score >= 50 && score < 60) {
            gpa = 1.0;
        } else if (score >= 0 && score < 50) {
            gpa = 0.0;
        } else {
            System.out.println("Invalid score.");
            return; // Exit the program if the score is invalid.
        }

        // Print the GPA.
        System.out.println("Your GPA is: " + gpa);
    }
}
