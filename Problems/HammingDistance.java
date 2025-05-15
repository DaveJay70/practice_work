public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int xor = x ^ y; // XOR the two numbers
        int distance = 0;

        // Count the number of set bits in the XOR result
        while (xor > 0) {
            distance += xor & 1; // Check if the least significant bit is set
            xor >>= 1; // Right shift to check the next bit
        }

        return distance;
    }

    public static void main(String[] args) {
        int x = 9; // Example input
        int y = 14; // Example input
        System.out.println("Hamming Distance: " + hammingDistance(x, y)); // Output: 2
    }
}