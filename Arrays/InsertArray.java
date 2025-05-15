import java.util.Scanner;

class InsertArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take array size from user
        System.out.println("Enter Size Of Array:");
        int size = sc.nextInt();

        // Step 2: Create array of given size
        int[] Arr = new int[size + 1]; // +1 to handle insertion

        // Step 3: Take array elements from user
        for (int i = 0; i < size; i++) {
            System.out.println("Please Enter Value For " + i + "th index:");
            Arr[i] = sc.nextInt();
        }

        // Step 4: Display original array
        System.out.println("Your Array Is:");
        for (int i = 0; i < size; i++) {
            System.out.println("Value at " + i + " is " + Arr[i]);
        }

        // Step 5: Take position and element to insert
        System.out.println("Enter The Position To Insert Element (0 to " + size + "):");
        int pos = sc.nextInt();
        System.out.println("Enter The Element To Insert:");
        int ele = sc.nextInt();

        // Step 6: Shift elements to the right from the end to the position
        for (int i = size; i > pos; i--) {
            Arr[i] = Arr[i - 1];
        }

        // Step 7: Insert the new element at the given position
        Arr[pos] = ele;

        // Step 8: Display the new array
        System.out.println("Your New Array Is:");
        for (int i = 0; i < size + 1; i++) {
            System.out.println("Value at " + i + " is " + Arr[i]);
        }
    }
}