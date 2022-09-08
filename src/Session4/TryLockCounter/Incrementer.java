package Session4.TryLockCounter;

public class Incrementer implements Runnable{

    private final TryLockCounter counter;

    public Incrementer(TryLockCounter counter)
    {
        this.counter = counter;
    }


    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            try {
                counter.inc();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(counter.get());
    }
}
