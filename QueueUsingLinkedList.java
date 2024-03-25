import java.util.Scanner;

class Node {
    int data;
    Node front;
    Node rear;

    Node(int data) {
        this.data = data;
        this.front = null;
        this.rear = null;
    }
}

public class QueueUsingLinkedList {
    static Node head = null;

    public static void enqueue(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.rear != null) {
                temp = temp.rear;
            }
            temp.rear = newNode;
        }
    }

    public static int dequeue() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return -1; // Return a default value for an empty queue
        }

        int data = head.data;
        head = head.rear;
        return data;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, data;

        while (true) {
            System.out.println("Queue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = scanner.nextInt();
                    enqueue(data);
                    break;
                case 2:
                    data = dequeue();
                    if (data != -1) {
                        System.out.println("Dequeued element: " + data);
                    }
                    break;
                case 3:
                    System.out.println("Exiting program");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

