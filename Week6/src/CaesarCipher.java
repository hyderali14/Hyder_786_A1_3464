public class CaesarCipher {
    public static void main(String[] args) {
        // Define the input text and the shift value
        String text = "HELLO WORLD";
        int shift = 4;

        // Call the caesarCipher method to encrypt the text
        String encodedText = caesarCipher(text, shift);

        // Print the encrypted text
        System.out.println("Encoded Text: " + encodedText);
    }

    public static String caesarCipher(String text, int shift) {
        // Initialize a StringBuilder to store the encrypted text
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the input text
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            // Check if the character is an uppercase letter
            if (Character.isUpperCase(character)) {
                // Calculate the new index after shifting and wrap around if needed
                int newIndex = (character - 'A' + shift) % 26;

                // Append the encrypted character to the result
                result.append((char) ('A' + newIndex));
            }
            // Check if the character is a lowercase letter
            else if (Character.isLowerCase(character)) {
                // Calculate the new index after shifting and wrap around if needed
                int newIndex = (character - 'a' + shift) % 26;

                // Append the encrypted character to the result
                result.append((char) ('a' + newIndex));
            }
            // If the character is not a letter, keep it unchanged
            else {
                result.append(character);
            }
        }

        // Convert the StringBuilder to a string and return the encrypted text
        return result.toString();
    }
}
