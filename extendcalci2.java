//......continue from extendcalci1.java
import java.util.Scanner;

public class calciextend {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Calculator");

        while (true) {
            System.out.println("Choose an operation:");
            // Existing menu options...

            System.out.println("16. Matrix Addition");
            System.out.println("17. Matrix Multiplication");
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
                // Existing cases...
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 20.");
                    continue;
            }

            System.out.println("Result: " + result);
        }
    }

    // Existing methods...

    public static double matrixAddition(Scanner scanner) {
        System.out.println("Enter number of rows and columns for the matrices:");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        double[][] matrix1 = new double[rows][columns];
        double[][] matrix2 = new double[rows][columns];
        double[][] resultMatrix = new double[rows][columns];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = scanner.nextDouble();
            }
        }

        // Adding corresponding elements of two matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Displaying the result
        System.out.println("Sum of the matrices is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        return 0; // Modify return value if needed
    }

    public static double matrixMultiplication(Scanner scanner) {
        System.out.println("Enter number of rows and columns for first matrix:");
        int rows1 = scanner.nextInt();
        int columns1 = scanner.nextInt();

        System.out.println("Enter number of rows and columns for second matrix:");
        int rows2 = scanner.nextInt();
        int columns2 = scanner.nextInt();

        if (columns1 != rows2) {
            System.out.println("Matrices cannot be multiplied!");
            return 0; // Modify return value if needed
        }

        double[][] matrix1 = new double[rows1][columns1];
        double[][] matrix2 = new double[rows2][columns2];
        double[][] resultMatrix = new double[rows1][columns2];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix1[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = scanner.nextDouble();
            }
        }

        // Multiplying matrices
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Displaying the result
        System.out.println("Product of the matrices is:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        return 0; // Modify return value if needed
    }

    // Additional methods for differentiation, integration...
}

