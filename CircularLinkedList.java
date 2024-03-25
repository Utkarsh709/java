import java.util.Scanner;

public class CircularLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node tail = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\nAvailable operations for singly circular linked list:");
            System.out.println("1. Create\n2. Insert at beginning\n3. Insert at end\n4. Insert after position");
            System.out.println("5. Delete at beginning\n6. Delete at end\n7. Delete from position\n8. Display");
            System.out.print("Enter your choice: ");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    create();
                    break;
                case 2:
                    insertBeginning();
                    break;
                case 3:
                    insertEnd();
                    break;
                case 4:
                    insertAfterPosition();
                    break;
                case 5:
                    deleteBeginning();
                    break;
                case 6:
                    deleteEnd();
                    break;
                case 7:
                    deleteFromPosition();
                    break;
                case 8:
                    display();
                    break;
                default:
                    System.out.println("Enter a valid key.");
                    break;
            }
        } while (ch != 8);
        scanner.close();
    }

    static void create() {
        tail = null;
        int choice = 1;
        while (choice != 0) {
            Node newNode = new Node(0);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter data: ");
            newNode.data = scanner.nextInt();
            if (tail == null) {
                tail = newNode;
                tail.next = tail;
            } else {
                newNode.next = tail.next;
                tail.next = newNode;
                tail = newNode;
            }
            System.out.print("Do you want to continue (1/0): ");
            choice = scanner.nextInt();
        }
    }

    static void display() {
        if (tail == null) {
            System.out.println("Linked list is empty");
        } else {
            Node temp = tail.next;
            do {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            } while (temp != tail.next);
        }
    }

    static void insertBeginning() {
        if (tail == null) {
            System.out.println("List is empty. Insertion at beginning not possible.");
            return;
        }
        Node newNode = new Node(0);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data: ");
        newNode.data = scanner.nextInt();
        newNode.next = tail.next;
        tail.next = newNode;
    }

    static void insertEnd() {
        if (tail == null) {
            System.out.println("List is empty. Insertion at end not possible.");
            return;
        }
        Node newNode = new Node(0);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data: ");
        newNode.data = scanner.nextInt();
        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;
    }

    static void insertAfterPosition() {
        if (tail == null) {
            System.out.println("List is empty. Insertion after position not possible.");
            return;
        }
        Node newNode = new Node(0);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter position: ");
        int pos = scanner.nextInt();
        if (pos < 1) {
            System.out.println("Invalid position.");
            return;
        }
        System.out.print("Enter data: ");
        newNode.data = scanner.nextInt();
        Node temp = tail.next;
        for (int i = 1; i < pos && temp != tail; i++) {
            temp = temp.next;
        }
        if (temp == tail) {
            System.out.println("Position out of bounds.");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    static void deleteBeginning() {
        if (tail == null) {
            System.out.println("List is empty. Deletion at beginning not possible.");
            return;
        }
        Node temp = tail.next;
        if (tail == tail.next) {
            tail = null;
        } else {
            tail.next = temp.next;
        }
        temp.next = null;
    }

    static void deleteEnd() {
        if (tail == null) {
            System.out.println("List is empty. Deletion at end not possible.");
            return;
        }
        Node temp = tail;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = tail.next;
        tail = temp;
    }

    static void deleteFromPosition() {
        if (tail == null) {
            System.out.println("List is empty. Deletion from position not possible.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter position: ");
        int pos = scanner.nextInt();
        if (pos < 1) {
            System.out.println("Invalid position.");
            return;
        }
        Node temp = tail.next;
        Node prev = tail;
        for (int i = 1; i < pos && temp != tail; i++) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == tail) {
            System.out.println("Position out of bounds.");
            return;
        }
        prev.next = temp.next;
        temp.next = null;
    }
}

