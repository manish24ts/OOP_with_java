import java.util.*;

public class VectorDemo {

    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();

        list.add(10);
        list.add(30);
        list.add(0, 100);
        list.addElement(50);

        System.out.println("Vector => " + list);
        System.out.println("get(2) => " + list.get(2));
        System.out.println("firstElement() => " + list.firstElement());
        System.out.println("indexOf(50) => " + list.indexOf(50));
        System.out.println("contains(30) => " + list.contains(30));
        System.out.println("capacity() => " + list.capacity());
        System.out.println("size() => " + list.size());
        System.out.println("isEmpty() => " + list.isEmpty());
    }
}
