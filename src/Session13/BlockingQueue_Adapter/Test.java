package Session13.BlockingQueue_Adapter;

public class Test {
    public static void main(String[] args) {
        Buffer<String> buffer = new BlockingQueue<String>(6);

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }
}
