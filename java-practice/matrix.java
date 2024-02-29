import java.util.Scanner;

class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns:");
        int columns = sc.nextInt();

        int[][] matrixs = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter element at position (" + (i + 1) + ", " + (j + 1) + "):");
                matrixs[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entered matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrixs[i][j] + " ");
            }
            System.out.println();
        }
    }
}

