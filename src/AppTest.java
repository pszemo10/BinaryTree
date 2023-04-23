
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

    @Test
    void heightOfSubtree1(){
        var node=new Node(7);
        var right=new Node(8);
        var rright=new Node(2);
        node.addRightChild(right);
        right.addRightChild(rright);

        assertEquals(1,rright.height());
        assertEquals(2,right.height());
        assertEquals(3,node.height());
    }

    @Test
    void heightOfSubtree2(){
        var node=new Node(7);
        var left=new Node(8);
        var right=new Node(2);
        node.addLeftChild(left);
        node.addRightChild(right);

        assertEquals(1,right.height());
        assertEquals(1,left.height());
        assertEquals(2,node.height());
    }

    @Test
    void leavesOfSubtree1(){
        var node=new Node(7);
        var right=new Node(8);
        var rright=new Node(2);
        node.addRightChild(right);
        right.addRightChild(rright);

        assertEquals(1,rright.leaves());
        assertEquals(1,right.leaves());
        assertEquals(1,node.leaves());
    }

    @Test
    void leavesOfSubtree2(){
        var node=new Node(7);
        var left=new Node(8);
        var right=new Node(2);
        node.addLeftChild(left);
        node.addRightChild(right);

        assertEquals(1,right.leaves());
        assertEquals(1,left.leaves());
        assertEquals(2,node.leaves());
    }
}
