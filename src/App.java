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

    public void addLeftChild(Node toAdd){
        leftChild=toAdd;
    }

    public void addRightChild(Node toAdd){
        rightChild=toAdd;
    }

    public int height(){
        if (leftChild==null && rightChild==null)
            return 1;

        int leftHeight=leftChild==null ? 0 : leftChild.height();
        int rightHeight=rightChild==null ? 0 : rightChild.height();

        return Math.max(leftHeight,rightHeight)+1;
    }

    public int leaves(){
        if (leftChild==null && rightChild==null)
            return 1;

        int leftLeaves=leftChild==null ? 0 : leftChild.leaves();
        int rightLeaves=rightChild==null ? 0 : rightChild.leaves();

        return leftLeaves+rightLeaves;
    }


}

class Tree{

    //This class represents the entire tree
    
}

public class App {

    
    public static void main(String[] args) throws Exception {
        
    }
}
