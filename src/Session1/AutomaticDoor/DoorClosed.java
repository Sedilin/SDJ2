package Session1.AutomaticDoor;

public class DoorClosed implements DoorState{
    @Override
    public void press(Door door) {
        door.setDoorState(new DoorOpening());
    }

    @Override
    public void complete(Door door) {}
}
