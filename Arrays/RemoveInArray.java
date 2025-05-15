import java.util.*;

public class RemoveInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Of Array:");
        int size = sc.nextInt();
        int[] Arr = new int[size];

        // Input elements
        for (int i = 0; i < size; i++) {
            System.out.println("Please Enter Value For " + i + "th index:");
            Arr[i] = sc.nextInt();
        }

        // Show original array
        System.out.println("Your Array Before Delete:");
        for (int i = 0; i < size; i++) {
            System.out.println("Value at " + i + " is " + Arr[i]);
        }

        System.out.println("Enter Value to Delete:");
        int remove = sc.nextInt();

        int newSize = size;

        for (int i = 0; i < newSize; i++) {
            if (Arr[i] == remove) {
                // Shift elements to the left
                for (int j = i; j < newSize - 1; j++) {
                    Arr[j] = Arr[j + 1];
                }
                newSize--; // reduce size
                i--; // check current index again after shift
            }
        }

        // Show updated array
        System.out.println("Your Array After Delete:");
        for (int i = 0; i < newSize; i++) {
            System.out.println("Value at " + i + " is " + Arr[i]);
        }
    }
}
