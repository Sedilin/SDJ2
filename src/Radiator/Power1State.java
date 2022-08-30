package Radiator;

public class Power1State implements RadiatorState{
    private static int power = 1;

    @Override
    public void turnUp(Radiator radiator) {
        radiator.setPowerState(new Power2State());
    }

    @Override
    public void turnDown(Radiator radiator) {
        radiator.setPowerState(new OffState());
    }

    @Override
    public int getPower() {
        return power;
    }

}