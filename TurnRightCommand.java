package marsRover;

public class TurnRightCommand implements Command {
    @Override
    public void execute(MarsRover rover) {
        Position currentPosition = rover.getPosition();
        currentPosition.setDirection(currentPosition.getDirection().turnRight());
    }
}
