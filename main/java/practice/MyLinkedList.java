package practice;

public class MyLinkedList<K> {
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

    public INode append(INode newNode) {
        if (this.head==null){
            this.head=newNode;
        }
        if (this.tail==null){
            this.tail=newNode;
        }else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        return newNode;
    }

    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode pop() {
        INode tempnode = this.head;
        this.head = head.getNext();
        return tempnode;
    }

    public void popLast() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)){
            tempNode=tempNode.getNext();
        }
        this.tail=tempNode;
        tempNode.setNext(null);
    }

    public boolean search(INode key) {
        INode tempNode = head;
        while(tempNode !=null && tempNode.getNext()!=null) {
            if (tempNode.getKey()==key.getKey()) {
                return true;
            }
            tempNode = tempNode.getNext();
        }
        return false;
    }

    public INode searchAndInsertNode(INode newNode, INode searchNode) {

            boolean check = search(searchNode);
            if (check) {
                insert(searchNode, newNode);
            } else{
                System.out.println("No Node with the value Exists");
            }
            INode newPosition = head.getNext();
            return newPosition;
    }

    public void deleteNode(INode newNode) {
        boolean check = search(newNode);
        if (check) {
            INode tempNode = this.head;
            INode previousNode = null;
            while (tempNode != null && tempNode.getKey() != newNode.getKey()) {
                previousNode = tempNode;
                tempNode = tempNode.getNext();
            }
            previousNode.setNext(tempNode.getNext());
        }
    }

    public INode<K> search(K key) {
        INode<K> tempNode = head;
        while (tempNode != null && tempNode.getNext() != null){
            if(tempNode.getKey().equals(key))
                return tempNode;
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public void printMyNodes(){
        System.out.println("My Nodes: " + head);
    }

    @Override
    public String toString(){
        return "MyLinkedListNodes{" + head + '}';
    }
}
