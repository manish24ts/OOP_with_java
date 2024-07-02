import java.io.*;
public class LinkedListInsert{
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static LinkedListInsert insert(LinkedListInsert list, int data)
    {
        Node new_node = new Node(data);
        if(list.head == null)
        {
            list.head = new_node;
        }
        else
        {
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    public static void printList(LinkedListInsert list)
    {
        Node curr_node = list.head;
        System.out.println("Lisked list is ");
        while(curr_node != null)
        {
            System.out.print(curr_node.data + " ");
            curr_node = curr_node.next;
        }
    }
    public static void main(String agrs[])
    {
        LinkedListInsert list = new LinkedListInsert();
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
    }
}