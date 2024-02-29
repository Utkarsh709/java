import java.util.Scanner;

class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] marks = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        System.out.println("Entered values:");

        for (int i = 0; i < size; i++) {
            System.out.println(marks[i]);
        }
    }
}

