package marsRover;

public class TurnLeftCommand implements Command {
    @Override
    public void execute(MarsRover rover) {
        Position currentPosition = rover.getPosition();
        currentPosition.setDirection(currentPosition.getDirection().turnLeft());
    }
}
