public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        boolean obj = new Boolean(true);
        obj = false;
        System.out.println(obj);

        char ch = new Character('a');
        System.out.println(ch);

        long l = new Long((long) 100234L);
        System.out.println(l);

        int i = new Integer(202);
        System.out.println(i);

        double d = new Double(3.1492);
        System.out.println(d);
    }
}