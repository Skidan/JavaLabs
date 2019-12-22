public class Main {
    public static void main(String[] args) {

        // Создать целый массив из 100 элементов и заполнить его простыми числами: 1, 2, 3, 7, 11, 13, 17, …
        System.out.println("\nВывод наполненного простыми числами массива из 100 ячеек: ");
        SimpleNumbersArray newArray = new SimpleNumbersArray();
        newArray.printSimpleNumbersArray();

        // Создать двумерный массив и заполнить его 1 и 0 в шахматном порядке. Вывести на экран в виде матрицы.
        System.out.println("\nВывод \"Шахматного\" массива: ");
        // System.out.println("With parameters:");
        // Chessboard newBoard = new Chessboard(3,5);
        // newBoard.printChessboardArray();
        System.out.println("\nDefault one:");
        Chessboard defaultBoard = new Chessboard();
        defaultBoard.printChessboardArray();

        // Создать "треугольный" массив из 10 строк и заполнить его биномиальными коэффициентами. Тоже вывести на экран.
        System.out.println("Вывод трекгольника Паскаля в виде матрицы биноминальных коеффициентов:");
        PascalTriangle triangle = new PascalTriangle(); // По условию задачи размер 10 единиц. Параметрически интом задаётся любой размер
        triangle.printTriangle();
    }
}
