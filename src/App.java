import DataStructures.Linear.Static.GameEntry;
import DataStructures.Linear.Static.Scoreboard;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        GameEntry gameEntry = new GameEntry("Ahmed Ali", 19);
        GameEntry gameEntry1 = new GameEntry("Mahmoud Ali", 36);
        GameEntry gameEntry2 = new GameEntry("Mohammed Ali", 9);
        GameEntry gameEntry3 = new GameEntry("Hassan Khalil", 28);

        System.out.println(gameEntry.toString());

        Scoreboard scoreboard = new Scoreboard(10);

        scoreboard.add(gameEntry);
        scoreboard.add(gameEntry1);
        scoreboard.add(gameEntry2);
        scoreboard.add(gameEntry3);
        System.out.println(scoreboard.toString());
        scoreboard.remove(4);
        System.out.println(scoreboard.toString());

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