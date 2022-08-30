package PhoneWithState;

public class SilentState implements PhoneState{
    @Override
    public void onReceiveMessage(String txt, Phone phone) {
        System.out.println(txt);
    }

    @Override
    public void onReceiveCall(Phone phone) {}

    @Override
    public void onVolumeButtonUp(Phone phone) {
        int vol = phone.getVolume();
        //Why is it not necessary to check whether we are on sound or not?
        if(vol < 100) {
            phone.turnVolumeUp();
        }
    }

    @Override
    public void onVolumeButtonDown(Phone phone) {
        phone.setState(new VibrateState());
    }
}
