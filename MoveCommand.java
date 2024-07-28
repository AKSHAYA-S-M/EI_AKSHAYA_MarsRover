package marsRover;

public class MoveCommand implements Command {
    @Override
    public void execute(MarsRover rover) {
        Position currentPosition = rover.getPosition();
        Grid grid = rover.getGrid();
        
        Position newPosition = new Position(
                currentPosition.getX(),
                currentPosition.getY(),
                currentPosition.getDirection()
        );
        
        switch (currentPosition.getDirection()) {
            case N:
                newPosition.setY(currentPosition.getY() + 1);
                break;
            case S:
                newPosition.setY(currentPosition.getY() - 1);
                break;
            case E:
                newPosition.setX(currentPosition.getX() + 1);
                break;
            case W:
                newPosition.setX(currentPosition.getX() - 1);
                break;
        }
        
        if (grid.isWithinBounds(newPosition) && !grid.isObstacle(newPosition)) {
            rover.setPosition(newPosition);
        }
    }
}
