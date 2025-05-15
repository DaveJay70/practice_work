public class UDFWithAscendingAndRepeatationOf3 {

    public static int checkArray(int[] arr) {
        int n = arr.length;
        // Step 1: Check if the array is in ascending (non-decreasing) order
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return 0;
            }
        }

        // Step 2: Count frequencies using array (assume values from 0 to 1000)
        int[] freq = new int[n];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        // Step 3: Check if any element appears at least 3 times
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] >= 3) {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 3, 3, 3, 3 };
        System.out.println(checkArray(arr)); // Output: 1
    }
}
