import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, count1 = 0, count2 = 0;

        System.out.print("Enter the number of elements: ");
        n = scanner.nextInt();
        float[] a = new float[n];

        System.out.println("Enter array elements (up to three digits only):");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextFloat();
        }

        System.out.println("Even elements are:");
        for (int i = 0; i < n; i++) {
            int p1 = (int) (a[i] * 1000);
            if (p1 % 2 == 0) {
                System.out.printf("%.3f\n", a[i]);
                count1++;
            }
        }
        System.out.println("Total even numbers: " + count1);

        System.out.println("Odd elements are:");
        for (int i = 0; i < n; i++) {
            int p2 = (int) (a[i] * 1000);
            if (p2 % 2 != 0) {
                System.out.printf("%.3f\n", a[i]);
                count2++;
            }
        }
        System.out.println("Total odd numbers: " + count2);
    }
}

