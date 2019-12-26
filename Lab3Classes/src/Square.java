public class Square extends Point {

    // FIELDS
    private double length01;

    // GETTERS/SETTERS
    public void setLength01(double length) {this.length01 = length;}
    public double getLength01() {return length01;}

    // CONSTRUCTORS
    public Square(double coordX, double coordY, double length) {
        super(coordX, coordY);
        setLength01(length);
    }
    public Square(double length) {
        super();
        setLength01(length);
    }
    public Square() {
        super();
        setLength01(20.00);;
    }

    // METHODS
    @Override
    public void printInfo() {
        System.out.println("\nClass " + className() + ".\nSquare with side of " + getLength01() + "\nStart point in:\n\tX: " + getCoordX() + ";\n\tY: " + getCoordY());
    }
    // MOVE method inherited from POINT class
    @Override
    public void scale(double scale) {
        this.length01 *= scale;
        System.out.println("The side of square is changed to " + length01);
    }
}