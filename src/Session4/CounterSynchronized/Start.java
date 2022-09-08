package Session4.CounterSynchronized;

public class Start {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread counterIncrementer1 = new Thread(new CounterIncrementer(counter));
        Thread counterIncrementer2 = new Thread(new CounterIncrementer(counter));

        counterIncrementer1.start();
        counterIncrementer2.start();
    }
}
