package Threading;

class HumanBeing extends Thread {

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

public class ThreadCode4 {
    public static void main(String[] args) {

        HumanBeing h1 = new HumanBeing();
        h1.setName("Boy");
        HumanBeing h2 = new HumanBeing();
        h2.setName("Girls");
        HumanBeing h3 = new HumanBeing();
        h3.setName("others");

        h1.start();
        h2.start();
        h3.start();

    }
}