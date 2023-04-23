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
        return 0;
    }

    public int leaves(){
        return 0;
    }


}

class Tree{

    //This class represents the entire tree
    
}

public class App {

    
    public static void main(String[] args) throws Exception {
        
    }
}
