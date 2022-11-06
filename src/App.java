public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        CustomQueue queue = new CustomQueue(8);
        queue.enQueue(0);
        queue.enQueue(2);
        queue.enQueue(4);
        queue.enQueue(19);
        queue.enQueue(21);
    }
}

class CustomQueue {
    private int arr[];
    private int front;
    private int rear;

    CustomQueue(int size) {
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    void enQueue(int x) {
        arr[++rear] = x;
    }

    int deQueue() {
        int el = arr[front];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return el;
    }

}