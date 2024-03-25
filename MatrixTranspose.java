import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m, i, j;
        
        System.out.print("Enter number of rows: ");
        n = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        m = scanner.nextInt();
        
        int[][] a = new int[n][m];
        int[][] b = new int[m][n];
        
        System.out.println("Enter elements of the matrix:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Transposed matrix:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                b[i][j] = a[j][i];
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

