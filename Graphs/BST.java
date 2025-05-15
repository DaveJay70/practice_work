import java.util.*;

class BST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // size of array
        int[] arr = new int[n];

        // input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // find min
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // find second min (initialize with a very high value)
        int secondMin = Integer.MAX_VALUE;
        System.out.println("Kai Sari Kariya Vagar Ni Second Min Value:"+secondMin);
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] > min && arr[i] < secondMin) {
                secondMin = arr[i];
                found = true;
            }
        }

        if (found) {
            System.out.println("Second minimum value: " + secondMin);
        } else {
            System.out.println("Second minimum doesn't exist.");
        }

        sc.close();
    }
}
