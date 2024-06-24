import java.util.*;
public class ArrayListAdd{
    public static void main(String[] args) {
        ArrayList<String> list_1 = new ArrayList<String>();
        ArrayList list_2 = new ArrayList();
        list_1.add("BTech");
        System.out.println("List_1 = "+list_1);
        list_1.add("Class");
        System.out.println("List_1 = "+list_1);
        list_1.add(1,"Smart");
        System.out.println("List_1 = "+list_1);
        list_2.add(list_1);
        System.out.println("List_2 = "+list_2);
        list_2.addAll(list_1);
        System.out.println("List_2 = "+list_2);
    }
}