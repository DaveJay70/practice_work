public class Roman {
    public static String intToRoman(int num) {
        int[] values =    {1000, 900, 500, 400, 100, 90,  50,  40,  10, 9,   5,  4,  1};
        String[] symbols ={"M",  "CM","D", "CD","C","XC","L", "XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(9));    // Output: IX
        System.out.println(intToRoman(40));   // Output: XL
        System.out.println(intToRoman(1904)); // Output: MCMIV
        System.out.println(intToRoman(3649)); // Output: MMMDCXLIX
        System.out.println(intToRoman(3549)); // Output: MMMDXLIX
    }
}