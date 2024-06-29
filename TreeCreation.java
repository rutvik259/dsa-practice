public class TreeCreation {

    public static void main(String args[]){

        Node root=new Node(5);
        Node leftChild= new Node(6);
        Node rightChild= new Node(7);
        root.setLeftChild(leftChild);
        root.setRightChild(rightChild);
        root.outputLeft();
        root.outputRight();        

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

    void outputLeft(){
        System.out.println("Left child for "+this.value+" is "+this.getLeftChild());
    }

    void outputRight(){
        System.out.println("Right child for "+this.value+" is "+this.getRightChild());
    }

}