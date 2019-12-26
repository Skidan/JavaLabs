/*
Точка
| x, y
|
Квадрат
| | x, y, l1
| |
| Ромб
| | x, y, l1, a1
| |
| Треугольник
|   x, y, l1, a1, a2
|
Прямоугольник
| x, y, l1, l2
|
Трапеция
| x, y, l1, a1, l2, a2
|
Четырехугольник
  x, y, l1, a1, l2, a2, l3, a3
*/

public class Main {
    public static void main(String[] args) {
    Figure dot = new Point();
    dot.printInfo();

    Figure quadrat = new Square(5,8,15);
    quadrat.printInfo();

    Figure quad2 = new Square();
    quad2.printInfo();

    Figure rombikus = new Rhomb();
    rombikus.printInfo();
}
}
abstract class Figure {
    public String className() {
        return this.getClass().getSimpleName();
    }

    abstract void printInfo();

    abstract void move(double toX, double toY);

    abstract void move(); // возврат в начало координат.

    // Далее - оверрайд изменения масштаба.
    // Можно, конечно, изменение размеров фигуры понимать
    // именно как изменение линейных размеров, а не масштаба,
    // но тогда уж точно интерфейсом делать надо.
    // Иначе это неэффективно, как копание траншей чайной ложкой.
    // Так как в задании написано чётко - СИСТЕМА КЛАССОВ,
    // то будем именно оверрайдить масштаб,
    // а не перегружать линейные параметры каждой фигуры:
    abstract void scale(double scale);
}