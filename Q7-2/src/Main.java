import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.println("Enter number:");
            int num = scanner.nextInt();
            sum += num;
            count++;
            System.out.println("Do you want to continue? (yes/no)");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        }
        double average = (double) sum / count;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }
}