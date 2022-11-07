import DataStructures.Linear.Dynamic.CustomQueue;
import Dummy.Counter;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // CustomQueue queue = new CustomQueue(8);
        // queue.enQueue(0);
        // queue.enQueue(2);
        // queue.enQueue(4);
        // queue.enQueue(19);
        // queue.enQueue(21);
        // System.out.println(queue.deQueue());
        // System.out.println(queue.deQueue());

        Counter c;
        c = new Counter();

        c.increment();
        c.increment(3);
        int temp = c.getCount();
        System.out.println(temp);
        c.reset();
        System.out.println(c.getCount());
        Counter d = new Counter(5);
        d.increment();
        System.out.println(d.getCount());
        Counter e = d;
        temp = e.getCount();
        System.out.println(temp);
        e.increment(2);
        System.out.println(e.getCount());
        System.out.println(d.getCount());
    }
}