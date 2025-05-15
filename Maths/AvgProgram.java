import java.util.*;

public class AvgProgram {
    public static int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum = totalSum + nums[i];
        }


        long leftSum = 0;
        int minDiff = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < n; i++) {
            leftSum += nums[i];
            long rightSum = totalSum - leftSum;

            int leftAvg = (int)(leftSum / (i + 1));
            int rightAvg;
            if (i == n - 1) {
                rightAvg = 0;
            } else {
                rightAvg = (int)(rightSum / (n - i - 1));
            }


            int diff = Math.abs(leftAvg - rightAvg);

            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 3, 9, 5, 3};
        int result = minimumAverageDifference(nums);
        System.out.println("Minimum average difference index: " + result);
    }
}
