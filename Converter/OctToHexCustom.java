import java.util.Scanner;

public class OctToHexCustom {

    // Octal to Decimal
    public static int octalToDecimal(String oct) {
        int decimal = 0;
        int power = 0;

        for (int i = oct.length() - 1; i >= 0; i--) {
            int digit = oct.charAt(i) - '0';
            decimal += digit * Math.pow(8, power);
            power++;
        }

        return decimal;
    }

    // Decimal to Hexadecimal
    public static String decimalToHex(int dec) {
        String hexChars = "0123456789ABCDEF";
        StringBuilder hex = new StringBuilder();

        while (dec > 0) {
            int rem = dec % 16;
            hex.insert(0, hexChars.charAt(rem));
            dec /= 16;
        }

        return hex.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter octal number: ");
        String oct = sc.next();

        int decimal = octalToDecimal(oct);      // Step 1
        String hex = decimalToHex(decimal);     // Step 2

        System.out.println("Hexadecimal: " + hex);
    }
}
