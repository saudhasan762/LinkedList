package practice;

public class MyStack {
    public MyLinkedList myLinkedList;

    public MyStack(){
        this.myLinkedList = new MyLinkedList();
    }
    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }

    public void printMyStack() {
        myLinkedList.printMyNode();
    }

    public INode peak() {
        return myLinkedList.head;
    }

    public INode pop() {
        return myLinkedList.pop();
    }
}
