package Lec27;

public class insert_inbetween {
    private Node head;
    private int size;

    public insert_inbetween() {
        head = null;
        size = 0;
    }

    public void addMiddle(int index, String data) {
        if(index > size || index < 0) {
            System.out.println("Invalid Index value");
            return;
        }
        size++;

        Node newNode = new Node(data);
        if(head == null || index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        for(int i = 1; i < size; i++) {
            if(i == index) {
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode = currNode.next;
        }
    }

    private class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
}
