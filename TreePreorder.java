public class TreePreorder {

    public static void main(String args[]){

        Node root=new Node(1);
        Node leftChild= new Node(2);
        Node rightChild= new Node(3);
        Node leftleftchild= new Node(4);
        Node leftRightChild= new Node(5);
        Node rightRightChild= new Node(6);
;       root.setLeftChild(leftChild);
        root.setRightChild(rightChild);
        leftChild.setLeftChild(leftleftchild);
        leftChild.setRightChild(leftRightChild);
        rightChild.setRightChild(rightRightChild); 

        traversePreorder(root);
        

    }

    static void traversePreorder(Node node){

        if(node == null)
        return;

        System.out.println(node.value+ " ");
        traversePreorder(node.leftChild);
        traversePreorder(node.rightChild);


    }
    
}

class Node{
    Node leftChild;
    Node rightChild;
    int value;


    Node(int n){
        this.value=n;
    }

    void setLeftChild(Node leftChild){
        this.leftChild=leftChild;
    }

    int getLeftChild(){
        return this.leftChild.value;
    }

    void setRightChild(Node rightChild){
        this.rightChild=rightChild;
    }

    int getRightChild(){
        return this.rightChild.value;
    }

}