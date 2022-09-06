package Session1.Radiator;

public class Power3State implements RadiatorState{
    private static final int power = 3;
    Thread radiatorThread;

    public Power3State(Radiator radiator){
        radiatorThread = new Thread(new RadiatorThread(radiator));
        radiatorThread.start();
    }
    @Override
    public void turnUp(Radiator radiator) {}

    @Override
    public void turnDown(Radiator radiator) {
        radiator.setPowerState(new Power2State());
        radiatorThread.interrupt();
    }

    @Override
    public int getPower() {
        return power;
    }
}
