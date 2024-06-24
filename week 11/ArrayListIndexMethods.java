import java.util.*;
public class ArrayListIndexMethods{
    public static void main(String[] args) {
        ArrayList<String> list_1 = new ArrayList<String>();
        list_1.add("BTech");
        list_1.add("smart");
        list_1.add("class");
        list_1.add("-");
        list_1.add("Java");
        list_1.add("tutorial");
        list_1.add("class");
        System.out.println("Element at index of 4 is : "+list_1.get(4));
        System.out.println("sublist from index 1 to 4 is : "+list_1.subList(1,4));
        System.out.println("Index of element \'Class\' is : "+list_1.indexOf("class"));
        System.out.println("Last index of element \'Class\' is : "+list_1.lastIndexOf("class"));
    }
}