package marsRover;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter grid size (width height): ");
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        Grid grid = new Grid(width, height);
        
        System.out.println("Enter starting position (x y direction): ");
        int startX = scanner.nextInt();
        int startY = scanner.nextInt();
        String directionStr = scanner.next();
        Direction startDirection = Direction.valueOf(directionStr.toUpperCase());
        Position startPosition = new Position(startX, startY, startDirection);
        
        System.out.println("Enter number of obstacles: ");
        int numObstacles = scanner.nextInt();
        System.out.println("Enter obstacles (x y): ");
        for (int i = 0; i < numObstacles; i++) {
            int obstacleX = scanner.nextInt();
            int obstacleY = scanner.nextInt();
            grid.addObstacle(new Position(obstacleX, obstacleY, null));
        }
        
        System.out.println("Enter commands (sequence of M L R): ");
        String commandsStr = scanner.next();
        List<Command> commands = new ArrayList<>();
        for (char c : commandsStr.toCharArray()) {
            switch (c) {
                case 'M':
                    commands.add(new MoveCommand());
                    break;
                case 'L':
                    commands.add(new TurnLeftCommand());
                    break;
                case 'R':
                    commands.add(new TurnRightCommand());
                    break;
                default:
                    System.out.println("Invalid command: " + c);
                    break;
            }
        }
        
        MarsRover rover = new MarsRover(startPosition, grid);
        rover.executeCommands(commands.toArray(new Command[0]));
        
        System.out.println(rover.statusReport());
        
        scanner.close();
    }
}
