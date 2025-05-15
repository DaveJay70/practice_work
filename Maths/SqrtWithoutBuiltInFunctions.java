import java.util.*;

class SqrtWithoutBuiltInFunctions {
    public static int sqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int start = 1, end = x, ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid <= x / mid) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value to find square root:");
        double input = sc.nextDouble();
        int rounded = (int) (input + 0.5);
        System.out.println("Square root of rounded value " + rounded + " is: " + sqrt(rounded));
    }
}
