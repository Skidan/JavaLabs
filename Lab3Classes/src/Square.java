public class Square extends Point {
    // FIELDS
    private double length;
    // GETTERS/SETTERS
    public void setLength(double length) {this.length = length;}
    public double getLength() {return length;}
    // CONSTRUCTORS
    public Square(double coordX, double coordY, double length) {
        super(coordX, coordY);
        setLength(length);
    }
    public Square(double length) {
        super();
        setLength(length);
    }
    public Square() {
        super();
        this.length = 20.0;
    }
    // METHODS
    @Override
    public void printInfo() {
        System.out.println("\nClass " + className() + ".\nSquare with side of " + getLength() + "\nStart point in:\n\tX: " + getCoordX() + ";\n\tY: " + getCoordY());
    }
    @Override
    public void change(double length) {
        this.length = length;
        System.out.println("The side of square is changed to " + length);
    }

    public void change() {
        //
    }
}