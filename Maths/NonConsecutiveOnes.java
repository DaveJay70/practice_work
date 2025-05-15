public class NonConsecutiveOnes {
    // Precompute Fibonacci numbers up to 32 bits
    static int[] fib = new int[32];

    static {
        fib[0] = 1;
        fib[1] = 2;
        for (int i = 2; i < 32; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
    }

    // Count numbers without consecutive 1s
    public static int countNonConsecutiveOnes(int n) {
        int result = 0;
        int prevBit = 0;

        for (int i = 30; i >= 0; i--) {
            if ((n & (1 << i)) != 0) {
                result += fib[i];
                if (prevBit == 1) {
                    return result;
                }
                prevBit = 1;
            } else {
                prevBit = 0;
            }
        }
        return result + 1;
    }

    // Helper to check if binary has consecutive 1s
    public static boolean hasConsecutiveOnes(int num) {
        return (num & (num >> 1)) != 0;
    }

    // Print valid numbers and their binary representation
    public static void printValidNumbers(int n) {
        System.out.println("Valid numbers without consecutive 1s:");
        for (int i = 0; i <= n; i++) {
            if (!hasConsecutiveOnes(i)) {
                System.out.printf("%2d = %s%n", i, Integer.toBinaryString(i));
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        int n = 13;
        int count = countNonConsecutiveOnes(n);
        System.out.println("Count of numbers without consecutive 1s from 0 to " + n + ": " + count);
        printValidNumbers(n);
    }
}
