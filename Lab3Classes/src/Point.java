public class Point extends Figure {
    // FIELDS
    private double coordX;
    private double coordY;
    // GETTERS/SETTERS
    public double getCoordX() {return coordX;}
    public void setCoordX(double coordX) {this.coordX = coordX;}
    public double getCoordY() {return coordY;}
    public void setCoordY(double coordY) {this.coordY = coordY;}
    // CONSTRUCTORS
    public Point(double x, double y) {
        this.coordX = x;
        this.coordY = y;
        System.out.println("Point created from point constructor;");
    }
    public Point() {
        this(0.0, 0.0);
        System.out.println("Point created from default point constructor;");
    }
    // METHODS
    @Override
    public void printInfo() {
        System.out.println("\nClass " + className() + ".\nStarting point's coordinates are\n\tX: " + coordX + "\n\tY: " + coordY);
    }
    @Override
    public void move(double toX, double toY) {
        setCoordX(toX);
        setCoordY(toY);
        System.out.println("\nMoved to new coordinates. X: " + getCoordX() + "; Y: " + getCoordY());
    }
    @Override
    public void move() {
        setCoordX(0.0);
        setCoordY(0.0);
        System.out.println("\nMoved to default coordinates. X: 0; Y: 0;");
    }
//    @Override
//    public void change(double coordX, double coordY) {
//        System.out.println("Changing the " + className() + " properties. Calling \"move\" function...");
//        move(coordX, coordY);
//    }
    @Override
    public void change() {
        System.out.println("Changing the " + className() + " properties. Calling \"move\" function with defaults...");
        move();
    }
}