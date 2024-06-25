import java.util.*;

public class HashTableDemo {

    public static void main(String[] args) {
        Random num = new Random();
        Hashtable<Integer, Integer> table = new Hashtable<>();

        // put(key, value)
        for (int i = 1; i <= 5; i++) {
            table.put(i, num.nextInt(100));
        }

        System.out.println("Hashtable => " + table);

        // get(key)
        System.out.println("\nValue associated with key 3 => " + table.get(3));
        System.out.println("Value associated with key 30 => " + table.get(30));

        // keySet()
        System.out.println("\nKeys => " + table.keySet());

        // values()
        System.out.println("\nValues => " + table.values());

        // entrySet()
        System.out.println("\nKey. Value pairs as a set => " + table.entrySet());

        // hashCode()
        System.out.println("\nHash code => " + table.hashCode());

        // size()
        System.out.println("\nTotal number of elements => " + table.size());

        // isEmpty()
        System.out.println("\nEmpty status of Hashtable => " + table.isEmpty());
    }
}
