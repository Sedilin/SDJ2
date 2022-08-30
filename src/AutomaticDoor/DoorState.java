package AutomaticDoor;

public interface DoorState {
    void press(Door door);

    void complete(Door door);
}
