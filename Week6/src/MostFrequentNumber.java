import java.util.Arrays;

public class MostFrequentNumber {

    public static void main(String[] args) {
        int[] arr = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7};
        int mostFrequentNumber = findMostFrequentNumber(arr);
        System.out.println("The most frequently occurring number is " + mostFrequentNumber);
    }

    private static int findMostFrequentNumber(int[] arr) {
        // Sort the array to group the same numbers together.
        Arrays.sort(arr);

        int mostFrequentNumber = arr[0];
        int currentNumber = arr[0];
        int currentFrequency = 1;
        int maxFrequency = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == currentNumber) {
                currentFrequency++;
            } else {
                if (currentFrequency > maxFrequency) {
                    maxFrequency = currentFrequency;
                    mostFrequentNumber = currentNumber;
                }
                currentNumber = arr[i];
                currentFrequency = 1;
            }
        }

        // Check the last group of numbers.
        if (currentFrequency > maxFrequency) {
            mostFrequentNumber = currentNumber;
        }

        return mostFrequentNumber;
    }
}
