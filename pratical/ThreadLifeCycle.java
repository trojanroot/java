class LifeCycleThread extends Thread {
    private final Object lock;

    LifeCycleThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread is in New state");
            Thread.sleep(1000);
            System.out.println("After sleep: Timed_waiting completed");
            synchronized (lock) {
                System.out.println("Thread is in WAITING state");
                lock.wait();
                System.out.println("After notify: WAITING complette");
            }
            System.out.println("Thread resumed from Waiting state");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadLifeCycle {
    public static void main(String[] args) {
        Object lock = new Object();
        LifeCycleThread t1 = new LifeCycleThread(lock);
        System.out.println("1. NEW " + t1.getState());

        t1.start();
        System.out.println("2. Running " + t1.getState());
        try {

            Thread.sleep(500);
            System.out.println("3. During sleep " + t1.getState());

            Thread.sleep(1000);
            System.out.println("4. During wait " + t1.getState());

            synchronized (lock) {
                lock.notify();
            }
            t1.join();
            System.out.println("5. TERMINATED: " + t1.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
