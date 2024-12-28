package JavaTest;

public class DeadlockExample {
    public static void main(String[] args) {
        final String resource1 = "Resource1";
        final String resource2 = "Resource2";

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked resource 1");
                try {
                    System.out.println("Try-Catch Block is blocked-1");
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {
                    System.out.println("Thread 1: Locked resource-2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked resource 2");
                try {
                    System.out.println("Try-Catch Block is blocked-2");
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (resource1) {
                    System.out.println("Thread 2: Locked resource-1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
