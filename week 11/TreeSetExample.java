import java.util.*;

public class TreeSetExample {
    public static void main(String args[]) {
        // Use generics to specify that the TreeSet holds Integer objects
        TreeSet<Integer> set = new TreeSet<>();
        Random num = new Random();

        // Add 10 random integers to the TreeSet
        for (int i = 0; i < 10; i++) {
            set.add(num.nextInt(100));
        }

        // Get an iterator for the TreeSet
        Iterator<Integer> collection = set.iterator();

        // Print all elements of the TreeSet
        System.out.println("All the elements of TreeSet collection:");
        while (collection.hasNext()) {
            System.out.println(collection.next());
        }
    }
}
