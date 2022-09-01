package Session1.AutomaticDoor;

public class DoorOpening implements DoorState{
    @Override
    public void press(Door door) {}

    @Override
    public void complete(Door door) {
        door.setDoorState(new DoorOpen());
    }
}
