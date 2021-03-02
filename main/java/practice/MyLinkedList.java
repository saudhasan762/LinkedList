package practice;

public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if (this.tail==null){
            this.tail=newNode;
        }
        if (this.head==null){
            this.head=newNode;
        }else {
            INode tempNode = this.head;
            this.head= newNode;
            this.head.setNext(tempNode);
        }
    }

    public void printMyNode(){
        StringBuffer myNode = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null){
            myNode.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNode.append("->");
            tempNode = tempNode.getNext();
        }
        myNode.append(tempNode.getKey());
        System.out.println(myNode);
    }
}