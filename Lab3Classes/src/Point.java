public class Point {
    // FIELDS
    private double coordX;
    private double coordY;

    // GETTERS/SETTERS
    public double getCoordX() {
        return coordX;
    }
    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }
    public double getCoordY() {
        return coordY;
    }
    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    // CONSTRUCTORS
    public Point(double x, double y) {
        this.coordX = x;
        this.coordY = y;
    }
    public Point() {
        this(0.0, 0.0);
    }

    // METHODS
    public void printInfo() {
        System.out.println("Point's coordinates are\n\tX: " + coordX + "\n\tY: " + coordY);
    }

    public void move(double tox, double toy) {
        this.coordX = tox;
        this.coordY = toy;
    }
    public void move() {
        this.coordX = 1.0;
        this.coordY = 1.0;
    }
}
