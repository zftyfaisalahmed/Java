package Threading;

class Warrior extends Thread {

    String res1 = "AK47";
    String res2 = "Snipper";
    String res3 = "Pistol";

    public void run() {
        if (Thread.currentThread().getName().equals("rama")) {
            ramaAcq();
        } else if (Thread.currentThread().getName().equals("ravana")) {
            ravanaAcq();
        }
    }

    public void ravanaAcq() {
        try {
            synchronized (res1) {
                System.out.println("Ravana has acquired " + res1);
                Thread.sleep(3000);
                synchronized (res2) {
                    System.out.println("Ravana has acquired " + res2);
                    Thread.sleep(3000);
                    synchronized (res3) {
                        System.out.println("Ravana has acquired " + res3);
                        Thread.sleep(3000);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ramaAcq() {

        try {
            synchronized (res1) {
                System.out.println("Rama has acquired " + res1);
                Thread.sleep(3000);
                synchronized (res2) {
                    System.out.println("Rama has acquired " + res2);
                    Thread.sleep(3000);
                    synchronized (res3) {
                        System.out.println("Rama has acquired " + res3);
                        Thread.sleep(3000);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

public class ThreadCode5 {
    public static void main(String[] args) {

        Warrior w1 = new Warrior();
        w1.setName("rama");
        Warrior w2 = new Warrior();
        w2.setName("ravana");

        w1.start();
        w2.start();
    }

}