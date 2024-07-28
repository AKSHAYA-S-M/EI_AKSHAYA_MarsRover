package marsRover;

public class MarsRover {
    private Position position;
    private final Grid grid;
    
    public MarsRover(Position startPosition, Grid grid) {
        this.position = startPosition;
        this.grid = grid;
    }
    
    public void executeCommands(Command[] commands) {
        for (Command command : commands) {
            command.execute(this);
        }
    }
    
    public Position getPosition() {
        return position;
    }
    
    public void setPosition(Position position) {
        this.position = position;
    }
    
    public Grid getGrid() {
        return grid;
    }

    public String statusReport() {
        return "Rover is at (" + position.getX() + ", " + position.getY() + ") facing " + position.getDirection() + ".";
    }
}
