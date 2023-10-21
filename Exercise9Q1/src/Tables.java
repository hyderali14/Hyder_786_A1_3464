import java.util.Scanner;

public class Tables {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of tables to print
        System.out.print("Enter the number of tables to print: ");
        int numTables = scanner.nextInt();

        // Print the tables
        for (int i = 2; i <= numTables; i++) {
            System.out.println("Table of " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + " * " + i + " = " + (j * i));
            }
            System.out.println();
        }
    }
}