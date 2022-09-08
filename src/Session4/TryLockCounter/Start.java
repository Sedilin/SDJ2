package Session4.TryLockCounter;

public class Start {
    public static void main(String[] args) {
        TryLockCounter counter = new TryLockCounter();
        Thread incrementer1 = new Thread(new Incrementer(counter));
        Thread incrementer2 = new Thread(new Incrementer(counter));

        incrementer1.start();
        incrementer2.start();
    }
}
