public class BuildingInspection {
    public static int countValidCombinations(String s) {
        char[] buildings = s.toCharArray();
        int count = 0;
        int n = buildings.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    char a = buildings[i];
                    char b = buildings[j];
                    char c = buildings[k];

                    // Check alternating pattern: "010" or "101"
                    if ((a != b) && (b != c)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "001101";
        int result = countValidCombinations(s);
        System.out.println("Valid combinations count: " + result);
    }
}
