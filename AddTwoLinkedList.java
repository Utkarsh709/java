import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AddTwoLinkedList{
    static Node head, temp;
    static Node1 head1, temp1;

    public static void create() {
        head = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first linked list:");
        int choice = 1;
        
        while (choice != 0) {
            System.out.print("Enter the number: ");
            int data = scanner.nextInt();
            Node newNode = new Node(data);
            
            if (head == null) {
                head = temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
            
            System.out.print("Do you want to continue (0/1): ");
            choice = scanner.nextInt();
        }
        
        head1 = null;
        System.out.println("Enter second linked list:");
        int choice1 = 1;
        
        while (choice1 != 0) {
            System.out.print("Enter the number: ");
            int data = scanner.nextInt();
            Node1 newNode = new Node1(data);
            
            if (head1 == null) {
                head1 = temp1 = newNode;
            } else {
                temp1.next = newNode;
                temp1 = newNode;
            }
            
            System.out.print("Do you want to continue (0/1): ");
            choice1 = scanner.nextInt();
        }
        
        temp = head;
        temp1 = head1;
        
        while (temp != null && temp1 != null) {
            System.out.print((temp.data + temp1.data) + "\t");
            temp = temp.next;
            temp1 = temp1.next;
        }
        
        // Free allocated memory - Not required in Java due to garbage collection
    }

    public static void main(String[] args) {
        create();
    }
}

