package PhoneWithState;

public class PhoneStateTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.receiveCall();

        phone.goToSilentState();
        phone.receiveCall();

        phone.goToVibrateState();
        phone.receiveCall();
    }
}
