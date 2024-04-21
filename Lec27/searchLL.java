package Lec27;
public class searchLL {
    public static void main(String[] args) {
            // Create a linked list
        LinkedList linkedList = new LinkedList();
    
            // Add elements to the linked list
        linkedList.insert(1);
        linkedList.insert(5);
        linkedList.insert(7);
        linkedList.insert(3);
        linkedList.insert(8);
        linkedList.insert(2);
        linkedList.insert(3);
    
            // Search for the number 7 and display its index
        int index = linkedList.search(7);
        if (index != -1) {
            System.out.println("Index of 7: " + index);
        } else {
            System.out.println("Element 7 not found in the linked list.");
        }
    }
}
    
class LinkedList {
    private Node head;
    
    public LinkedList() {
        head = null;
    }
    
        // Method to insert a new element at the beginning of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
        // Method to search for an element in the linked list and return its index
    public int search(int target) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
    
        // Node class representing individual nodes of the linked list
    private class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}