package ConsumerProducer;

class Queue {
    int x;
    boolean value_of_x = false;

    synchronized public void produce(int i) {
        try {
            if (value_of_x == false) {
                x = i;
                System.out.println("Producer had Produced the data : " + i + "into x");
                value_of_x = true;
                notify();
            } else {
                wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void consume(int i) {
        try {
            if (value_of_x == true) {
                x = i;
                System.out.println("Consumer had Consumed the data : " + x + "into x");
                value_of_x = false;
                notify();
            } else {
                wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class LaunchConsumerProducer {
    public static void main(String[] args) {
        Queue q = new Queue();

    }
}
