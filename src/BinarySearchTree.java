/**
 * Purpose: to search values in a binary tree
 * Data structures: tree
 * @root node
 * @left child
 * @right child
 */

class Node1 {

    int data;

    Node1 left;

    Node1 right;

    public Node1(int data) {

        this.data = data;

        left = null;

        right = null;

    }

}

public class BinarySearchTree {

    public static Node1 root;

    public BinarySearchTree() {

        this.root = null;

    }


    public boolean find(int id) {

        Node1 current = root;

        while (current != null) {

            if (current.data == id) {

                return true;

            } else if (current.data > id) {

                current = current.left;

            } else {

                current = current.right;

            }

        }

        return false;

    }

    public boolean delete(int id) {

        Node1 parent = root;

        Node1 current = root;

        boolean isLeftChild = false;

        while (current.data != id) {

            parent = current;

            if (current.data > id) {

                isLeftChild = true;

                current = current.left;

            } else {

                isLeftChild = false;

                current = current.right;

            }

            if (current == null) {

                return false;

            }

        }

        //if i am here that means we have found the node

        //Case 1: if node to be deleted has no children

        if (current.left == null && current.right == null) {

            if (current == root) {

                root = null;

            }

            if (isLeftChild == true) {

                parent.left = null;

            } else {

                parent.right = null;

            }

        }

        //Case 2 : if node to be deleted has only one child

        else if (current.right == null) {

            if (current == root) {

                root = current.left;

            } else if (isLeftChild) {

                parent.left = current.left;

            } else {

                parent.right = current.left;

            }

        } else if (current.left == null) {

            if (current == root) {

                root = current.right;

            } else if (isLeftChild) {

                parent.left = current.right;

            } else {

                parent.right = current.right;

            }

        } else if (current.left != null && current.right != null) {


            //now we have found the minimum element in the right sub tree

            Node1 successor = getSuccessor( current );

            if (current == root) {

                root = successor;

            } else if (isLeftChild) {

                parent.left = successor;

            } else {

                parent.right = successor;

            }

            successor.left = current.left;

        }

        return true;

    }


    public Node1 getSuccessor(Node1 deleleNode) {

        Node1 successsor = null;

        Node1 successsorParent = null;

        Node1 current = deleleNode.right;

        while (current != null) {

            successsorParent = successsor;

            successsor = current;

            current = current.left;

        }

        //check if successor has the right child, it cannot have left child for sure

        // if it does have the right child, add it to the left of successorParent.

//		successsorParent

        if (successsor != deleleNode.right) {

            successsorParent.left = successsor.right;

            successsor.right = deleleNode.right;

        }

        return successsor;

    }

    public void insert(int id) {

        Node1 newNode = new Node1( id );

        if (root == null) {

            root = newNode;

            return;

        }

        Node1 current = root;

        Node1 parent = null;

        while (true) {

            parent = current;

            if (id < current.data) {

                current = current.left;

                if (current == null) {

                    parent.left = newNode;

                    return;

                }

            } else {

                current = current.right;

                if (current == null) {

                    parent.right = newNode;

                    return;

                }

            }

        }

    }

    public void display(Node1 root) {

        if (root != null) {

            display( root.left );

            System.out.print( " " + root.data );

            display( root.right );

        }

    }

    public static void main(String arg[]) {

        BinarySearchTree b = new BinarySearchTree();

        b.insert( 3 );
        b.insert( 8 );

        b.insert( 1 );
        b.insert( 4 );
        b.insert( 6 );
        b.insert( 2 );
        b.insert( 10 );
        b.insert( 9 );

        b.insert( 20 );
        b.insert( 25 );
        b.insert( 15 );
        b.insert( 16 );

        System.out.println( "Original Tree : " );

        b.display( b.root );

        System.out.println( "" );

        System.out.println( "Check whether Node with value 4 exists : " + b.find( 4 ) );

        System.out.println( "Delete Node with no children (2) : " + b.delete( 2 ) );

        b.display( root );

        System.out.println( "\n Delete Node with one child (4) : " + b.delete( 4 ) );

        b.display( root );

        System.out.println( "\n Delete Node with Two children (10) : " + b.delete( 10 ) );

        b.display( root );

    }

}


