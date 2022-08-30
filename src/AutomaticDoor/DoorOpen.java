package AutomaticDoor;

public class DoorOpen implements DoorState{

    @Override
    public void press(Door door) {
        door.setDoorState(new DoorClosing());
    }

    @Override
    public void complete(Door door) {}
}
