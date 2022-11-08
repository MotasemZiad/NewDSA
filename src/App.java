public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] myArray = { 1, 2, 3, 4, 5 };

        try {
            System.out.println(myArray[10]);
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("Try Catch Block end");
        }

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