import java.util.Scanner;

public class KthElementInSortedArray {
    public static int findKthElement(int[] a, int[] b, int k) {
        int i = 0, j = 0;

        for (int count = 1; count <= k; count++) {
            // If all elements from a[] are used
            if (i >= a.length) {
                return b[j++];
            }
            // If all elements from b[] are used
            else if (j >= b.length) {
                return a[i++];
            }
            // Compare current elements from a[] and b[]
            else if (a[i] < b[j]) {
                if (count == k)
                    return a[i];
                i++;
            } else {
                if (count == k)
                    return b[j];
                j++;
            }
        }
        return -1; // In case k is larger than total elements
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first array
        System.out.print("Enter size of first array: ");
        int m = sc.nextInt();
        int[] a = new int[m];
        System.out.println("Enter sorted elements of first array:");
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        // Input for second array
        System.out.print("Enter size of second array: ");
        int n = sc.nextInt();
        int[] b = new int[n];
        System.out.println("Enter sorted elements of second array:");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        // Input for k
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        // Find and display k-th element
        int result = findKthElement(a, b, k);
        System.out.println("The " + k + "-th element in the merged sorted array is: " + result);

        sc.close();
    }
}
