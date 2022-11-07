package Dummy;

public class Counter {
    private int count;

    public Counter(int count) {
        this.count = count;
    }

    public Counter() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void increment() {
        count++;
    }

    public void increment(int delta) {
        count += delta;
    }

    public void decrement() {
        count--;
    }

    public void decrement(int delta) {
        count -= delta;
    }

    public void reset() {
        count = 0;
    }

}
