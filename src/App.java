public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

    }

    public static void checkAge(int age) throws Exception {
        if (age < 18)
            throw new Exception("Access denied - You must be at least 18 years old.");
        else
            System.out.println("Access granted - You are old enough!");
    }

    public static <T> void swap(T[] a, int i, int j) {
        if (i != j) {
            T temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public static <T extends Comparable<T>> void sort(T[] items) {
        for (int i = 0; i < items.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < items.length; j++) {
                if (items[j].compareTo(items[smallest]) >= 0) {
                    smallest = j;
                }
            }
            swap(items, smallest, i);
        }
    }
}