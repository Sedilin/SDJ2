package Session4.CounterSynchronized;

public class CounterIncrementer implements Runnable{

    private final Counter counter;

    public CounterIncrementer (Counter counter)
    {
        this.counter = counter;

    }
    public void run()
    {
        for (int i = 0; i < 1000000; i++) {
            counter.inc1();
            counter.inc2();
        }
        System.out.println(counter.get1());
        System.out.println(counter.get2());
    }
}
