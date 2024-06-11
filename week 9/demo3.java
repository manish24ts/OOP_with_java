
class demo3 {
    public static void main(String args[]) {
        MyThread t = new MyThread();
        t.start();
        t.setName("Manish");
        t.setPriority(5);
        System.out.println("Thread name is "+ t.getName());
        System.out.println("Thread priority is "+ t.getPriority());
    }
}

class MyThread extends Thread {
    public void run() {
        for (int j = 0; j < 10; j++) {
            System.out.println("Multithreading is executing");
        }
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}