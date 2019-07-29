/**
 * purpose: to remove duplicate nodes in linked list
 *
 */
class RemoveDupLinkedList {
    static Node4 head;
    static class Node4{
        int data;
        Node4 next;
        Node4(int d){
            data = d;
            next = null;
        }
    }
    void PrintLikedList(Node4 node4) {
        while (node4 != null) {
            System.out.println( " LinkedList  is : " + node4.data );
            node4 = node4.next;
        }
    }

        void Remove_duplicates(){
            Node4 ptr1 = null, ptr2 = null, dup = null;
            ptr1 = head;

            /**
             * Pick elements One by one
             */
            while(ptr1 != null && ptr1.next != null){
                ptr2 = ptr1;
                while(ptr2.next != null){
                    if(ptr1.data == ptr2.next.data){
                        dup = ptr2.next;
                        ptr2.next = ptr2.next.next;
                        System.gc();
                    }else{
                        ptr2 = ptr2.next;
                    }
                }
                ptr1 = ptr1.next;
            }

        }
        public static void main(String[] args){
            RemoveDupLinkedList removeDupLinkedList = new RemoveDupLinkedList();
            removeDupLinkedList.head = new Node4(20);
            removeDupLinkedList.head.next = new Node4(30);
            removeDupLinkedList.head.next.next = new Node4( 40 );
            removeDupLinkedList.head.next.next.next = new Node4(40);
            removeDupLinkedList.head.next.next.next.next = new Node4(50);
            //Linked List before Removing the last node
            System.out.println(" The Linked List before removing the last node : " );
            removeDupLinkedList.PrintLikedList( head );
            System.out.println("The Linked List after removing the last node : ");
            removeDupLinkedList.Remove_duplicates();
            removeDupLinkedList.PrintLikedList( head );
        }
}
