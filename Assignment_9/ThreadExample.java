package Assignment_9;

public class ThreadExample {

    static class MyThread extends Thread {
        public void run() {
            Thread.currentThread().setName("MyThread");
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " Value: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class MyRunnable implements Runnable {
        public void run() {
            Thread.currentThread().setName("MyRunnable");
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " Value: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunnable());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have finished execution.");
    }
}