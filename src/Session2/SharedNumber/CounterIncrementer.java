package Session2.SharedNumber;

public class CounterIncrementer implements Runnable{

    private Counter counter;

    public CounterIncrementer(Counter counter)
    {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            counter.increment();
        }
        System.out.println(counter.returnCount());
    }
}
