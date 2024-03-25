import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i, item, pos;
        System.out.println("Enter the number of elements:");
        n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the element to be deleted:");
        item = scanner.nextInt();
        System.out.println("Enter array elements:");
        for (i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        pos = -1;
        for (i = 0; i < n; i++) {
            if (item == a[i]) {
                pos = i;
                break;
            }
        }
        if (pos != -1) {
            System.out.println(item + " found at position " + pos);
            for (i = pos; i < n - 1; i++) {
                a[i] = a[i + 1];
            }
            int[] b = new int[n - 1];
            for (i = 0; i < n - 1; i++) {
                b[i] = a[i];
                System.out.print(b[i] + " ");
            }
        } else {
            System.out.println(item + " not found in the array.");
        }
    }
}

