package turtle;

public class Turtle {

    private Canvas canvas; // null
    private int direction; // 0 - NORTH(posRow--), 1 - EAST(col++), 2 - SOUTH(row++), 3 - WEST(col--)
    private int posRow; // 0
    private int posCol; // 0
    private boolean draw; // false

    public static final int NORTH = 0;
    public static final int EAST = 1;
    public static final int SOUTH = 2;
    public static final int WEST = 3;

    public Turtle(Canvas canvas, int direction, int posRow, int posCol) {
        this.direction = direction;
        this.posRow = posRow;
        this.posCol = posCol;

        this.canvas = canvas;
    }

    public void move(int steps) {
        for (int i = 0; i < steps; i++) {
            if (draw) {
                canvas.setStep(posRow, posCol, '*');
            }
            switch (direction) {
                case NORTH:
                    posRow--;
                    break;

                case EAST:
                    posCol++;
                    break;

                case SOUTH:
                    posRow++;
                    break;

                case WEST:
                    posCol--;
                    break;
            }
        }
    }

    public void turnRight() {
        direction = direction == WEST ? NORTH : ++direction;
    }

    public void turnLeft() {
        direction = direction == NORTH ? WEST : --direction;
    }

    public void startDrawing() {
        draw = true;
    }

    public void stopDrawing() {
        draw = false;
    }

}
