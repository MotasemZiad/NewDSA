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

    }
}