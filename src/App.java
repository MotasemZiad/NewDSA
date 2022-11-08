import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayList<String> list = new ArrayList<String>();

        list.add("Motasem");
        list.add("Ahmed");
        list.add("Fawzy");
        // list.add(2); // Compile time error
        String s = list.get(1); // Type casting is not required
        System.out.println("The second element: " + s);

        Iterator<String> itr = list.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());

        Integer[] arrayOfIntegers = new Integer[] { 2, 35, 23, 19, 92 };
        Character[] arrayOfCharacters = new Character[] { 'C', 'F', 'W', 'A', 'D' };
        sort(arrayOfIntegers);
        sort(arrayOfCharacters);

        System.out.println(Arrays.toString(arrayOfIntegers));
        System.out.println(Arrays.toString(arrayOfCharacters));

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