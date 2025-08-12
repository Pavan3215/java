class SharedBuffer {
    private int data;
    private boolean isProduced = false;

    // Producer puts data
    public synchronized void produce(int value) {
        try {
            while (isProduced) {
                wait(); // Wait until data is consumed
            }
            data = value;
            isProduced = true;
            System.out.println("Produced: " + data);
            notify(); // Notify consumer
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Consumer consumes data
    public synchronized void consume() {
        try {
            while (!isProduced) {
                wait(); // Wait until data is produced
            }
            System.out.println("Consumed: " + data);
            isProduced = false;
            notify(); // Notify producer
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Producer thread
class Producer extends Thread {
    SharedBuffer buffer;

    Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(500); // Simulate time to produce
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Consumer thread
class Consumer extends Thread {
    SharedBuffer buffer;

    Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
            try {
                Thread.sleep(800); // Simulate time to consume
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Main class
public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
