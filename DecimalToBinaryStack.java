import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinaryStack {
    public static String decimalToBinary(int decimal) {
        Stack<Integer> stack = new Stack<>();

          while (decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /= 2;
        }

    
        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String binary = decimalToBinary(decimal);
        System.out.println("Binary representation: " + binary);

        scanner.close();
    }
}

