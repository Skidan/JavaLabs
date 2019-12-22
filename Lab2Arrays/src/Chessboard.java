
public class Chessboard {
    // FIELDS
    private int columns, rows;
    private int[][] chessArray;

    // CONSTRUCTORS
    public Chessboard(int cols, int rows) {
        this.columns = cols;
        this.rows = rows;
        chessArray = new int[this.rows][this.columns];

        for (int r = 0; r < this.rows; r++) {
            for (int c = 0; c < this.columns; c++) {
                chessArray[r][c] = ((r+2)%2)^((c+2)%2); // even||odd XOR even||odd
            }
        }
    }

    public Chessboard() {
        this(8,6); // Default preset
    }

    // METHODS
    public void printChessboardArray () {
        for (int r = 0; r < this.rows; r++) {
            String line = "";
            for (int c = 0; c < this.columns; c++) {
                line += chessArray [r] [c] + "\t";
            }
            System.out.println(line);
        }
    }
}