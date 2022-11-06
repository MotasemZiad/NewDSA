package DataStructures;

public class CustomQueue {
    private int arr[];
    private int front;
    private int rear;

    public CustomQueue(int size) {
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    public void enQueue(int x) {
        arr[++rear] = x;
    }

    public int deQueue() {
        int element = arr[front];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return element;
    }

}
