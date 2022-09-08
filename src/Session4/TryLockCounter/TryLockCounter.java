package Session4.TryLockCounter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockCounter {
    private int counter;
    private final Lock lock = new ReentrantLock();

    public void inc() throws InterruptedException {
        if (lock.tryLock())
        {
            counter++;
            lock.unlock();
        }
        else
        {
            Thread.sleep(1);
            if (lock.tryLock())
            {
                counter++;
                lock.unlock();
            }
        }
    }
    public synchronized int get()
    {
        return counter;
    }
}
