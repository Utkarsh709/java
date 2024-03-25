import java.util.Scanner;

class Node {
    int coefficient;
    int exponent;
    Node next;

    Node(int coefficient, int exponent) {
        this.coefficient = coefficient;
        this.exponent = exponent;
        this.next = null;
    }
}

public class Polynomial {
    static Node head, temp;

    public static void createPoly() {
        head = null;
        Scanner scanner = new Scanner(System.in);
        int choice = 1;

        while (choice == 1) {
            Node newNode = new Node(0, 0);
            System.out.print("Enter coefficient: ");
            newNode.coefficient = scanner.nextInt();
            System.out.print("Enter exponent: ");
            newNode.exponent = scanner.nextInt();

            if (head == null) {
                head = temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }

            System.out.print("Do you want to continue (1 for yes, 0 for no): ");
            choice = scanner.nextInt();
        }
    }

    public static void display() {
        temp = head;

        if (temp == null) {
            System.out.println("Polynomial is empty.");
            return;
        }

        System.out.print("Polynomial: ");
        while (temp != null) {
            System.out.print(temp.coefficient + "x^" + temp.exponent);
            temp = temp.next;
            if (temp != null) {
                System.out.print(" + ");
            }
        }
        System.out.println();
    }

    public static int evaluate(int x) {
        temp = head;
        int result = 0;

        while (temp != null) {
            result += temp.coefficient * Math.pow(x, temp.exponent);
            temp = temp.next;
        }

        return result;
    }

    public static void main(String[] args) {
        createPoly();
        display();

        // Evaluate the polynomial for x = 2 (you can change the value of x)
        int x = 2;
        int result = evaluate(x);
        System.out.println("The polynomial evaluated at x = " + x + " is: " + result);
    }
}

