package Threading;

class Human extends Thread {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " has entered the bathroom");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " is using the bathroom");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " has left the bathroom");
            Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}

public class TheadCode1 {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setName("Boy");
        Human h2 = new Human();
        h2.setName("Girl");
        Human h3 = new Human();
        h3.setName("Others");

        h1.start();
        h2.start();
        h3.start();
    }
}
