public class ChocolateProblem {
    public static int calculateChocolates(int x, int y, int z) {
        int chocolates = x / y; // Initial chocolates bought ,total chocolate atli buy karyi 
        int wrappers = chocolates; // Initial wrappers from bought chocolates

        // Exchange wrappers for more chocolates
        while (wrappers >= z) {
            int newChocolates = wrappers / z;
            chocolates += newChocolates;
            wrappers = wrappers % z + newChocolates;
        }
        return chocolates;
    }
    public static void main(String[] args) {
        int x = 15; // Money available
        int y = 1;  // Cost of one chocolate
        int z = 3;  // Wrappers needed for one chocolate

        int totalChocolates = calculateChocolates(x, y, z);
        System.out.println("Total chocolates that can be eaten: " + totalChocolates);
    }
}
