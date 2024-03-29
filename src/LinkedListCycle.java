/**
 * purpose: It says if the created linked list is cyclic or not
 */
public class LinkedListCycle {
        private Node head;
        public LinkedListCycle() {
            this.head = new Node("head");

        }
        public Node head() {
            return head;

        }
        public void appendIntoTail(Node node) {
            Node current = head;

            while(current.next() != null){
                current = current.next();

            }

            current.setNext(node);

        }

        public boolean isCyclic(){
            Node fast = head;
            Node slow = head;
            while(fast!= null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
                if(fast == slow ){ return true;

                } }
            return false;

        }

        public String toString(){
            StringBuilder sb = new StringBuilder();
            Node current = head.next();
            while(current != null){
                sb.append(current).append("-->");
                current = current.next();

            }
            sb.delete(sb.length() - 3, sb.length());
            return sb.toString();

        }
        public static class Node {
            private Node next;
            private String data;
            public Node(String data) {
                this.data = data;

            }
            public String data() {
                return data;

            }
            public void setData(String data) {
                this.data = data;

            }
            public Node next() {
                return next;

            }
            public void setNext(Node next) {
                this.next = next;
            }

            public String toString() {
                return this.data;

            } }
        public static void main(String args[]) {
            LinkedListCycle linkedList = new LinkedListCycle();
            linkedList.appendIntoTail(new LinkedListCycle.Node("101"));
            linkedList.appendIntoTail(new LinkedListCycle.Node("201"));
            linkedList.appendIntoTail(new LinkedListCycle.Node("301"));
            linkedList.appendIntoTail(new LinkedListCycle.Node("401"));
            linkedList.appendIntoTail( new LinkedListCycle.Node( "101" ) );
            System.out.println("Linked List : " + linkedList);
            if(linkedList.isCyclic()){
                System.out.println("Linked List is cyclic ");

            }
            else{
                System.out.println("LinkedList is not cyclic ");

            }
        }
}
