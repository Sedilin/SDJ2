package Radiator;

public class Power3State implements RadiatorState{
    private static int power = 3;

    @Override
    public void turnUp(Radiator radiator) {}

    @Override
    public void turnDown(Radiator radiator) {
        radiator.setPowerState(new Power1State());
    }

    @Override
    public int getPower() {
        return power;
    }
}
