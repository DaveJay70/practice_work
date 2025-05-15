import java.util.*;

public class JobScheduling {
    public static void main(String[] args) {
        int[] profit = {100, 19, 27};
        int[] deadline = {2, 1, 2};
        int maxDeadline = 2;
        int n = profit.length;

        int[] sequence = jobScheduling(profit, deadline, maxDeadline, n);
        System.out.print("Job sequence: ");
        for (int job : sequence) {
            if (job != -1) {
                System.out.print("Job" + (job + 1) + " ");
            }
        }
    }

    public static int[] jobScheduling(int[] profit, int[] deadline, int maxDeadline, int n) {
        // Prepare job index list
        Integer[] jobs = new Integer[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = i;
        }

        // Sort jobs by profit (high to low)
        Arrays.sort(jobs, (a, b) -> profit[b] - profit[a]);

        // Slot array to store job index at that time, initialize with -1 (empty)
        int[] result = new int[maxDeadline];
        Arrays.fill(result, -1);

        // Try to place each job in latest available slot before or on its deadline
        for (int i = 0; i < n; i++) {
            int jobIndex = jobs[i];
            for (int j = deadline[jobIndex] - 1; j >= 0; j--) {
                if (result[j] == -1) {
                    result[j] = jobIndex;
                    break;
                }
            }
        }

        return result;
    }
}
