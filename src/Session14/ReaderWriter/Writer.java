package Session14.ReaderWriter;

public class Writer implements Runnable{

    private ReadWrite lock;

    public Writer(ReadWrite lock) {
        this.lock = lock;
    }

    public void run()
    {
        while (true)
        {
            spendTime(1000, 2000);
            lock.acquireWrite();
            System.out.println("Writing");
            spendTime(3000,4000);
            lock.write();
            System.out.println("Done writing");
            lock.releaseWrite();
        }
    }
    private void spendTime(int min, int max)
    {
        long time = (long)(Math.random() * (max - min) + min);
        try
        {
            Thread.sleep(time);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
