package Session2.Sleep;

public class PrintNumber implements Runnable{
    
    private int howLong;
    
    public PrintNumber(int howLong)
    {
        this.howLong = howLong;
    }
    @Override
    public void run() {
        for (int i = 1; i < howLong+1; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
