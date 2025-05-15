public class StringFunctionsExample {
    public static void main(String[] args) {
        String originalString = "Hello, Java World!";
        
        // Slicing the string using substring() function
        String slicedString = originalString.substring(7, 13); // Extracts "Java"
        System.out.println("Sliced String: " + slicedString);

        // Using other string functions

        // Length of the string
        int length = originalString.length();
        System.out.println("Length of String: " + length);

        // Convert to upper case
        String upperCaseString = originalString.toUpperCase();
        System.out.println("Uppercase String: " + upperCaseString);

        // Convert to lower case
        String lowerCaseString = originalString.toLowerCase();
        System.out.println("Lowercase String: " + lowerCaseString);

        // Check if the string contains a substring
        boolean contains = originalString.contains("Java");
        System.out.println("Contains 'Java': " + contains);

        // Replace a substring
        String replacedString = originalString.replace("Java", "Programming");
        System.out.println("Replaced String: " + replacedString);

        // Trim any leading or trailing spaces
        String stringWithSpaces = "   Trim me!   ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed String: '" + trimmedString + "'");
        
        // Check if the string starts with a specific prefix
        boolean startsWithHello = originalString.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);
    }
}
