package AutomaticDoor;

public class DoorClosing implements DoorState{
    @Override
    public void press(Door door) {
        door.setDoorState(new DoorOpening());
    }

    @Override
    public void complete(Door door) {
        door.setDoorState(new DoorClosed());
    }
}
