import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("After Removing Duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder output = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (seen.add(c)) {
                output.append(c);
            }
        }
        return output.toString();
    }
}
