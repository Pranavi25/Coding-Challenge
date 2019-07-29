public class LinkedList {
    Node head; //head of list
    static class Node{
        int data;
        Node next;
        // Constructor
        Node(int d){
            data = d;
            next = null;
        }
    }
    // Method to insert new node
    public static LinkedList insert(LinkedList list, int data){
        // create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        //insert new node
        //if the linked list is empty then new node is head then new node is head
        if(list.head == null){
            list.head = new_node;
        }
        else{
            //else, traverse the list till last
            //insert the new node at the last
            Node last = list.head;
            while(last.next!= null){
                last = last.next;
            }
            //insert the new node at the last node
            last.next = new_node;
        }
        //Return list by head
        return list;
        //System.out.println();
    } // close of the insert new node

    public static void printList(LinkedList list){
        // current node is the head
        Node currNode = list.head;
        System.out.println("The Linked List is :");
        //check if current node is not null then print
        while(currNode != null){
            System.out.println(currNode.data+" ");
            //go to next node
            currNode=currNode.next;
        }
        System.out.println();
    } // close of Printing Linked List
    //Delete key
    public static LinkedList deleteByKey(LinkedList list, int key){
        // Store head
        Node currNode = list.head;
        Node prev = null;
        //Case 1:
        // If the head node is the key then change the head to currNode.next
        if (currNode != null && currNode.data == key){
            list.head = currNode.next; //changed the head

        }
        //case 2:
        //If the current node is not the key then search for the key
        //keep track of previous node to change it's next node to currNode.next
        while(currNode != null && currNode.data != key){
            //if current node does not hold key move to next node
            prev = currNode;
            currNode = currNode.next;
        }
        //if key was present, it should be at currNode so currNode should be null
        if(currNode != null ) {
            //since key is at currentNode unlink the key from th elinked list
            prev.next = currNode.next;
            //Display the message
            System.out.println(key + " Found and Deleted");
        }
        //case 3:
        //The key is not present
        if(currNode == null){
            //Display the message
            System.out.println(key+" Not found");
        }
        //return list
        return list;
    }//close the deletion
    public static void main(String[] args){
        //create an empty LinkedList
        LinkedList list = new LinkedList();
        //Insertion
        //Insert values into the list
        list = insert(list,1);
        list = insert(list,2);
        list = insert(list,3);
        list = insert(list,4);
        list = insert(list,5);
        //Print the LinkedList
        printList(list);
        //delete the node
        deleteByKey(list,4);
        printList(list);
        deleteByKey(list,1);
        printList(list);

    }//close of driver code
}//close of the linkedList; The end

