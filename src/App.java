public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
    }

    public static boolean binarySearch(int[] data, int target, int low, int high) {
        if (low > high) {
            return false;
        } else {
            int mid = (low + high) / 2;
            if (target == data[mid]) {
                return true;
            } else if (target < data[mid]) {
                return binarySearch(data, target, low, mid - 1);
            } else {
                return binarySearch(data, target, mid + 1, high);
            }
        }
    }

    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0)
            throw new IllegalArgumentException();
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static int sum1(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++)
            sum += i;
        return sum;
    }

    public static int sum2(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++)
            for (int j = 0; j < i; j++)
                sum += 1;
        return sum;
    }

    public static int sum3(int n) {
        int sum = n * (n + 1) / 2;
        return sum;
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