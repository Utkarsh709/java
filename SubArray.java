import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[] a = new int[10];
        
        System.out.print("Enter the number of elements: ");
        n = scanner.nextInt();
        
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(a[j] + "\t");
            }
            System.out.println();
        }
    }
}

