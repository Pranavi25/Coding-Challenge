/**
 * Purpose: it returns the length of the linked list
 */
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
class LengthofLinkedList {
    Node head;

    /**
     * Insert a new node at front of the list
     */
    public void push(int newdata) {
        /**
         * Allocate the Node and put the data
         */
        Node node = new Node( newdata );
        /**
         * Make next of new node head
         */
        node.next = head;
        /**
         * Move the head to point the new node
         */
        head = node;
    }

    /**
     * Returns length of the linked list
     */
    public int getCount() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    /**
     * Driver to test the above logic
     */
    public static void main(String[] args) {
        /**
         * Start with empty List
         */
        LengthofLinkedList linkedList = new LengthofLinkedList();
        linkedList.push(4);
        linkedList.push(9);
        linkedList.push(10);
        linkedList.push(13);
        System.out.println("The Length odf the Linked List is : " + linkedList.getCount());
    }
}


