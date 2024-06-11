import java.util.*;

class NameList {
    String name = "";
    public int count = 0;
    public static List<String> names = new ArrayList<>();

    public void addName(String name, List<String> list) {
        synchronized (this) {
            this.name = name;
            count++;
            list.add(name);
        }
    }

    public int getCount() {
        return count;
    }
}

class demo7 {
    public static void main(String[] args) {
        NameList n1 = new NameList();
        NameList n2 = new NameList();
        List<String> l = new ArrayList<String>();

        n1.addName("Ram", l);
        n2.addName("Seetha", l);

        System.out.println("Thread 1 : " + n1.name + " " + n1.getCount());
        System.out.println("Thread 2 : " + n2.name + " " + n2.getCount());
        System.out.println("Names in list: " + l);
    }
}
