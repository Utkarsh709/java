import java.util.Scanner;

public class DoublyLinkedList {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\nAvailable operations for singly linked list:");
            System.out.println("1. Create\n2. Insert at beginning\n3. Insert at end\n4. Insert after position");
            System.out.println("5. Delete at beginning\n6. Delete at end\n7. Delete from position\n8. Find length");
            System.out.println("9. Reverse\n10. Display\n11. Exit");
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
                    getLength();
                    break;
                case 9:
                    reverse();
                    break;
                case 10:
                    display();
                    break;
                case 11:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Enter a valid key.");
                    break;
            }
        } while (ch != 11);
        scanner.close();
    }

    static void create() {
        head = null;
        int choice = 1;
        while (choice == 1) {
            Node newNode = new Node(0);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter data: ");
            newNode.data = scanner.nextInt();
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            System.out.print("Do you want to continue (1/0): ");
            choice = scanner.nextInt();
        }
    }

    static void display() {
        Node current = head;
        System.out.print("Linked list elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    static void insertBeginning() {
        Node newNode = new Node(0);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data: ");
        newNode.data = scanner.nextInt();
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    static void insertEnd() {
        Node newNode = new Node(0);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data: ");
        newNode.data = scanner.nextInt();
        newNode.prev = tail;
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
    }

    static void insertAfterPosition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter position: ");
        int pos = scanner.nextInt();
        if (pos == 1) {
            insertBeginning();
            return;
        }
        Node newNode = new Node(0);
        System.out.print("Enter data: ");
        newNode.data = scanner.nextInt();
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position.");
            return;
        }
        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        newNode.prev = temp;
        temp.next = newNode;
    }

    static void deleteBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        temp.next = null;
    }

    static void deleteEnd() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = tail;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        temp.prev = null;
    }

    static void deleteFromPosition() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter position: ");
        int pos = scanner.nextInt();
        Node temp = head;
        for (int i = 1; i < pos && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position.");
            return;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            tail = temp.prev;
        }
        temp.next = null;
        temp.prev = null;
    }

    static void reverse() {
        Node temp = null;
        Node current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
    }

    static void getLength() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Length of linked list: " + count);
    }
}

