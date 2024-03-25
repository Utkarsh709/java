import java.util.Scanner;

public class LargestElementFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, max = 0, fact = 1;
        System.out.print("Enter number of elements: ");
        n = scanner.nextInt();
        int[] a = new int[20];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max + " is the maximum element");

        for (int k = 1; k <= max; k++) {
            fact = fact * k;
        }
        System.out.println("Factorial of the largest number from the array is " + fact);
    }
}

