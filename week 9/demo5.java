class demo5 implements Runnable
{
    public static void main(String args[]) throws InterruptedException
    {
        for(int i=0;i<10;i++)
        {
            Child c = new Child();
            demo5 m = new demo5();
            Thread t1 = new Thread(c);
            t1.setName("Thread 1");
            Thread t2 = new Thread(m);
            t2.setName("Thread 2");
            t2.start();
            t2.join();
            t1.start();
            Thread.sleep(1000);
        }
    }
    public void run()
    {
        System.out.println("Hello " + "");
    }
}
class Child implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}
