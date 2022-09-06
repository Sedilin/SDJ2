package Session1.Radiator;

public class RadiatorThread implements Runnable{
    private final Radiator radiator;
    public RadiatorThread(Radiator radiator)
    {
        this.radiator = radiator;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(10000);
            radiator.turnDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
