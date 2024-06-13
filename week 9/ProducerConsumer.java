import java.io.*;
import java.util.*;
class ProducerConsumer {
public static void main(String[] args) {
ItemQueue iq = new ItemQueue();
new Producer(iq);
new Consumer(iq);
}
}
class ItemQueue {
int item;
boolean valueSet = false;
synchronized int getItem() {
while (!valueSet) {
try {
wait();
} catch (InterruptedException e) {
System.out.println(e);
}
}
System.out.println("Consumed item:" + item);
valueSet = false;
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
System.out.println(e);
}
notify();
return item;
}
synchronized void putItem(int item) {
while (valueSet) {
try {
wait();
} catch (InterruptedException e) {
System.out.println(e);
}
}
this.item = item;
valueSet = true;
System.out.println("Produced item: " + item);
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
System.out.println(e);
}
notify();
}
}
class Producer implements Runnable {
ItemQueue iq;
Producer(ItemQueue iq) {
this.iq = iq;
new Thread(this, "Producer").start();
}
public void run() {
for (int i = 0; i < 5; i++) {
iq.putItem(i);
}
}
}
class Consumer implements Runnable {
ItemQueue iq;
Consumer(ItemQueue iq) {
this.iq = iq;
new Thread(this, "Consumer" ).start();
}
public void run() {
for (int i = 0; i  < 5; i++) {
iq.getItem();
}
}
}