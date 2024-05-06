//....continue from extendcalci2.java
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
                // Existing cases...
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 22.");
                    continue;
            }

            System.out.println("Result: " + result);
        }
    }

    // Existing methods...

    public static double permutation(Scanner scanner) {
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();

        if (n < r) {
            System.out.println("Invalid input! n should be greater than or equal to r.");
            return 0; // Modify return value if needed
        }

        return factorial(n) / factorial(n - r);
    }

    public static double combination(Scanner scanner) {
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();

        if (n < r) {
            System.out.println("Invalid input! n should be greater than or equal to r.");
            return 0; // Modify return value if needed
        }

        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    private static double factorial(int num) {
        double fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Existing methods...
}

