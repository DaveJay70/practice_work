import java.util.*;

public class CountPairsWithSum {
    public static int getPairsCount(int[] arr, int K) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int complement = K - arr[i];

            if (map.containsKey(complement)) {
                count += map.get(complement);
            }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1, 4, 2, 3, 3, 6, 0};
        int K = 6;
        int result = getPairsCount(arr, K);
        System.out.println("Total pairs with sum " + K + " = " + result);
    }
}
