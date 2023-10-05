package ra.bt3;

public class Queue implements Solution {
    Node front;
    Node rear;

    @Override
    public void enQueue(Integer inputData) {
        Node newNode = new Node(inputData);

        if (front == null) {
            this.front = this.rear = newNode;
            this.rear.setLink(newNode);
        } else {
            this.rear.setLink(newNode);
            this.rear = newNode;
            newNode.setLink(front);
        }
    }

    @Override
    public Integer deQueue() {
        if (this.front == null) {
            return null;
        }
        int data = this.front.getData();
        return null;
    }

    @Override
    public void displayQueue() {

    }
};