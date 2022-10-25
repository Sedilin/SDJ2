package Session10.RobotBehaviour;


import javafx.geometry.Point2D;

public class NeutralBehaviour implements Behaviour{
    @Override
    public int moveCommand(GameBoard board, Point2D robotLocation) {
        return 0;
    }
}
