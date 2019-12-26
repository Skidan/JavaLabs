public class Main {
    public static void main(String[] args) {

    Figure quadrat = new Square(5,8,15);
    quadrat.printInfo();
    }
}

abstract class Figure {
    abstract void printInfo();
    abstract void move(double toX, double toY);
    abstract void move();
    abstract void change();
    public String className() {return this.getClass().getSimpleName();}
}

//public class Rhomb extends Square {
//    public void printInfo() {
//        //
//    }
//    public void move() {
//        //
//    }
//    public void change() {
//        //
//    }
//}
//
//public class Parallelogramm extends Rhomb {
//    public void printInfo() {
//        //
//    }
//    public void move() {
//        //
//    }
//    public void change() {
//        //
//    }
//}
//
//public class Rectangle extends Square {
//    public void printInfo() {
//        //
//    }
//    public void move() {
//        //
//    }
//    public void change() {
//        //
//    }
//}
//public class Trapeze extends Parallelogramm {
//    public void printInfo() {
//        //
//    }
//    public void move() {
//        //
//    }
//    public void change() {
//        //
//    }
//}
//public class Tetragon extends Trapeze {
//    public void printInfo() {
//        //
//    }
//    public void move() {
//        //
//    }
//    public void change() {
//        //
//    }
//}
//public class Triangle extends Trapeze {
//    public void printInfo() {
//        //
//    }
//    public void move() {
//        //
//    }
//    public void change() {
//        //
//    }
//}