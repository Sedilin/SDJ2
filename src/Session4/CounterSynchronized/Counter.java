package Session4.CounterSynchronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int counter1;
    private int counter2;

    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

//    public synchronized void inc()
//    {
//        counter++;
//    }
//    public synchronized int get()
//    {
//        return counter;
//    }

    public void inc1()
    {
        synchronized (lock1)
        {
            counter1++;
        }
    }
    public int get1()
    {
        synchronized (lock1)
        {
            return counter1;
        }
    }
    public void inc2()
    {
        synchronized (lock2)
        {
            counter2++;
        }
    }
    public int get2()
    {
        synchronized (lock2)
        {
            return counter2;
        }
    }
}
