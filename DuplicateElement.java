import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i, j;
        int[] a = new int[20];

        System.out.print("Enter the number of elements in the array: ");
        n = scanner.nextInt();

        System.out.print("Enter array elements: ");
        for (i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Duplicate elements in the array: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }

        System.out.print("\nOriginal array elements: ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

