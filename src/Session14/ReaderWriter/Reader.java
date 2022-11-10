package Session14.ReaderWriter;

import java.util.Random;

public class Reader implements Runnable{

    private ReadWrite lock;

    public Reader(ReadWrite lock){
        this.lock = lock;
    }
    public void run()
    {
        while (true)
        {
            spendTime(1000, 2000);
            lock.acquireRead();
            System.out.println("Reading");
            spendTime(500,1000);
            System.out.println(lock.read());
            System.out.println("Done Reading");
            lock.releaseRead();
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
