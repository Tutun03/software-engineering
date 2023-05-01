import java.util.Scanner;

public class A36 {

    // Method to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    // Method to convert decimal to binary
    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.append(remainder);
            decimal /= 2;
        }
        return binary.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Convert binary to decimal
        System.out.print("Enter a binary number: ");
        String binaryNumber = input.nextLine();
        int decimalNumber = binaryToDecimal(binaryNumber);
        System.out.println(binaryNumber + " in decimal is " + decimalNumber);

        // Convert decimal to binary
        System.out.print("Enter a decimal number: ");
        int decimalInput = input.nextInt();
        String binaryOutput = decimalToBinary(decimalInput);
        System.out.println(decimalInput + " in binary is " + binaryOutput);
    }
}

