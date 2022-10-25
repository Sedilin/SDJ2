package Session10.RobotBehaviour;

public class RobotTest {
    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        Robot robot = new Robot(board, "Robot");
        Behaviour behaviour;

        robot.setBehaviourStrategy(behaviour = new NeutralBehaviour());

        robot.move();
    }
}
