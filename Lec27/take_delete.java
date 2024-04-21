package Lec27;
import java.util.Scanner;

public class take_delete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " numbers (1-50):");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num >= 1 && num <= 50) {
                list.insert(num);
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 50.");
                i--; // Decrement i to re-enter the current number
            }
        }

        System.out.println("Original linked list: ");
        list.display();

        list.deleteGreaterThan25();

        System.out.println("Linked list after deleting nodes with values greater than 25:");
        list.display();
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteGreaterThan25() {
        while (head != null && head.data > 25) {
            head = head.next;
        }
        if (head == null) {
            return;
        }
        Node prev = head;
        Node current = head.next;
        while (current != null) {
            if (current.data > 25) {
                prev.next = current.next;
                current = current.next;
            } else {
                prev = current;
                current = current.next;
            }
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
