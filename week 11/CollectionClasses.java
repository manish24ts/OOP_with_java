import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Random;

public class CollectionClasses{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        Random num = new Random();
        for(int i=0;i<5;i++){
            list.add(num.nextInt(100));
            queue.add(num.nextInt(100));
            set.add(num.nextInt(100));
            map.put(i,num.nextInt(100));
        }
        System.out.println("List => "+list);
        System.out.println("Queue => "+queue);
        System.out.println("Set => "+set);
        System.out.println("Map => "+map);

        Collections.sort(list);
        System.out.println("List in ascending order => "+list);
        System.out.println("Largest element in set => "+ Collections.max(set));
        System.out.println("Smallest element in set => "+ Collections.min(set));
        Collections.reverse(list);
        System.out.println("List in reverse order => "+list);
        Collections.shuffle(list);
        System.out.println("List after shuffle => "+list);
    }
}