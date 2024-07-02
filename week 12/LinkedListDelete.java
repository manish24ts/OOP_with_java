import java.io.*;

public class LinkedListDelete {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static LinkedListDelete insert(LinkedListDelete list, int data) {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void printList(LinkedListDelete list) {
        Node curr_node = list.head;
        System.out.println("Linked list is: ");
        while (curr_node != null) {
            System.out.print(curr_node.data + " ");
            curr_node = curr_node.next;
        }
        System.out.println();
    }

    public static LinkedListDelete deleteByKey(LinkedListDelete list, int key) {
        Node curr_node = list.head;
        Node prev = null;

        if (curr_node != null && curr_node.data == key) {
            list.head = curr_node.next;
            System.out.println(key + " is deleted");
            return list;
        }

        while (curr_node != null && curr_node.data != key) {
            prev = curr_node;
            curr_node = curr_node.next;
        }

        if (curr_node != null) {
            prev.next = curr_node.next;
            System.out.println(key + " is deleted");
        } else {
            System.out.println(key + " is not present in the list");
        }

        return list;
    }

    public static void main(String args[]) {
        LinkedListDelete list = new LinkedListDelete();
        list.insert(list, 1);
        list.insert(list, 2);
        list.insert(list, 3);
        list.insert(list, 4);
        list.insert(list, 5);
        list.insert(list, 6);
        list.insert(list, 7);
        list.insert(list, 8);
        list.insert(list, 9);
        list.insert(list, 10);

        printList(list);

        list.deleteByKey(list, 5);
        printList(list);

        list.deleteByKey(list, 1);
        printList(list);

        list.deleteByKey(list, 10);
        printList(list);
    }
}
