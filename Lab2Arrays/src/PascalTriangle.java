public class PascalTriangle {
    private int triangleSize;
    private int[][] triangleMatrix; // создаём квадратную матрицу

    public PascalTriangle(int size) {
        triangleSize = size;
        triangleMatrix = new int[size][size];
        for (int rows = 0; rows < size; rows++) {
            for (int cols = 0; cols < size; cols++) {
                triangleMatrix [rows][cols] = 0; // заполняем её нолями
            }
        }

        for (int rows = 0; rows < size; rows++) {
            triangleMatrix[rows][0] = 1; // инициализируем 0 колонку единицами
        }
        for (int rows = 1; rows < size; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                triangleMatrix[rows][cols] = triangleMatrix[rows-1][cols] + triangleMatrix[rows-1][cols-1];
            }
        }
    }
    public PascalTriangle () {
        this(10); // по умолчанию инициализируем стороной в 10 единиц
    }

    // METHODS
    public void printTriangle() {
        for (int r = 0; r < this.triangleSize; r++) {
            String line = "";
            for (int c = 0; c <= r; c++) {
                line += triangleMatrix [r] [c] + "\t";
            }
            System.out.println(line);
        }
    }
}
