package turtle;

public class Canvas {

    private int height;
    private int width;

    private char[][] field;

    public Canvas(int height, int width) {
        this.height = height;
        this.width = width;

        field = new char[height][width];
        fillField();
    }

    private void fillField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = '.';
            }
        }
    }

    public void setStep(int row, int col, char symbol) {
        if (symbol == '*') {
            field[row][col] = symbol;
        }
    }

    public void print() {
        for (char[] innerArray : field) {
            for (char element : innerArray) {
                System.out.print(element);
            }
            System.out.println();
        }
    }

}
