import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackUsingLinkedList {
    static Node top = null;

    public static void push() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data:");
        int data = scanner.nextInt();
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public static void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(top.data + " is popped element");
            top = top.next;
        }
    }

    public static void display() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1 for push\n2 for pop\n3 for display\n4 to exit");
            System.out.println("Enter choice:");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }
        } while (ch != 4);
    }
}

