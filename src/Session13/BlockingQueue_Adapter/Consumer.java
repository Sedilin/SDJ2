package Session13.BlockingQueue_Adapter;

public class Consumer implements Runnable{

    Buffer<String> queueADT;

    public Consumer(Buffer<String> queueADT)
    {
        this.queueADT = queueADT;
    }
    @Override
    public void run() {
        while (true)
        {
            queueADT.take();
        }
    }
}
