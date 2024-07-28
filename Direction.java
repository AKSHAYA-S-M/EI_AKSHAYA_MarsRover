package marsRover;

public enum Direction {
    N, E, S, W;

    public Direction turnLeft() {
        return values()[(ordinal() + 3) % 4];
    }

    public Direction turnRight() {
        return values()[(ordinal() + 1) % 4];
    }

    @Override
    public String toString() {
        switch (this) {
            case N: return "North";
            case E: return "East";
            case S: return "South";
            case W: return "West";
            default: return "";
        }
    }
}
