import java.util.Scanner;

public class SamePair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, k, count = 0;
        System.out.print("Enter the number of elements in the array: ");
        n = scanner.nextInt();
        
        int[] a = new int[n];
        
        System.out.print("Enter the number: ");
        k = scanner.nextInt();
        
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && a[i] + a[j] == k) {
                    System.out.println(a[i] + " and " + a[j]);
                    count++;
                }
            }
        }
        
        System.out.println("Total pairs with sum " + k + ": " + count);
    }
}

