public class QueueDemo {
    public static void main(String[] args) {
        Queue q = new Queue(3);

        try {
            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);
            q.display();

            // Trigger overflow
            q.enqueue(40);
        } catch (QueueException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Dequeued: " + q.dequeue());
            System.out.println("Dequeued: " + q.dequeue());
            System.out.println("Dequeued: " + q.dequeue());

            // Trigger underflow
            System.out.println("Dequeued: " + q.dequeue());
        } catch (QueueException e) {
            System.out.println("Error: " + e.getMessage());
        }

        q.display();
    }
}

class QueueException extends Exception {
    public QueueException(String message) {
        super(message);
    }
}

// Queue Implementation
class Queue {
    private int[] queue;
    private int front, rear, size;

    public Queue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int data) throws QueueException {
        if (size == queue.length) {
            throw new QueueException("Queue Overflow: Cannot add " + data);
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = data;
        size++;
    }

    public int dequeue() throws QueueException {
        if (size == 0) {
            throw new QueueException("Queue Underflow: Cannot remove element");
        }
        int removed = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return removed;
    }

    public void display() {
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }
        System.out.println();
    }
}
