import java.util.*;

import Generics.Pair;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pair<String, Integer> pair = new Pair<String, Integer>("ID", 3);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        ArrayList<String> list = new ArrayList<String>();
        list.add("rahul");
        list.add("jai");
        // list.add(32);//compile time error  
        String s = list.get(1);// type casting is not required  
        System.out.println("element is: " + s);
        Iterator<String> itr = list.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }
}