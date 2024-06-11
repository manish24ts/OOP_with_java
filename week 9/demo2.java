
class demo2 {
    public static void main(String args[]) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.setName("Venue thread");
        MyThread t2 = new MyThread();
        t2.setName("sequence thread");
        MyThread t3 = new MyThread();
        t3.setName("distribution thread");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

    }
}

class MyThread extends Thread {
    public void run() {
        for (int j = 0; j < 4; j++) {
            System.out.println(currentThread().getName() + " is executing");
        }
    }
}