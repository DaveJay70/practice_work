public class PalindromeCheckWithoutUDF {
    public static void main(String[] args) {
        String input = "madam";
        int left = 0;
        int right = input.length() - 1;
        System.out.println(input.length());
        boolean isPalindrome = true;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
