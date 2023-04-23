class Node{

    //This class represents a single node in a tree

    int value;
    Node leftChild;
    Node rightChild;

    public Node(int n){

        //The constructor initializes node value with the given number
        //Child references are set to null
        
        value=n;
        leftChild=null;
        rightChild=null;
    }

    public Node(int n,Node left, Node right){

        //This constructor initializes node value with the given number
        //Child references are set to the values passed
        
        value=n;
        leftChild=left;
        rightChild=right;
    }

    public void addLeftChild(Node toAdd){
        leftChild=toAdd;
    }

    public void addRightChild(Node toAdd){
        rightChild=toAdd;
    }

    public int height(){

        //this method recursively computes the height
        //of the subtree rooted in the node

        if (leftChild==null && rightChild==null)
            return 1;

        int leftHeight= leftChild==null ? 0 : leftChild.height();
        int rightHeight= rightChild==null ? 0 : rightChild.height();

        return Math.max(leftHeight,rightHeight)+1;
    }

    public int leaves(){

        //this method recursively computes the number of leaves
        //in the subtree rooted in the node

        if (leftChild==null && rightChild==null)
            return 1;

        int leftLeaves=leftChild==null ? 0 : leftChild.leaves();
        int rightLeaves=rightChild==null ? 0 : rightChild.leaves();

        return leftLeaves+rightLeaves;
    }


}

class Tree{

    //This class represents the entire tree

    private Node root;

    Tree(Node r){
        root=r;
    }

    public int height(){
        return root.height();
    }

    public int leaves(){
        return root.leaves();
    }
    
}

public class App {

    
    public static void main(String[] args){

    }
}
