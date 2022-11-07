import DataStructures.Linear.Dynamic.CustomQueue;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        CustomQueue queue = new CustomQueue(8);
        queue.enQueue(0);
        queue.enQueue(2);
        queue.enQueue(4);
        queue.enQueue(19);
        queue.enQueue(21);
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}