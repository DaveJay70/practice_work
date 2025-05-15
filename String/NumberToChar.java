public class NumberToChar {
    // Method to convert numbers followed by letters into repeated letters
    public static String convert(String input) {

        StringBuilder result = new StringBuilder(); // To store the final result
        int n = input.length(); // Length of the input string

        // Loop through each character in the input string
        for (int i = 0; i < n; i++) {
            char ch = input.charAt(i); // Current character

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the previous character is a digit
                if (i > 0 && Character.isDigit(input.charAt(i - 1))) 
                {
                    // Convert the previous character (digit) to an integer
                    int count = input.charAt(i - 1) - '0';

                    // Append the letter 'count' times to the result
                    for (int j = 0; j < count; j++) 
                    {
                        result.append(ch);
                    }
                } 
                else {
                    // If no digit before the letter, just append the letter once
                    result.append(ch);
                }
            }
        }
        // Return the final converted string
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "3j2a1y5b"; // Example input
        String output = convert(input); // Call the convert method
        System.out.println(output); // Output: abbcccd
    }
}