
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    
    @Test
    void nodeCreation(){
        var node=new Node(5);
        assertEquals(5,node.value);
        assertEquals(null,node.leftChild);
        assertEquals(null,node.rightChild);
    }

    @Test
    void leftChildAddition(){
        var node=new Node(7);
        var left=new Node(8);
        node.addLeftChild(left);
        assertEquals(7,node.value);
        assertEquals(null,node.rightChild);
        assertEquals(8,node.leftChild.value);
        assertEquals(null,node.leftChild.rightChild);
        assertEquals(null,node.leftChild.leftChild);
    }

    @Test
    void rightChildAddition(){
        var node=new Node(7);
        var right=new Node(8);
        var rright=new Node(2);
        node.addRightChild(right);
        right.addRightChild(rright);
        assertEquals(7,node.value);
        assertEquals(8,node.rightChild.value);
        assertEquals(null,node.rightChild.leftChild);
        assertEquals(2,node.rightChild.rightChild.value);
        assertEquals(null,node.rightChild.rightChild.rightChild);
    }
}
