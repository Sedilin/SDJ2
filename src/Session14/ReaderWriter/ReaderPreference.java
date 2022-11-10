package Session14.ReaderWriter;

public class ReaderPreference implements ReadWrite {
    private int i;
    private int readers = 0;
    private int writers = 0;
    private int waitingReaders = 0;

    public void write() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i++;
    }

    public int read() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return i;
    }
    public synchronized void acquireRead() {
        waitingReaders++;
        while (writers > 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        waitingReaders--;
        readers++;
    }

    public synchronized void releaseRead() {
        readers--;
        if (readers == 0) {
            notify(); // notify one waiting writer
        }
    }
    public synchronized void acquireWrite()
    {
        while (readers > 0 || writers > 0 || waitingReaders > 0)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        writers++;
    }
    public synchronized void releaseWrite()
    {
        writers--;
        notifyAll(); // notify all waiting readers
    }
}
