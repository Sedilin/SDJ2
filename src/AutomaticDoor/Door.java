package AutomaticDoor;

public class Door {
    DoorState doorState = new DoorClosed();
    public void press()
    {
        doorState.press(this);
    }
    public void complete()
    {
        doorState.complete(this);
    }

    public void setDoorState(DoorState doorState) {
        this.doorState = doorState;
    }
}
