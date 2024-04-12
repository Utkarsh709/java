import java.util.Scanner;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class ex1 {
    public static void main(String args[]) {
        int i, j, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of i:");
        i = sc.nextInt();
        System.out.println("Enter a value of j: ");
        j = sc.nextInt();
        try {
            if (j == 0) {
                throw new MyException("Divisor cannot be zero");
            }
            k = i / j;
            System.out.println("Result: " + k);
        } catch (MyException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

