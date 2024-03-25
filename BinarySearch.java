import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

          
            if (array[mid] == target) {
                return mid;
            }

           
            if (array[mid] < target) {
                left = mid + 1;
            }
            
            else {
                right = mid - 1;
            }
        }

     
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the sorted array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the sorted elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        int index = binarySearch(array, target);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}

