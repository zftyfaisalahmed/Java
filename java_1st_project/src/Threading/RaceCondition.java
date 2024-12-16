package Threading;

class MSOffice extends Thread {
    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("Typing")) {
            Typing();
        } else if (Thread.currentThread().getName().equals("SpellCheck")) {
            SpellCheck();
        } else if (Thread.currentThread().getName().equals("Saving")) {
            Saving();
        }
    }

    public void Typing() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Typing........");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void SpellCheck() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("SpellCheck........");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Saving() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Saving........");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

public class RaceCondition {
    public static void main(String[] args) {
        MSOffice ms1 = new MSOffice();
        ms1.setName("Typing");
        ms1.start();

        MSOffice ms2 = new MSOffice();
        ms2.setName("SpellCheck");
        ms2.start();

        MSOffice ms3 = new MSOffice();
        ms3.setName("Saving");
        ms3.start();

    }

}