package Session10.RobotBehaviour;


import javafx.geometry.Point2D;

public class Robot {
    private String name;
    private Behaviour behaviourStrategy;
    GameBoard board;

    public Robot(GameBoard board, String name)
    {
        this.board = board;
        this.name = name;
    }

    public Behaviour getBehaviourStrategy()
    {
        return behaviourStrategy;
    }
    public void setBehaviourStrategy(Behaviour behaviour)
    {
        behaviourStrategy = behaviour;
    }

    public void move()
    {
        behaviourStrategy.moveCommand(board, new Point2D(2, 3));
        System.out.println("The robot moved.");
        System.out.println(behaviourStrategy.moveCommand(board, new Point2D(2,3)));
    }

}
