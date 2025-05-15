import java.util.*;

public class SlidingWindowMax {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];
        System.out.println((n - k + 1));
        Deque<Integer> deque = new ArrayDeque<>(); // index store કરવા માટે

        for (int i = 0; i < n; i++) {
            // Remove indices જે window ની બહાર જાય છે
            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Remove values જે પાછલા કરતાં નાના છે (તેમના થી Max નહીં થાય)
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add current index
            deque.offer(i);

            // First valid window પછી result માં add કરો
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peek()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] output = maxSlidingWindow(nums, k);

        System.out.println("Output: " + Arrays.toString(output));
    }
}
