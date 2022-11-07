import Generics.Pair;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pair<String, Integer> pair = new Pair<String, Integer>("ID", 3);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}