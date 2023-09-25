public class Practice {
    public static void main(String[] args) {
        String name1 = "Alex";
        String name2 = "Alex";
        System.out.println(name1.equals(name2));
        System.out.println(name1==name2);

        String name3 = new String("Alex");
        String name4 = new String("Alex");
        System.out.println(name3.equals(name4));
        System.out.println(name3 == name4);



        // String is an object because it has its own methods
        //we use String to store some data
    }
}
