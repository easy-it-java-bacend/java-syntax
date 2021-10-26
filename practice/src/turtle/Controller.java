package turtle;

import java.util.Scanner;

public class Controller {

    private static Scanner scan;
    private static Canvas canvas;
    private static Turtle turtle;

    private static String cmd;
    private static int steps;

    public static void main(String[] args) {
        run();
    }

    private static void init() {
        scan = new Scanner(System.in);
        canvas = new Canvas(20, 20);
        turtle = new Turtle(canvas, Turtle.EAST, 0, 0);
    }

    public static void run() {
        init();

        while (true) {
            readUserCommand();
            switch (cmd) {
                case "move":
                    turtle.move(steps);
                    break;

                case "turnleft":
                    turtle.turnLeft();
                    break;

                case "turnright":
                    turtle.turnRight();
                    break;

                case "print":
                    canvas.print();
                    break;

                case "stop":
                    return;

                case "startdrawing":
                    turtle.startDrawing();
                    break;

                case "stopdrawing":
                    turtle.stopDrawing();
                    break;
            }
        }
    }

    private static void readUserCommand() {
        String command = scan.nextLine().trim().toLowerCase(); // print
        String[] parts = command.split("\\s+"); // {"print"}

        if (parts.length == 1) {
            switch (command) {
                case "turnleft":
                case "turnright":
                case "print":
                case "stop":
                case "startdrawing":
                case "stopdrawing":
                    cmd = command;
                    return;

                default:
                    throw new RuntimeException("Invalid command: " + command);
            }
        } else if (parts.length == 2 && parts[0].equals("move")) {
            steps = Integer.parseInt(parts[1]);
            cmd = parts[0];
            return;
        }
        throw new RuntimeException("Invalid command: " + command);
    }
}
