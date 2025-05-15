import java.util.*;

public class HappyNumber {
    public static boolean isHappy(int num) {
        int[] seen = new int[100]; // Array to store previous results
        int index = 0;

        while (num != 1) {
            int sum = 0;
            int temp = num;

            // Find sum of squares of digits
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }

            // Check if sum is already in seen array
            for (int i = 0; i < index; i++) {
                if (seen[i] == sum) {
                    System.out.println(num + " is NOT a Happy Number :_(");
                    return false;
                }
            }

            seen[index] = sum;
            index++;

            num = sum;
        }

        System.out.println(num + " is a Happy Number :)");
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        isHappy(num);
        sc.close();
    }
}
