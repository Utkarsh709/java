//......continue from extendcalci3.java
import java.util.Scanner;

public class calciextend {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Calculator");

        while (true) {
            System.out.println("Choose an operation:");
            // Existing menu options...

            System.out.println("21. Permutation (nPr)");
            System.out.println("22. Combination (nCr)");
            // Existing menu options...
            
            System.out.println("23. Decimal to Binary");
            System.out.println("24. Decimal to Hexadecimal");
            System.out.println("25. Decimal to Octal");
            System.out.println("26. Binary to Decimal");
            System.out.println("27. Hexadecimal to Decimal");
            System.out.println("28. Octal to Decimal");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            double result = 0;

            switch (choice) {
                // Existing cases...
                case 16:
                    result = matrixAddition(scanner);
                    break;
                case 17:
                    result = matrixMultiplication(scanner);
                    break;
                case 21:
                    result = permutation(scanner);
                    break;
                case 22:
                    result = combination(scanner);
                    break;
                case 23:
                    decimalToBinary(scanner);
                    break;
                case 24:
                    decimalToHex(scanner);
                    break;
                case 25:
                    decimalToOctal(scanner);
                    break;
                case 26:
                    binaryToDecimal(scanner);
                    break;
                case 27:
                    hexToDecimal(scanner);
                    break;
                case 28:
                    octalToDecimal(scanner);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 28.");
                    continue;
            }

            System.out.println("Result: " + result);
        }
    }

    // Existing methods...

    public static void decimalToBinary(Scanner scanner) {
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary equivalent: " + binary);
    }

    public static void decimalToHex(Scanner scanner) {
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String hex = Integer.toHexString(decimal);
        System.out.println("Hexadecimal equivalent: " + hex.toUpperCase());
    }

    public static void decimalToOctal(Scanner scanner) {
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal equivalent: " + octal);
    }

    public static void binaryToDecimal(Scanner scanner) {
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal equivalent: " + decimal);
    }

    public static void hexToDecimal(Scanner scanner) {
        System.out.print("Enter a hexadecimal number: ");
        String hex = scanner.next();
        int decimal = Integer.parseInt(hex, 16);
        System.out.println("Decimal equivalent: " + decimal);
    }

    public static void octalToDecimal(Scanner scanner) {
        System.out.print("Enter an octal number: ");
        String octal = scanner.next();
        int decimal = Integer.parseInt(octal, 8);
        System.out.println("Decimal equivalent: " + decimal);
    }

    // Existing methods...
}

