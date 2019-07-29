/**
 * purpose: it removes the nodes from the linked list
 */
class LinkedListRemove {
    //Head of the linked list
    Node3 head;
    class Node3 {
        int data;
        Node3 next;
        Node3(int d){
            data = d;
            next = null;
        }
    }

    void printLinkedList(int n) {
        int counter = 0;
        Node3 temp = head;
        while (temp != null) {
            temp = temp.next;
            counter++;
        }
        if (counter < n)
            return;
        temp = head;

        for (int i = 1; i < counter - n + 1; i++) {
            temp = temp.next;
            System.out.println( temp );
        }
    }
        /**
         * Insert a new node at front of the list
         */
        public void push(int newdata) {
            /**
             * Allocate the Node and put the data
             */
            Node3 node3 = new Node3( newdata );
            /**
             * Make next of new node head
             */
            node3.next = head;
            /**
             * Move the head to point the new node
             */
            head = node3;
        }

        public static void main(String[] args){
            LinkedListRemove linkedListRemove = new LinkedListRemove();
            linkedListRemove.push( 20);
            linkedListRemove.push(40);
            linkedListRemove.push(60);
            linkedListRemove.printLinkedList( 2);
            //System.out.println("print the linked list " + linkedListRemove.printLinkedList(3););

        }


}