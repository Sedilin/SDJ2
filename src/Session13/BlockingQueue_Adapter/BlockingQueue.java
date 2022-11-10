package Session13.BlockingQueue_Adapter;


public class BlockingQueue<T> implements Buffer<T> {

    private QueueADT<T> queueADT;

    private int capacity;

    public BlockingQueue(int capacity)
    {
        this.capacity = capacity;
        queueADT = new BoundedArrayQueue<T>(capacity);
    }

    @Override
    public String toString() {
        return String.valueOf(capacity);
    }

    @Override
    public synchronized void put(T element) {
        while (queueADT.isFull())
        {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queueADT.enqueue(element);
        System.out.println("Put");
        notifyAll();
    }

    @Override
    public synchronized T take() {
        while (queueADT.isEmpty())
        {
            try {
                System.out.println("Consumer started waiting");
                System.out.println(queueADT.size());
                wait();
                System.out.println(queueADT.size());
                System.out.println("Consumer stopped waiting");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        notifyAll();
        System.out.println("Take");
        return queueADT.dequeue();

    }

    @Override
    public synchronized T look() {
        if (queueADT.isEmpty())
        {
            return null;
        }
        return queueADT.first();
    }

    @Override
    public synchronized boolean isEmpty() {
        return queueADT.isEmpty();
    }

    @Override
    public synchronized boolean isFull() {
        return queueADT.isFull();
    }

    @Override
    public synchronized int size() {
        return queueADT.size();
    }
}
