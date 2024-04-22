package Lec29;
class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class remove_loop_in_LL {
    public void removeLoop(ListNode head) {
        ListNode tortoise = head;
        ListNode hare = head;
        
        // Detect loop
        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
            if (tortoise == hare) {
                break;
            }
        }
        
        // If loop exists, find the start of the loop
        if (hare != null && hare == tortoise) {
            tortoise = head;
            while (tortoise.next != hare.next) {
                tortoise = tortoise.next;
                hare = hare.next;
            }
            // Break the loop
            hare.next = null;
        }
    }
    
    // Utility method to print the linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        //System.out.println();
    }
    
    public static void main(String[] args) {
        remove_loop_in_LL remover = new remove_loop_in_LL();
        
        // Create a linked list with a loop
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next; // Create a loop
        
        // Print the original linked list
        //System.out.println("Original linked list:");
        //remover.printList(head);
        
        // Remove the loop
        remover.removeLoop(head);
        
        // Print the linked list after removing the loop
        System.out.println("Linked list after removing the loop:");
        remover.printList(head);
    }
}
