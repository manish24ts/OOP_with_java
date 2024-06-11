class demo6 {
    public static void main(String args[]) {
        SharedValue s = new SharedValue();
        rand1 t1 = new rand1(s);
        t1.setName("Thread 1");
        rand2 t2 = new rand2(s);
        t2.setName("Thread 2");
        t1.start();
        t2.start();
    }
}

class SharedValue {
    int i = 1000;

    synchronized public void halve() {
        while(i != 0) {
            System.out.println(Thread.currentThread().getName() + " : " + (i = i / 2));
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    synchronized public void doubleValue() {
        while(i != 0) {
            System.out.println(Thread.currentThread().getName() + " : " + (i = i * 2));
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class rand1 extends Thread {
    SharedValue v;

    rand1(SharedValue v) {
        this.v = v;
    }

    public void run() {
        v.doubleValue();
    }
}

class rand2 extends Thread {
    SharedValue v;

    rand2(SharedValue v) {
        this.v = v;
    }

    public void run() {
        v.halve();
    }
}
