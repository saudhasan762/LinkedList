package practice;

public class MyQueue {
    public MyLinkedList myLinkedList;

    public MyQueue(){
        this.myLinkedList = new MyLinkedList();
    }

    public INode enqueue(INode myNode) {
        return myLinkedList.append(myNode);
    }

    public void printQueue() {
        myLinkedList.printMyNode();
    }

    public INode peak() {
        return myLinkedList.head;
    }

    public INode dequeue() {
        return myLinkedList.pop();
    }
}
