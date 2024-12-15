package Threading;

class MSOffice extends Thread {
    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("typing")) {
            typing();
        } else if (Thread.currentThread().getName().equals("spellCheck")) {
            spellCheck();
        } else {
            saving();
        }
    }

    public void typing() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Typing....");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void saving() {

    }

    public void spellCheck() {

    }
}

public class RaceCondition {

}
