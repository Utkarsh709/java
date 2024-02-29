import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        int p = 0;
        int n = 0;
        int z = 0;

        while (choice == 1) {
            System.out.println("Enter the number:");
            int m = sc.nextInt();

            if (m > 0) {
                p++;
            } else if (m < 0) {
                n++;
            } else {
                z++;
            }

            System.out.println("Do you want to continue? (0/1)");
            choice = sc.nextInt();
        }

        System.out.println("Positive number: " + p);
        System.out.println("Negative number: " + n);
        System.out.println("Zero number: " + z);
    }
}

