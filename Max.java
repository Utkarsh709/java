import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int max = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max: " + max);
    }
}

