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

public class PolynomialAddition {
    static Node newnode, temp;

    public static void createPoly(Node[] head) {
        head[0] = null;
        Scanner scanner = new Scanner(System.in);
        int choice = 1;

        while (choice == 1) {
            newnode = new Node(0, 0);
            System.out.print("Enter coefficient: ");
            newnode.coefficient = scanner.nextInt();
            System.out.print("Enter exponent: ");
            newnode.exponent = scanner.nextInt();

            if (head[0] == null) {
                head[0] = temp = newnode;
            } else {
                temp.next = newnode;
                temp = newnode;
            }

            System.out.print("Do you want to continue (1 for yes, 0 for no): ");
            choice = scanner.nextInt();
        }
    }

    public static void display(Node head) {
        temp = head;

        if (temp == null) {
            System.out.println("Polynomial is empty.");
            return;
        }

        while (temp != null) {
            System.out.print(temp.coefficient + "x^" + temp.exponent);
            temp = temp.next;
            if (temp != null) {
                System.out.print(" + ");
            }
        }
        System.out.println();
    }

    public static Node addPolynomials(Node poly1, Node poly2) {
        Node result = null;
        Node temp1 = poly1;
        Node temp2 = poly2;
        Node tempResult = result;

        while (temp1 != null || temp2 != null) {
            newnode = new Node(0, 0);

            if (temp1 == null) {
                newnode.coefficient = temp2.coefficient;
                newnode.exponent = temp2.exponent;
                temp2 = temp2.next;
            } else if (temp2 == null) {
                newnode.coefficient = temp1.coefficient;
                newnode.exponent = temp1.exponent;
                temp1 = temp1.next;
            } else {
                if (temp1.exponent > temp2.exponent) {
                    newnode.coefficient = temp1.coefficient;
                    newnode.exponent = temp1.exponent;
                    temp1 = temp1.next;
                } else if (temp1.exponent < temp2.exponent) {
                    newnode.coefficient = temp2.coefficient;
                    newnode.exponent = temp2.exponent;
                    temp2 = temp2.next;
                } else {
                    newnode.coefficient = temp1.coefficient + temp2.coefficient;
                    newnode.exponent = temp1.exponent;
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                }
            }

            newnode.next = null;

            if (result == null) {
                result = tempResult = newnode;
            } else {
                tempResult.next = newnode;
                tempResult = newnode;
            }
        }

        return result;
    }

    public static int evaluate(Node head, int x) {
        temp = head;
        int result = 0;

        while (temp != null) {
            result += temp.coefficient * Math.pow(x, temp.exponent);
            temp = temp.next;
        }

        return result;
    }

    public static void main(String[] args) {
        Node head1 = null, head2 = null;
        createPoly(new Node[]{head1});
        createPoly(new Node[]{head2});

        System.out.print("Polynomial 1: ");
        display(head1);
        System.out.print("Polynomial 2: ");
        display(head2);

        Node result = addPolynomials(head1, head2);
        System.out.print("Resultant Polynomial: ");
        display(result);

        // Evaluate the resultant polynomial for x (you can change the value of x)
        int x = 2;
        int resultValue = evaluate(result, x);
        System.out.println("Resultant polynomial evaluated at x = " + x + " is: " + resultValue);
    }
}

