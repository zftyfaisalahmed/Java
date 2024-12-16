package Threading;

class Human extends Thread {

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " has entered the bathroom");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " has using the bathroom");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " has left the bathroom");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class JoinMethod {
    public static void main(String[] args) throws InterruptedException {

        Human h1 = new Human();
        h1.setName("Boy");
        Human h2 = new Human();
        h2.setName("Girls");
        Human h3 = new Human();
        h3.setName("others");

        h1.start();
        h1.join();
        h2.start();
        h2.join();
        h3.start();
        h3.join();

    }

}