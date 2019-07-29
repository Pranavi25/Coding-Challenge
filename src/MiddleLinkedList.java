/**
 * Purpose: it gives the middle node in a linked list, first node and last node
 *
 */
public class MiddleLinkedList {
    static class SinglyLinkedList {
        static class Node6 {
            private Node6 next;
            private String data;

            public Node6(String data) {
                this.data = data;
            }

            @Override
            public String toString() {
                return data.toString();
            }
        }

        private Node6 head;

        public boolean isEmpty() {
            return length() == 0;
        }

        public int length() {
            int length = 0;
            Node6 current = head;
            while (current != null) {
                length++;
                current = current.next;
            }
            return length;
        }

        private Node6 tail() {
            Node6 tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            return tail;
        }

        public void append(String data) {
            if (head == null) {
                head = new Node6( data );
                return;
            }
            tail().next = new Node6( data );
        }

        public String getLastNode(int n) {
            Node6 fast = head;
            Node6 slow = head;
            int start = 1;
            while (fast.next != null) {
                fast = fast.next;
                start++;
                if (start > n) {
                    slow = slow.next;
                }
            }
            return slow.data;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node6 current = head;
            while (current != null) {
                sb.append( current ).append( "-->" );
                current = current.next;
            }
            if (sb.length() >= 3) {
                sb.delete( sb.length() - 3, sb.length() );
            }
            return sb.toString();
        }


    }

    public static void main(String args[]) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append( "1" );
        list.append( "2" );
        list.append( "3" );
        list.append( "4" );
        System.out.println( "linked list : " + list );
        System.out.println( "The first node from last: " + list.getLastNode( 1 ) );
        System.out.println( "The second node from the end: " + list.getLastNode( 2 ) );
        System.out.println( "The third node from the tail: " + list.getLastNode( 3 ) );
    }
}





