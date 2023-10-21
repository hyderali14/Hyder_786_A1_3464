import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (count < 10) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            sum += number;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}