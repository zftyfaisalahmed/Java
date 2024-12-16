package Threading;

public class ThreadCode {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        Thread t1 = new Thread();
        System.out.println(t1);

        t1.setName("Faisal");
        t1.setPriority(2);
        System.out.println(t1);
    }
}