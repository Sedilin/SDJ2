package Session2.Bear;

public class PokingMan implements Runnable{

    private Thread bearThread;

    public PokingMan(Thread bearThread)
    {
        this.bearThread = bearThread;
    }

    @Override
    public void run() {
        System.out.println("Man is walking");
        System.out.println("Man sees a bear, wishes to poke a bear");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Lol");
        }
        //Touches a bear
        bearThread.interrupt();
        System.out.println("RIP");
    }
}
