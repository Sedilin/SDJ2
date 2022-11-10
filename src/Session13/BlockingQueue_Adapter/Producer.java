package Session13.BlockingQueue_Adapter;

public class Producer implements Runnable{

    private final Buffer<String> queueADT;

    public Producer(Buffer<String> queueADT)
    {
        this.queueADT = queueADT;
    }

    @Override
    public void run() {
        while (true)
        {
            queueADT.put("Cookie");
        }
    }
}
