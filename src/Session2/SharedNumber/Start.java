package Session2.SharedNumber;

public class Start {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread counterIncrementer = new Thread(new CounterIncrementer(counter));
//        Counter counter2 = new Counter();
//        Thread counterIncrementer2 = new Thread(new CounterIncrementer(counter2));

        counterIncrementer.start();
//        counterIncrementer2.start();
    }
}
