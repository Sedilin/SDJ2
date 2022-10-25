package Session10.RobotBehaviour;


import javafx.geometry.Point2D;

public interface Behaviour {
    int moveCommand(GameBoard board, Point2D robotLocation);
}
